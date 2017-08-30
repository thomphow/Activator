/*
 * This open source product is derived from the DroidActivator project developed by
 * algos.it. See https://code.google.com/archive/p/droidactivator/,
 * http://www.droidactivator.org/ and https://github.com/sferrol/droidactivator
 *
 * The https://github.com/sferrol/droidactivator version was used as the initial code base.
 * Please review the documentation on these sites for the installation of the backend PHP code.
 */


/*
       GNU LESSER GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.


  This version of the GNU Lesser General Public License incorporates
the terms and conditions of version 3 of the GNU General Public
License, supplemented by the additional permissions listed below.

  0. Additional Definitions.

  As used herein, "this License" refers to version 3 of the GNU Lesser
General Public License, and the "GNU GPL" refers to version 3 of the GNU
General Public License.

  "The Library" refers to a covered work governed by this License,
other than an Application or a Combined Work as defined below.

  An "Application" is any work that makes use of an interface provided
by the Library, but which is not otherwise based on the Library.
Defining a subclass of a class defined by the Library is deemed a mode
of using an interface provided by the Library.

  A "Combined Work" is a work produced by combining or linking an
Application with the Library.  The particular version of the Library
with which the Combined Work was made is also called the "Linked
Version".

  The "Minimal Corresponding Source" for a Combined Work means the
Corresponding Source for the Combined Work, excluding any source code
for portions of the Combined Work that, considered in isolation, are
based on the Application, and not on the Linked Version.

  The "Corresponding Application Code" for a Combined Work means the
object code and/or source code for the Application, including any data
and utility programs needed for reproducing the Combined Work from the
Application, but excluding the System Libraries of the Combined Work.

  1. Exception to Section 3 of the GNU GPL.

  You may convey a covered work under sections 3 and 4 of this License
without being bound by section 3 of the GNU GPL.

  2. Conveying Modified Versions.

  If you modify a copy of the Library, and, in your modifications, a
facility refers to a function or data to be supplied by an Application
that uses the facility (other than as an argument passed when the
facility is invoked), then you may convey a copy of the modified
version:

   a) under this License, provided that you make a good faith effort to
   ensure that, in the event an Application does not supply the
   function or data, the facility still operates, and performs
   whatever part of its purpose remains meaningful, or

   b) under the GNU GPL, with none of the additional permissions of
   this License applicable to that copy.

  3. Object Code Incorporating Material from Library Header Files.

  The object code form of an Application may incorporate material from
a header file that is part of the Library.  You may convey such object
code under terms of your choice, provided that, if the incorporated
material is not limited to numerical parameters, data structure
layouts and accessors, or small macros, inline functions and templates
(ten or fewer lines in length), you do both of the following:

   a) Give prominent notice with each copy of the object code that the
   Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the object code with a copy of the GNU GPL and this license
   document.

  4. Combined Works.

  You may convey a Combined Work under terms of your choice that,
taken together, effectively do not restrict modification of the
portions of the Library contained in the Combined Work and reverse
engineering for debugging such modifications, if you also do each of
the following:

   a) Give prominent notice with each copy of the Combined Work that
   the Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the Combined Work with a copy of the GNU GPL and this license
   document.

   c) For a Combined Work that displays copyright notices during
   execution, include the copyright notice for the Library among
   these notices, as well as a reference directing the user to the
   copies of the GNU GPL and this license document.

   d) Do one of the following:

       0) Convey the Minimal Corresponding Source under the terms of this
       License, and the Corresponding Application Code in a form
       suitable for, and under terms that permit, the user to
       recombine or relink the Application with a modified version of
       the Linked Version to produce a modified Combined Work, in the
       manner specified by section 6 of the GNU GPL for conveying
       Corresponding Source.

       1) Use a suitable shared library mechanism for linking with the
       Library.  A suitable mechanism is one that (a) uses at run time
       a copy of the Library already present on the user's computer
       system, and (b) will operate properly with a modified version
       of the Library that is interface-compatible with the Linked
       Version.

   e) Provide Installation Information, but only if you would otherwise
   be required to provide such information under section 6 of the
   GNU GPL, and only to the extent that such information is
   necessary to install and execute a modified version of the
   Combined Work produced by recombining or relinking the
   Application with a modified version of the Linked Version. (If
   you use option 4d0, the Installation Information must accompany
   the Minimal Corresponding Source and Corresponding Application
   Code. If you use option 4d1, you must provide the Installation
   Information in the manner specified by section 6 of the GNU GPL
   for conveying Corresponding Source.)

  5. Combined Libraries.

  You may place library facilities that are a work based on the
Library side by side in a single library together with other library
facilities that are not Applications and are not covered by this
License, and convey such a combined library under terms of your
choice, if you do both of the following:

   a) Accompany the combined library with a copy of the same work based
   on the Library, uncombined with any other library facilities,
   conveyed under the terms of this License.

   b) Give prominent notice with the combined library that part of it
   is a work based on the Library, and explaining where to find the
   accompanying uncombined form of the same work.

  6. Revised Versions of the GNU Lesser General Public License.

  The Free Software Foundation may publish revised and/or new versions
of the GNU Lesser General Public License from time to time. Such new
versions will be similar in spirit to the present version, but may
differ in detail to address new problems or concerns.

  Each version is given a distinguishing version number. If the
Library as you received it specifies that a certain numbered version
of the GNU Lesser General Public License "or any later version"
applies to it, you have the option of following the terms and
conditions either of that published version or of any later version
published by the Free Software Foundation. If the Library as you
received it does not specify a version number of the GNU Lesser
General Public License, you may choose any version of the GNU Lesser
General Public License ever published by the Free Software Foundation.

  If the Library as you received it specifies that a proxy can decide
whether future versions of the GNU Lesser General Public License shall
apply, that proxy's public statement of acceptance of any version is
permanent authorization for you to choose that version for the
Library.
 */


