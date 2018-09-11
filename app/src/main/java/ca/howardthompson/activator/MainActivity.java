package ca.howardthompson.activator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import ca.howardthompson.rxdialog.DialogEvent;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;

public class MainActivity extends AppCompatActivity {


    private CompositeDisposable disposables = null;

    final String SERVER_PATH = "https://www.yourserver.com";
    final String APP_NAME = "yourappname"; // Spaces seem to be a problem on the PHP side
    final int PRODUCER_ID = 0;



    public Boolean getResultDisplayed() {
        return resultDisplayed;
    }

    public void setResultDisplayed(Boolean resultDisplayed) {
        this.resultDisplayed = resultDisplayed;
    }

    Exception errorOccurred = null;

    public Exception getError() {
        return errorOccurred;
    }

    public void setError(Exception e) {
        errorOccurred = e;
    }

    Boolean resultDisplayed = false;


    Activator theActivator = null;

    void leave() {
        if(android.os.Build.VERSION.SDK_INT >= 21)
        {
            finishAndRemoveTask();
        }
        else
        {
            finish();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    Observable<DialogEvent> displayMsg(final String msg, boolean completeOnDismiss, boolean doSubscribe, boolean terminateOnComplete) {
        if (Constants.debug) Log.d(Constants.TAG, "Display Dialog [" + msg + "]");

        Observable<DialogEvent> tmp = theActivator.WarningDialog(MainActivity.this, msg, completeOnDismiss);
        tmp = tmp.doOnError(new io.reactivex.functions.Consumer<Throwable>() {
            @Override
            public void accept(Throwable t) {
                if (Constants.debug) Log.d(Constants.TAG,"Display Msg onError [" + msg + "]" + "[" + t.getMessage() + "]");
            }
        });

        if (terminateOnComplete)
            tmp = tmp.doOnComplete(new io.reactivex.functions.Action() {
                              public void run() throws Exception {
                                    if (Constants.debug) Log.d(Constants.TAG,"Display Msg onComplete [" + msg + "]" );
                                    if (progBar != null) {
                                        progBar.setVisibility(View.GONE);
                                        progBar.getParent().bringChildToFront(progBar);
                                        progBar.requestFocus();
                                    }

                                    leave();
                              }
                          }
            );

        if (doSubscribe)
            disposables.add(tmp.subscribe());

        return tmp;
    }


    Observable<DialogEvent> successOrFailMsg(boolean success, boolean doSubscribe,
                                             boolean terminateOnComplete) {
        Observable<DialogEvent> obWarn;
        if (success) {
            if (Constants.debug) Log.d(Constants.TAG, "Yes, fire it up");
            obWarn = displayMsg("Looks successful", true, doSubscribe, terminateOnComplete);
        } else {
            if (Constants.debug) Log.d(Constants.TAG, "No, do not fire it up [" + theActivator.getFailureString() + "]");
            String msg;

            if (theActivator.getFailureCode() != 0) {
                msg ="Failed Activation [" + theActivator.getFailureString() + "]";
            } else {
                msg = "Activation Cancelled";
            }
            obWarn = displayMsg(msg, true, doSubscribe, terminateOnComplete);
        }

        setResultDisplayed(true);
        return obWarn;
    }


    void displayError(String msg, Exception e, boolean doSubscribe,boolean terminateOnComplete ) {

        if (Constants.debug) Log.d(Constants.TAG, msg + " [" + e.toString() + " " + Log.getStackTraceString(e) + "]");
        setResultDisplayed(true);
        Observable<DialogEvent> tmp = displayMsg(msg + " [" + e.toString() + "]", true, doSubscribe, terminateOnComplete);
            tmp.doOnError(new io.reactivex.functions.Consumer<Throwable>() {
            @Override
            public void accept(Throwable t) {
                if (Constants.debug) Log.d(Constants.TAG, "Problem displaying error [" + t.toString() + "]");
            }
        })
        .take(1);
    }

    ProgressBar progBar = null;

    @Override
    protected void onResume() {
        super.onResume();

        Constants.setDebug(BuildConfig.DEBUG);


        RxJavaPlugins.setErrorHandler(new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                if (Constants.debug) Log.d(Constants.TAG, "MainActivity PlugIn Error [" + throwable.getMessage() + "]");
            /*
            We have doOnErrors on each Observable and can capture seemingly all these
            events. But, when an error occurs, such as passing up an OKHttp IO error, it is properly
            passed up BUT it also ends up here as well. In theory this may be just part of hierarchy.
            We are handling the error in the doOnError and just logging the error here.
             */

            }
        });


        try {

            theActivator = new Activator(this);

            disposables = new CompositeDisposable();
            theActivator.setCompDisposal(disposables);
            setResultDisplayed(false);

            progBar = (ProgressBar) findViewById(R.id.progressBar);
            if (progBar.getVisibility() == View.GONE) {
                progBar.setVisibility(View.VISIBLE);
                progBar.getParent().bringChildToFront(progBar);
                progBar.getParent().recomputeViewAttributes(progBar);
                progBar.requestFocus();
                progBar.invalidate();
            }

            Observable<Boolean> ob =
                    theActivator.startAppOrNot(this, SERVER_PATH, APP_NAME, PRODUCER_ID, R.drawable.ic_android_black_24dp )
                    .take(1)
                    .doOnNext(
                        new io.reactivex.functions.Consumer<Boolean>() {
                            public void accept(Boolean fireUp) throws Exception {
                                successOrFailMsg(fireUp, true, true);
                            }
                        })
                    .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable t) {
                            setError((Exception)t);
                        }
                    })
                    .observeOn(AndroidSchedulers.mainThread())
                            .doAfterTerminate(new io.reactivex.functions.Action() {
                                public void run() throws Exception {
                                    if (Constants.debug) Log.d(Constants.TAG,"MainActivity After Terminate");

                                    if (getError() != null) {
                                        Exception tmpE = getError();
                                        if (tmpE instanceof java.net.UnknownHostException) {
                                            displayMsg("No, do not fire it up [validation not possible due to the internet not being available]", true, true, true);
                                        } else
                                            displayMsg("No, do not fire it up due to an error [" + getError().getMessage() + "]", true, true, true);

                                    } else
                                    if (!getResultDisplayed()) {
                                        displayMsg("No, do not fire it up [ user hit back ]", true, true, true);
                                    }
                                }
                            })
                    .doOnComplete(new io.reactivex.functions.Action() {
                                      public void run() throws Exception {
                                          if (Constants.debug) Log.d(Constants.TAG,"MainActivity OnComplete");
                                      }

                                  });
                    disposables.add(ob.subscribe());

        } catch (Exception e) {
            displayError("Activation Failed due to an error", e, true, true);
      }
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (theActivator != null)
            theActivator.doDispose();
        disposables = null;

    }


    @Override
    protected void onStop() {
        super.onStop();
        if (theActivator != null)
            theActivator.doDispose();
        disposables = null;
    }
}
