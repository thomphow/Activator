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
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by howard on 4/18/2017.
 */

class BackEnd {

/*
This class sends http requests to the back end server asynchronously and returns
an Observable.
 */


    private static Observable<Bundle> sendRequest(final Activator theActivator, final String action, final Bundle parms)  {

        Observable<Bundle> theOb;

        try {
            final OkHttpClient okHttpClient = new OkHttpClient();

            final Disposable disp;

            Observable<Integer> intOb = Observable.create(new ObservableOnSubscribe<Integer>() {

                @Override
                public void subscribe(final ObservableEmitter<Integer> em) throws Exception {
                }});

            intOb = intOb.observeOn(AndroidSchedulers.mainThread())
                    .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable t) {
                            Log.d(Constants.TAG,"doOnError in Main [" + t.toString() + "]");
                        }
                        })

                    .doFinally(new io.reactivex.functions.Action() {
                        public void run() throws Exception {
                            Log.d(Constants.TAG, "doOnFinally in Main");

                        }
                    })
                    .doOnComplete(new io.reactivex.functions.Action() {
                        public void run() throws Exception {
                            Log.d(Constants.TAG, "doOnComplete in Main");

                        }
                    });

            disp = intOb.subscribe();

            theActivator.getCompDisposal().add(disp);

            Headers.Builder hBuilder = new Headers.Builder();

            hBuilder.add("action", action);
            hBuilder.add("producerid", "" + theActivator.getProducerId());
            hBuilder.add("appname", theActivator.getAppName());

            for (String key : parms.keySet()) {
                try {
                    hBuilder.add(key, parms.get(key).toString());
                } catch (Exception e) {
                    // Ignore NullPointerException if it ever occurs.
                }
            }

            Headers realHeader = hBuilder.build();

            Request.Builder builder = new Request.Builder();
            final Request request = builder.url(theActivator.getBackendURL())
                    .headers(realHeader).build();

            final Observable<Integer> tmpOb = intOb;

            theOb = Observable.create(new ObservableOnSubscribe<Bundle>() {

                @Override
                public void subscribe(final ObservableEmitter<Bundle> em) throws Exception {
                okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
                    @Override
                    public void onFailure(final okhttp3.Call call, IOException e) {
                        tmpOb.unsubscribeOn(AndroidSchedulers.mainThread());
                        em.onError(e);
                    }


                    @Override
                    public void onResponse(okhttp3.Call call, final Response response) throws IOException
                    {
                        tmpOb.unsubscribeOn(AndroidSchedulers.mainThread());
                        String res = response.body().string();

                        if (!response.isSuccessful()) {
                            em.onError(new Exception("Failing response body [" + res + "] headers [" + response.headers().toString() + "]"));
                        } else {
                            Bundle bun = new Bundle();
                            Headers responseHeaders = response.headers();
                            Log.d(Constants.TAG, "action =" +  action);
                            int limit = responseHeaders.size();
                            for (int i = 0; i < limit; i++) {
                                Log.d(Constants.TAG, "Activator response[" + i + "]=" + responseHeaders.name(i) + ": " + responseHeaders.value(i));
                                bun.putString(responseHeaders.name(i), responseHeaders.value(i));
                            }

                            //Add original parameters to the returned values.
                            for (String key : parms.keySet()) {
                                try {
                                    bun.putString(key, parms.get(key).toString());
                                } catch (Exception e) {
                                    // Ignore nullpointer exception if it occurs
                                }
                            }

                            em.onNext(bun);

                            em.onComplete();
                        }
                    }
                });
            }})
                    .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable t) {
                            Log.d(Constants.TAG, "Request failed [" + t.toString() + "]" );
                        }
                    });

            } catch (Exception e) {

            return Observable.error(e);
            }
        
        return theOb;
    }

    static Observable<Boolean> CheckUniqueidPresent(final Context con, final Activator theActivator)  {
        if (theActivator.getUniqueId(con).equals("")) {
            return Observable.error(new Exception("Unique Id found to be empty string."));
        }
        Bundle bun = new Bundle();
        bun.putString(Globals.KEY_UNIQUEID, theActivator.getUniqueId(con));
        return BackEnd.sendRequest(theActivator, "checkuidpresent", bun)
                .subscribeOn(Schedulers.io())
                .map(new Function<Bundle, Boolean>() {
                    @Override
                    public Boolean apply(Bundle bun) {
                        boolean success = theActivator.isResponseSuccess(bun);

                          if (success) {
                              theActivator.setActivated(con,true);
                              if (theActivator.hasExpirationTime(bun))
                                theActivator.setExpirationTime(con,theActivator.getExpirationTime(bun));
                              if (theActivator.hasLevel(bun))
                                theActivator.setLevel(con,theActivator.getLevel(bun));
                              theActivator.setUniqueId(con,bun.getString(Globals.KEY_UNIQUEID));//Stores in Prefs
                              String userId = bun.getString(Globals.KEY_USERID);
                              if (userId != null)
                              if (!userId.equals("")) {
                                  theActivator.setActivationUserid(con,userId);//Stores in Prefs
                              }
                          }
                        return success;
                    }})
                .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable t) {
                        Log.d(Constants.TAG, "Request [checkuidpresent] failed [" + t.toString() + "]" );
                    }
                });
    }

    static Observable<Boolean> Update(final Context con, final Activator theActivator)  {
        Bundle bun = new Bundle();
        bun.putString(Globals.KEY_UNIQUEID, theActivator.getUniqueId(con));
        bun.putString(Globals.KEY_USERID, theActivator.getActivationUserId(con));
        return BackEnd.sendRequest(theActivator, "update", bun)
                .subscribeOn(Schedulers.io())
                .map(new Function<Bundle, Boolean>() {
                    @Override
                    public Boolean apply(Bundle bun) {
                        boolean success = theActivator.isResponseSuccess(bun);

                        if (success) {
                            theActivator.setActivated(con,theActivator.isActivated(bun));
                            if (theActivator.hasExpirationTime(bun))
                                theActivator.setExpirationTime(con,theActivator.getExpirationTime(bun));
                            if (theActivator.hasLevel(bun))
                                theActivator.setLevel(con,theActivator.getLevel(bun));
                        }

                        return success;
                    }
                })
                .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable t) {
                            Log.d(Constants.TAG, "Request [update] failed [" + t.toString() + "]" );
                        }
        });
    }

    static Observable<Boolean> Activate(final Context con, final Activator theActivator)  {
        String uniqueId = theActivator.getUniqueId(con);
        if (uniqueId.equals("")) {
            uniqueId = theActivator.calcUniqueId(con);
        }

        Bundle bun = new Bundle();
        bun.putString(Globals.KEY_UNIQUEID, uniqueId);
        bun.putString(Globals.KEY_USERID, theActivator.getUserId());
        bun.putString("activationcode", theActivator.getActivationCode());
        bun.putString(Globals.KEY_DEVICE_INFO, theActivator.getDeviceInfoString(con));
        return BackEnd.sendRequest(theActivator,"activate", bun)
                .subscribeOn(Schedulers.io())
                .map(new Function<Bundle, Boolean>() {
                    @Override
                    public Boolean apply(Bundle bun) {
                        boolean success = theActivator.isResponseSuccess(bun);

                        if (success) {
                            theActivator.setActivated(con,true);
                            theActivator.setValidationTS(con);
                            if (theActivator.hasExpirationTime(bun))
                                theActivator.setExpirationTime(con,theActivator.getExpirationTime(bun));
                            if (theActivator.hasLevel(bun))
                                theActivator.setLevel(con, theActivator.getLevel(bun));
                            theActivator.setUniqueId(con,bun.getString(Globals.KEY_UNIQUEID));//Stores in Prefs
                            String userId = bun.getString(Globals.KEY_USERID);
                            if (!"".equals(userId)) {
                                theActivator.setActivationUserid(con,userId);//Stores in Prefs
                            }
                        } else {

                           theActivator.setGlobalFailureCode(theActivator.getResponseFailureCode(bun));
                        }
                        return success;
                    }
                })
                .doOnError(new io.reactivex.functions.Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable t) {
                        Log.d(Constants.TAG, "Request [activationcode] failed [" + t.toString() + "]" );
                    }
                });
    }

}