package ca.howardthompson.activator;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import ca.howardthompson.rxdialog.DialogDialogEvent;
import ca.howardthompson.rxdialog.DialogDismissEvent;
import ca.howardthompson.rxdialog.DialogEvent;
import ca.howardthompson.rxdialog.RxDialogBuilder;

import java.util.Calendar;
import java.util.Date;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.ReplaySubject;

import static ca.howardthompson.activator.CustomDialogs.InfoDialog;

/*
 * This file is part of Activator.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * This open source product is derived from DroidActivator project developed by
 * algos.it. See http://www.droidactivator.org/ and https://github.com/sferrol/droidactivator
 */


/**
 *  Public facing methods for the Activator library
 */

public class Activator extends Globals {

    final static String BUTTON_PRESSED = "BUTTON_PRESSED";
    final static String EMAIL_ENTER = "EMAIL_ENTER";
    final static String CODE_ENTER = "CODE_ENTER";


    private Context getTheContext() {
        return theContext;
    }

    private void setTheContext(Context theContext) {
        this.theContext = theContext;
    }

    private Context theContext = null;

    public Activator(Context con) {
        setTheContext(con);
        valuesInit(con);

    }

    private boolean UniqueIdInstalled(Context con) {
        return !getUniqueId(con).equals("");
    }


    public Observable<DialogEvent> WarningDialog(Context con, String parm, Boolean completeOnDismiss) {

        Observable<DialogEvent> dialogEventObservable =
                InfoDialog(con,
                parm, completeOnDismiss);
        if (! completeOnDismiss)
            return dialogEventObservable.take(2);
        else
            return dialogEventObservable;
    }

    //State Machine to drive everything
    private ReplaySubject<DialogEvent> stateMachine= null;

    private DialogEvent doValidation(Context con) {
        if (!isActivatedInCache(con))
            return new DialogActivationEvent();

        if (!UniqueIdInstalled(con))
            return new DialogActivationEvent();

        Boolean validationExpired = true;

        Date valDate = getValidationDate(con);

        if (valDate != null) {

            /*
            If the Validation date is after the current date then
            we don't need to re-validation the customer's information yet.
             */

            Date testDate = new Date(System.currentTimeMillis());
            if (valDate.after(testDate)) {
                validationExpired = false;
            }

            /*
            If the Validation date is after the current date plus the validation
            cycle then someone is screwing with the customer data. So, we will treat
            this as being past the validation date.
             */

            Calendar cal = Calendar.getInstance();
            cal.setTime(testDate);
            cal.add(Calendar.DATE, getValidationsDayCycle());
            testDate = cal.getTime();

            if (valDate.after(testDate)) {
                validationExpired = true;
            }
        }

        if (validationExpired) {
            if ((getFailedValidations(con) + 1) >
                    getFailedValidationsLimit()) {

                // Hmm... past validation limit but still registered... shouldn't be.
                deActivate(con, this);
                // Allow them to use temporary activation, if configured
                setFirstTempActivationTS(con, 0L);
                return new DialogPastValidationLimitEvent();
            } else
                return new DialogUpdateEvent();
        }

        return new DialogDoneEvent(true, "");

    }

    private DialogEvent doPastValidationLimit(Context con) {
        //Failed validation notice
        Observable<DialogEvent> obBadValidationMsg = InfoDialog(con,
                "Sorry, this app is past the validation time and retry limit. Please re-enter your registration code.", true)
                .doOnError(new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d(Constants.TAG, "doPastValidationLimit Problem [" + throwable.toString() + "]");
                    }
                })
                .doOnNext(
                        new Consumer<DialogEvent>() {
                            public void accept(DialogEvent event) throws Exception {
                                Log.d(Constants.TAG, "doPastValidationLimit Event [" + event.toString() + "]");
                            }
                        })
                .doOnComplete(new io.reactivex.functions.Action() {
                                  public void run() throws Exception {
                                      Log.d(Constants.TAG, "doPastValidationLimit doOnComplete");
                                      stateMachine.onNext(new DialogActivationEvent());
                                  }
                              }
                );
        getGlobalCompDisposal().add(obBadValidationMsg.subscribe());

        return new DialogIgnoreEvent();
    }

    private DialogEvent doValidationAttemptsRemain(Context con) {

        setFailedValidations(con, getFailedValidations(con) + 1);

        // We are already past the limit, deregister and re-prompt.
        if ((getFailedValidations(con) + 1) > getFailedValidationsLimit()) {
            return new DialogPastValidationLimitEvent();
        }

        // We are still within the silent validation count.
        if (getFailedValidations(con) < getSilentFailedValidationsLimit())
            return new DialogDoneEvent(true,"");

        //Attempts remaining notice
        Observable<DialogEvent> obAttemptsRemainMsg = InfoDialog(con,
                "Unable to validate registration. [" +
                        (getFailedValidationsLimit() -
                                getFailedValidations(con)) +
                        "] attempts remain before deregistration", true)
                .doOnError(new Consumer<Throwable>() {
                    @Override
                    public void accept( Throwable throwable) throws Exception {
                        Log.d(Constants.TAG, "obAttemptsRemainMsg Problem [" + throwable.toString() + "]");
                        stateMachine.onError(throwable);
                    }
                })
                .take(2)
                .map(new Function<DialogEvent, DialogEvent>() {
                    @Override
                    public DialogEvent apply(DialogEvent event) {
                        return new DialogDoneEvent(true, "");
                    }
                })
                .doOnComplete(new io.reactivex.functions.Action() {
                       public void run() throws Exception {
                           Log.d(Constants.TAG, "doValidationAttemptsRemain doOnComplete");
                           stateMachine.onNext(new DialogDoneEvent(true, ""));
                       }
                   }
                );

        getGlobalCompDisposal().add(obAttemptsRemainMsg.subscribe());

        return new DialogIgnoreEvent();
    }

    private DialogEvent doUpdate(Context con) {

        Activator theActivator = this;

        //Update activated used information
        Observable<Boolean> obUpdate = BackEnd.Update(con, theActivator)
               .doOnNext(
                new Consumer<Boolean>() {
                    public void accept(Boolean success) throws Exception {
                        boolean dbgB = success;
                        if (dbgB) {

                            if (!isActivatedInCache(getTheContext()))
                                stateMachine.onNext(new DialogActivationEvent());
                            else {
                                /*
                                Update happens when we are past the validation date.
                                So, if successful then the time stamp needs to be updated.
                                 */
                                setValidationTS(getTheContext());
                                if (getUniqueId(getTheContext()).equals(""))
                                    stateMachine.onNext(new DialogActivationEvent());
                                else {
                                    stateMachine.onNext(new DialogCheckUniqueIdEvent());
                                }
                            }
                        } else
                            // We have incremented our tries and will eventually disable
                            stateMachine.onNext(new DialogValidationFailedEvent());
                    }
                })
                .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable t) {
                        Log.d(Constants.TAG, "obUpdate failed [" + t.toString() + "]");
                        stateMachine.onError(t);
                    }
                });

        getGlobalCompDisposal().add(obUpdate.subscribe());


        return new DialogIgnoreEvent(); // Wait for async event
    }

    private DialogEvent doUnique(Context con ) {

        final Activator theActivator = this;

        if (isActivatedInCache(getTheContext())) {
            if (!getUniqueId(getTheContext()).equals("")) {
                //Confirm the ID is activated in the backend
                Observable<Boolean> obUnique = BackEnd.CheckUniqueidPresent(con, theActivator)
                        .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable t) {
                                Log.d(Constants.TAG, "obUnique failed [" + t.toString() + "]");
                                stateMachine.onError(t);
                            }
                        })
                        .doOnNext(
                                new Consumer<Boolean>() {
                                    public void accept(Boolean success) throws Exception {
                                        if (success) {

                                            if (!isActivatedInCache(getTheContext()))
                                                stateMachine.onNext(new DialogActivationEvent());
                                            else {
                                                //ah ... this is messed up... ignore
                                                if (getUniqueId(getTheContext()).equals(""))
                                                    stateMachine.onNext(new DialogActivationEvent());
                                                else {
                                                    // All is good so ...
                                                    stateMachine.onNext(new DialogCheckExpirationEvent());
                                                }
                                            }
                                        } else {
                                            // We have incremented our tries and will eventually disable
                                            stateMachine.onNext(new DialogValidationFailedEvent());
                                        }
                                    }
                                });

                getGlobalCompDisposal().add(obUnique.subscribe());

                return new DialogIgnoreEvent();
            } else {
                deActivate(getTheContext(), this);
                Log.d(Constants.TAG,"Activated but unique Id found to be empty.");
            }
        }
        return new DialogActivationEvent();
    }

    private DialogEvent doExpiredCheck(Context con) {
        // If registration has expired, de activate
        if (isActivatedInCache(con)) {
            Date expDate = getExpirationDate(con);
            if (expDate != null) {
                Date currentDate = new Date(System.currentTimeMillis());
                if (expDate.before(currentDate)) {
                    deActivate(con, this);
                    return new DialogExpiredMsgEvent();
                } else
                    return new DialogDoneEvent(true,"");  // Not expired
            } else {
                return new DialogDoneEvent(true,"");  // Not expired
                // The date is null or not there... so treat as not expiration entered
//                getInstance().deActivate();
//                return new DialogExpiredMsgEvent();
            }
        } else {
            return new DialogActivationEvent(); // Ah... not activated ...
        }
    }

    AlertDialog actDialog = null;

    private DialogEvent doActivation(Context con, Boolean expired) {
        actDialog = null;
        //Activation dialog form
        Observable<DialogEvent> obActivationForm =
                CustomDialogs.ActivationDialog(con, this,
                isTemporaryActivationAvailable(), expired )
                .observeOn(AndroidSchedulers.mainThread())
              .doOnNext(
                new Consumer<DialogEvent>() {
                    public void accept(DialogEvent event) throws Exception {
                        Log.d(Constants.TAG, "obActivationForm Event [" + event.toString() + "]");
                        if (event instanceof DialogDialogEvent) {
                            actDialog = ((DialogDialogEvent) event).getDialog();
                        } else
                        if (event instanceof DialogDoneEvent) {
                            if (((DialogDoneEvent) event).isSuccess()) {
                                setValidationTS(getTheContext());
                            }
                            //The Activation Dialog needs to close
                            if (actDialog != null)
                                actDialog.dismiss();
                            stateMachine.onNext(event);
                        }
                    }
                })
                .doOnError(new Consumer<Throwable>() {
                    @Override
                    public void accept( Throwable throwable) throws Exception {
                        Log.d(Constants.TAG, "obActivationForm Problem [" + throwable.toString() + "]");
                        stateMachine.onError(throwable);
                    }
                });
        getGlobalCompDisposal().add(obActivationForm.subscribe());
        return new DialogIgnoreEvent();
    }


    private DialogEvent doExpired(Context con) {
        return doActivation(con, true);
    }

    private DialogEvent doActivation(Context con) {
        return doActivation(con, false);
    }

    AlertDialog heldDialog = null;

    public Observable<Boolean>  startAppOrNot(final Context con, String backendURL, String appName,
                                              int producerId, int iconResId)
        throws Exception {

        //Init
        RxDialogBuilder.clearDialogStack();// Clear stack used to dismiss nested dialogs.... activate, warning, etc.
        setAddress(backendURL);
        setAppName(appName);
        setProducerId(producerId);
        setIconResId(iconResId);
        if (!isBackendURLValid())
            throw new Exception("Back end URL is invalid");

        //State machine
        stateMachine = ReplaySubject.create();
        stateMachine.onNext(new DialogValidationEvent());
        stateMachine
                .doOnSubscribe(new Consumer<Disposable>() {
                    public void accept(Disposable d) {
                    Log.d(Constants.TAG,"stateMachine Subscribed");

                    }
                });

        return stateMachine
                .doOnNext(
                        new Consumer<DialogEvent>() {
                            public void accept(DialogEvent event) throws Exception {
                                Log.d(Constants.TAG, "State Machine - Dialog Event [" + event.toString() + "]");

                                if (event instanceof DialogValidationEvent) {
                                    stateMachine.onNext(doValidation(getTheContext()));
                                } else

                                if (event instanceof DialogCheckExpirationEvent) {
                                    stateMachine.onNext(doExpiredCheck(getTheContext()));
                                } else

                                if (event instanceof DialogPastValidationLimitEvent) {
                                    stateMachine.onNext(doPastValidationLimit(con));
                                } else

                                if (event instanceof DialogUpdateEvent) {
                                    stateMachine.onNext(doUpdate(con));
                                } else

                                if (event instanceof DialogValidationFailedEvent) {
                                    stateMachine.onNext(doValidationAttemptsRemain(con));
                                } else

                                if (event instanceof DialogCheckUniqueIdEvent) {
                                    stateMachine.onNext(doUnique(con));
                                } else

                                if (event instanceof DialogExpiredMsgEvent) {
                                    stateMachine.onNext(doExpired(con));
                                } else

                                if (event instanceof DialogActivationEvent) {
                                    stateMachine.onNext(doActivation(con));
                                }

                                // return:
                                // - (event instanceof DialogIgnoreEvent)
                                // - other

                            }
                        })
                .map(new Function<DialogEvent, DialogEvent>() {
            @Override
            public DialogEvent apply(DialogEvent event) {
                return event;
            }})
            .filter(new Predicate<DialogEvent>() {
                @Override
                public boolean test(DialogEvent event) {
                    return ((event instanceof DialogDismissEvent) ||
                            (event instanceof DialogDoneEvent));
                }
            })
            .map(new Function<DialogEvent, Boolean>() {
                    @Override
                    public Boolean apply(DialogEvent event) {
                        if (event instanceof DialogDoneEvent) {
                            DialogDoneEvent tmp = (DialogDoneEvent) event;
                            setJustFailureString(tmp.getErrStr());
                        }
                        return isActivated(getTheContext());
                    }
                });
    }


    public void setCompDisposal(CompositeDisposable disposables) {
        setGlobalCompDisposal(disposables);
    }

    CompositeDisposable getCompDisposal() {
        return getGlobalCompDisposal();
    }

    public void doDispose() {
        if (getGlobalCompDisposal() != null)
            getGlobalCompDisposal().dispose();
    }

    public String getFailureString() {
        return getGlobalFailureString();
    }

    public int getFailureCode() {
        return getGlobalFailureCode();
    }

    public String getRegUserId() { return getUserId(); }

    public String getUniqueId(Context con) { return calcUniqueId( con); }

}

