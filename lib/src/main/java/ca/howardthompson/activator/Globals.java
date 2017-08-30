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
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.DisplayMetrics;
import android.view.View;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by howard on 4/17/2017.
 */

class Globals {

    public final static int ERROR_NONE = 0;
    public final static int ERROR_USERID_NOT_FOUND = 3;
    public final static int ERROR_WRONG_ACTIVATION_CODE = 1;
    public final static int ERROR_WRONG_APP_NAME = 2;

    AlertDialog getTmpDialog() {
        return tmpDialog;
    }

    void setTmpDialog(AlertDialog tmpDialog) {
        this.tmpDialog = tmpDialog;
    }

    private AlertDialog tmpDialog = null;

    //Note: there was a previous UI dialog situation where it was desirable to have access to the custom
    // view.
    public View getCustomView() {
        return customView;
    }

    void setCustomView(View customView) {
        this.customView = customView;
    }

    private View customView = null;


//    public Boolean getPosButtonExit() {
//        return posButtonExit;
//    }
//
//    public void setPosButtonExit(Boolean posButtonExit) {
//        this.posButtonExit = posButtonExit;
//    }
//
//    private Boolean posButtonExit = false;

    private String getJustFailureString() {
        return failureString;
    }

    void setJustFailureString(String failureString) {
        this.failureString = failureString;
    }

    private String failureString = "";


    int getGlobalFailureCode() {
        return failureCode;
    }

    void setGlobalFailureCode(int failureCode) {
        this.failureCode = failureCode;
    }

    private int failureCode = 0;

    private String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    // the backend address as supplied in the constructor
    private String address;

    // the application's Producer id
    private int producer_id;


    // flag to control if the Temporary Activation mechanism is available
    private boolean temporaryActivationAvailable;

    // maximum number of days activation can be delayed pressing "Later"
    private int maxActivationDelay;

    // number of seconds the user must wait before "Later" becomes enabled
    private int temporaryWaitTime;


    // number of failed validations before deregistered.
    private int failedValidationsLimit;


    // number of failed validations before dialog presented to the customer.
    private int silentFailedValidationsLimit;


    // number of days after activation to continually re-validate the registration
    private int validationsDayCycle;

    // flag turned on when a Temporary Activation is issued.
    // if this flag is on, the isActivated() method returns always true
    private boolean temporarilyActivated;

    // a view to display in the message area of the dialog instead of the default message view
    // if a custom view is specified, the custom view takes precedence over the custom text
    private View dialogCustomView;







    // keys to identify values
    // used both in bundles sent to the backend and in shared preferences
    private static String KEY_ACTIVATED = "activated";
    private static String KEY_LEVEL = "level";
    private static String KEY_EXPIRATION = "expiration";
    private static String KEY_INSTALLATION_UUID = "installation_UUID";
    static String KEY_UNIQUEID = "uniqueid";
    private static String KEY_TS_FIRST_TEMP_ACTIVATION = "first_temp_activation"; // the unix timestamp of the first Temporary Activation
    static String KEY_USERID = "userid";// the user id entered in the last full activation
//    static String KEY_EVENT_CODE = "eventcode";// the custom event code
//    static String KEY_EVENT_DETAILS = "eventdetails";// the custom event details
//    static String KEY_TRACKING_ONLY = "trackingonly";// whether to create the Activation record as Tracking Only
    static String KEY_DEVICE_INFO = "deviceinfo";// identifies device info field in a request
    private static String KEY_TS_VALIDATION = "validation";// ongoing validation time stamp
    private static String KEY_FAILED_VALIDATION = "failedvalidation";// failed validation count

    CompositeDisposable getGlobalCompDisposal() {
        return compGlobalDisposal;
    }

    void setGlobalCompDisposal(CompositeDisposable compDisposal) {
        this.compGlobalDisposal = compDisposal;
    }

    private CompositeDisposable compGlobalDisposal = null;

    void setAppName(String appName) {
        this.appName = appName;
    }

    // the app name passed to the backend, defaults to the current App Name
    private String appName = "";

    String getUserId() {
        return userId;
    }

    void setUserId(String userId) {
        this.userId = userId;
    }

    private String userId;


    String getActivationCode() {
        return activationCode;
    }

    void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    private String activationCode;


    /**
     * Control the availability of the Temporary Activation mechanism.
     *
     * @param available - true if you want it to be available to the user, false otherwise
     */
    private void setTemporaryActivationAvailable(boolean available) {
        temporaryActivationAvailable = available;
    }


    boolean isTemporaryActivationAvailable() {
        return temporaryActivationAvailable;
    }


    /**
     * Maximum number of days the user can delay activation by pressing "Later".
     *
     * @param days number of days
     */
    private void setMaximumActivationDelay(int days) {
        maxActivationDelay = days;
    }


    /**
     * Maximum number of days the user can delay activation by pressing "Later".
     *
     * @return max number of days
     */

    // Has to be package private....studio states private but called from Activator object
    int getMaximumActivationDelay() {
        return maxActivationDelay;
    }


    /**
     * Number of seconds the user must wait before "Later" becomes enabled
     *
     * @param seconds - days number of seconds
     */
    private void setTemporaryWaitTime(int seconds) {
        temporaryWaitTime = seconds;
    }


    /**
     * Retrieve the number of seconds the user must wait before "Later" becomes enabled.
     *
     * @return number of seconds
     */
    int getTemporaryWaitTime() {
        return temporaryWaitTime;
    }


    /**
     * Number of failed validations since validation.
     *
     * @param count - the number of failed validations.
     */
    private void setFailedValidationsLimit(int count) {
        failedValidationsLimit = count;
    }


    /**
     * Retrieve the number of failed validations since validation.
     *
     * @return number of tries.
     */
    int getFailedValidationsLimit() {
        return failedValidationsLimit;
    }


    /**
     * Limit of silent failed validations since validation, before dialog.
     *
     * @param count - the number of failed validations.
     */
    private void setSilentFailedValidationsLimit(int count) {
        silentFailedValidationsLimit = count;
    }


    /**
     * Retrieve the number of silent failed validations limit.
     *
     * @return number of tries.
     */
    int getSilentFailedValidationsLimit() {
        return silentFailedValidationsLimit;
    }







    /**
     * Number of days between revalidation of registration
     *
     * @param count - the number of days.
     */
    private void setValidationsDayCycle(int count) {
        validationsDayCycle = count;
    }


    /**
     * Retrieve the number of days between revalidation of registration
     *
     * @return number of days
     */
    int getValidationsDayCycle() {
        return validationsDayCycle;
    }

    // a view to display in the message area of the dialog instead of the default message view
    // if a custom view is specified, the custom view takes precedence over the custom text

    /*
     * Sets a view to be displayed in the message area of the
     * dialog instead of the default message view.
     * <p>If a custom view is specified, the custom view takes precedence
     * over the custom text.
     *
     * @param view the custom view
     */

    // Could be used in the future. Was used during development
    void setDialogCustomView(View view) {
        dialogCustomView = view;
    }

    View getDialogCustomView() {
        return dialogCustomView;
    }



    /**
     * Sets a text to display in the message view instead of the standard message.
     * <p>If a custom view is specified, the custom view takes precedence
     * over the custom text.
     *
     * @param text the custom text
     */


    // Was used during development, could again.
    void setDialogCustomText(String text) {
        dialogCustomText = text;
    }

    String getDialogCustomText() { return dialogCustomText; }

    private String dialogCustomText = "";


//    void setContext(Context context) {
//        this.context = context;
//    }
//
//    Context getContext() {
//        return context;
//    }


    /**
     * Retrieve the SharedPreferences object. The preferences file is
     * created now if it doesn't exist.
     *
     * @return the SharedPreferences object
     */
    private SharedPreferences getPrefs(Context con) {

        // the shared preferences file name
        String SHARED_PREFS_FILE_NAME = "activatorData";

        return con.getSharedPreferences(SHARED_PREFS_FILE_NAME, Context.MODE_PRIVATE);
    }


    /**
     * Checks if the app is currently activated from cached data.
     * @return whether the app is activated
     */
    boolean isActivatedInCache(Context con) {
        return getPrefs(con).getBoolean(KEY_ACTIVATED, false);
    }


    /**
     * Check if the registered Backend URL is valid
     */
    boolean isBackendURLValid() {
        boolean valid = false;
        URL url = getBackendURL();
        if (url != null) {
            try {
                url.toURI();// performs some more validation...
                valid = true;// if we reach this line is valid.
            }
            catch (URISyntaxException e) {
                // fall through with valid being false
            }
        }
        return valid;
    }





    /**
     * Sets the activation flag in cached data.
     *
     * @param activated the activation flag
     */
    void setActivated(Context con, boolean activated) {
        // Yes, we want to use commit and not apply...
        getPrefs(con).edit().putBoolean(KEY_ACTIVATED, activated).commit();
    }


    /**
     * Returns the current activation level from cached data.
     * @return the current activation level
     */

    // Yes, getLevel is not used but is still part of the protocol with the server.
    int getLevel(Context con) {
        return getPrefs(con).getInt(KEY_LEVEL, 0);
    }


    /**
     * Sets the level value in cached data.
     *
     * @param level the level value
     */
    void setLevel(Context con, int level) {
        // Best to just use commit rather than apply with registration information
        getPrefs(con).edit().putInt(KEY_LEVEL, level).commit();
    }


    /**
     * Sets the expiration timestamp value in cached data.
     *
     * @param expirationTs the expiration timestamp
     */
    void setExpirationTime(Context con, long expirationTs) {
        // Commit is needed over apply
        getPrefs(con).edit().putLong(KEY_EXPIRATION, expirationTs).commit();
    }


    /**
     * Returns the current expiration date from cached data.
     * @return the current expiration date, null if not specified
     */
    Date getExpirationDate(Context con) {
        Date date=null;
        long secs = getPrefs(con).getLong(KEY_EXPIRATION, 0);
        if (secs>0) {
            date = new Date(secs*1000);
        }
        return date;
    }


    /**
     * Saves the timestamp of the first Temporary Activation in shared preferences.
     *
     * @param timestamp - unix timestamp of the first Temporary Activation
     */
    void setFirstTempActivationTS(Context con, long timestamp) {
        // Temp activation time stamp isn't as vital... apply used
        getPrefs(con).edit().putLong(KEY_TS_FIRST_TEMP_ACTIVATION, timestamp).apply();
    }


    /**
     * Returns the timestamp of the first Temporary Activation from shared preferences.
     *
     * @return the unix timestamp of the first Temporary Activation
     */
    // Cannot be private due to access through Activator object
    long getFirstTempActivationTS(Context con) {
        return getPrefs(con).getLong(KEY_TS_FIRST_TEMP_ACTIVATION, 0);
    }


    /**
     * Returns the User Id used for the last activation from shared preferences.
     * @return the User Id used for the last activation
     */
    String getActivationUserId(Context con) {
        return getPrefs(con).getString(KEY_USERID, "");
    }


    /**
     * Sets the User Id used for the last activation in shared preferences.
     *
     * @param userId used for the last activation
     */
    void setActivationUserid(Context con, String userId) {
        // Part of activation process.. best to use commit over apply
        getPrefs(con).edit().putString(KEY_USERID, userId).commit();
    }



    /**
     * Sets the temporary activation flag.
     *
     * @param flag the temporary activation flag
     */
    private void setTemporarilyActivated(boolean flag) {
        temporarilyActivated = flag;
    }

    /**
     * Checks if the activation is temporary.
     *
     * @return true if the activation is temporary
     */
    private boolean isTemporarilyActivated() {
        return temporarilyActivated;
    }


    /**
     * Returns the installation uuid from shared preferences.
     * @return the installation uuid
     */
    private String getInstallationUuid(Context con) {
        return getPrefs(con).getString(KEY_INSTALLATION_UUID, "");
    }


    /**
     * Sets the installation uuid in shared preferences.
     *
     * @param uuidString the installation uuid string
     */
    void setInstallationUuid(Context con, String uuidString) {
        // Part of registration best to just commit it and not use apply
        getPrefs(con).edit().putString(KEY_INSTALLATION_UUID, uuidString).commit();
    }

    /**
     * Returns the Unique Id from shared preferences.
     * @return the Unique Id
     */
    String getUniqueId(Context con) {
        return getPrefs(con).getString(KEY_UNIQUEID, "");
    }


    /**
     * Sets the Unique Id in shared preferences.
     *
     * @param uidString the Unique Id string
     */
    void setUniqueId(Context con, String uidString) {
        // Part of registration best to commit over apply
        getPrefs(con).edit().putString(KEY_UNIQUEID, uidString).commit();
    }

    /**
     * Calculates a unique id made with a combination of the Unique Installation
     * Id (type UUID) generated at startup and a Unique Device Id calculated on the fly from
     * some characteristics of the device.
     *
     * <p>The returned id is tied to the installation AND to the the device; hence if you reinstall
     * the app on the same device or copy the app to another device you get different ids.
     *
     * @return the combined id
     */
    String calcUniqueId(Context con) {
        String installUUID = getPrefs(con).getString(KEY_INSTALLATION_UUID, "");
        String deviceUUID = new DeviceUuidFactory(con).getDeviceUuid().toString();

        // create a long string
        String longString = installUUID + deviceUUID;

        // strip "-"
        longString = longString.replace("-", "");

        // compressing-encoding results in a string longer than the original! it is useless.
        // // byte array from long string
        // byte[] originalBytes = longString.getBytes();
        //
        // // compress to another byte array with DEFLATE
        // Deflater deflater = new Deflater();
        // deflater.setInput(originalBytes);
        // deflater.finish();
        // ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // byte[] buf = new byte[8192];
        // while (!deflater.finished()) {
        // int byteCount = deflater.deflate(buf);
        // baos.write(buf, 0, byteCount);
        // }
        // deflater.end();
        // byte[] compressedBytes = baos.toByteArray();
        //
        // // Convert a compressed byte array to base64 string
        // String encoded = Base64.encodeToString(compressedBytes, Base64.DEFAULT);

        return longString;
    }


    /**
     * Returns the URL of the backend.
     * Performs some validity checking
     * @return the backend URL
     */
    URL getBackendURL() {
        URL url = null;

        String address = getAddress();
        if (address != null) {
            if (address.length() >= 16) { // cant be less than http://x.xx:0000
                if (address.contains(".")) {// at least one dot is mandatory
                    if (address.contains(":")) {// at least one : is mandatory

                        // strip ending slashes
                        while ((address.charAt(address.length()-1))=='/') {
                            address = address.substring(0,address.length()-1);
                        }

                        String urlString = address + "/activator/check.php";
                        try {
                            url = new URL(urlString);
                        }
                        catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return url;
    }

//    /**
//     * Returns the URI of the backend.
//     * @return the backend URI
//     */
//    URI getBackendURI() {
//        URI uri = null;
//        try {
//            uri = getBackendURL().toURI();
//        }
//        catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//        return uri;
//    }



    /**
     * init() is called by newInstance() after the ACTIVATOR variable is set!
     */

    void valuesInit(Context con) {

        // Set the context as passed
        //TODO Remove
//        setContext(ctx);

        // default for temporary activation mechanism availability
        setTemporaryActivationAvailable(true);

        // default number of days for maximum activation delay
        setMaximumActivationDelay(15);

        // default number of seconds user must wait before "Later" button becomes enabled
        setTemporaryWaitTime(10);

        // set the temporary activation flag to off
        setTemporarilyActivated(false);


        /*
        Remember these failed validations could also be due to your validation server
        being off-line or over loaded at peak times. 
         */

        // set the number of silent failed validation allowed before given dialog
        setSilentFailedValidationsLimit(15);

        // set the number of failed validations allowed before de-registration
        setFailedValidationsLimit(20);

        // set the number of days after registration to re-validate the registration
        setValidationsDayCycle(30);

        // retrieve default application name
        PackageManager packageManager = con.getPackageManager();
        this.appName = packageManager.getApplicationLabel(con.getApplicationInfo()).toString();

        // create and save the installation UUID in Shared Preferences if not present (first time only)
        // this is the Installation part of the UniqueId
        String uuidStr = getInstallationUuid(con);
        if (uuidStr.equals("")) {
            UUID uuid = UUID.randomUUID();
            setInstallationUuid(con, uuid.toString());
        }

        // Device change detection: if device changes, activation is revoked locally,
        // cached Unique Id is deleted, and the app has to be re-activated.
        String cachedUid = getUniqueId(con);
        if (!cachedUid.equals("")) {
            // If the cached Unique Id is present (activation already done), but it doesn't
            // correspond to the calculated Unique Id anymore, then device has changed.
            String currUid = calcUniqueId(con);
            if (!currUid.equals(cachedUid)) {
                setActivated(con,false);
                setUniqueId(con,"");
            }
        }

    }


    /**
     * Performs a Temporary Activation.
     * <p>Called by the Activation Dialog when Later button is pressed.
     */
    void doTemporaryActivation(Context con) {

        // turns the temporary activation flag on
        setTemporarilyActivated(true);

        // save the time of the first temporary activation
        long seconds = getFirstTempActivationTS(con);
        if (seconds == 0) {
            Calendar c = Calendar.getInstance();
            seconds = c.getTimeInMillis()/1000;
            setFirstTempActivationTS(con, seconds);
        }

    }


    /*
     * Checks if the cached uniqueid is present in the backend.
     * If the backend is not responding, it is assumed as present
     * (will be checked again in the the effective activation process)
     *
     * @return true if the uniqueid is present in the backend or the backend is not responding
     */
    /*
    private boolean isUniqueidPresentInBackend() {

        boolean present = true;
        if (isBackendResponding()) {

            // create the task
            CheckUniqueidPresentThread thread = new CheckUniqueidPresentThread(this);

            // retrieve the result
            present = thread.isSuccessful();

        }
        return present;


    }

*/
    /**
     * Determine if the activation process requires to supply the userid also.
     *
     * @return true if userid is requested
     */

    /*
    boolean isUseridRequested() {
        boolean requested = false;

        String uid = getUniqueId();

        if (uid.equals("")) { // no uniqueid in cached data
            requested = true;
        }
        else { // uniqueid is present in cached data
            if (isUniqueidPresentInBackend()) {// is uniqueid also present in the backend?
                requested = false;
            }
            else {
                requested = true;
            }
        }
        return requested;
    }
*/

    String getAppName() {
        return appName;
    }


    void setProducerId(int id) {
        producer_id = id;
    }


    int getProducerId() {
        return producer_id;
    }


    public int getIconResId() {
        return iconResId;
    }

    int iconResId = 0;

    void setIconResId(int resId) {
        iconResId = resId;
    }



    /**
     * Create a device info map sent to the backend along with activation requests.
     * Saved by the backend the first time, when the activation record is created
     * Subclass SingleActivator and override this method to generate custom device info map
     * @return the device info map
     */
    private LinkedHashMap<String, String> createDeviceInfoMap(Context con){
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        DisplayMetrics metrics = con.getResources().getDisplayMetrics();

        map.put("androidVersion", ""+ Build.VERSION.SDK_INT);

        map.put("widthPixels", ""+metrics.widthPixels);
        map.put("heightPixels", ""+metrics.heightPixels);
        map.put("densityDpi", ""+metrics.densityDpi);

        // the screen diagonal in inches
        double x = Math.pow(metrics.widthPixels/metrics.xdpi,2);
        double y = Math.pow(metrics.heightPixels/metrics.ydpi,2);
        double screenInches = Math.sqrt(x+y);
        double rounded = (double)Math.round(screenInches*10)/10;
        map.put("diagInches", ""+rounded);

        map.put("language", Locale.getDefault().getISO3Language());
        map.put("country", Locale.getDefault().getISO3Country());

        return map;
    }


    /**
     * Creates a string representing an info map of the device
     * Used as data sent in a request
     * The string is formattes as "key:value, key:value..."
     * @return the string
     */
    String getDeviceInfoString(Context con){
        String str="";
        String key, value;

        LinkedHashMap<String, String> infoMap = createDeviceInfoMap(con);

        for (Map.Entry<String, String> entry : infoMap.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (!str.equals("")) {
                str+=", ";
            }
            str+=key+": "+value;
        }

        return str;
    }


    /**
     * @return true if the backend call succeeded (at backend logical)
     */
    boolean isResponseSuccess(Bundle bun) {

        String KEY_SUCCESS = "success";

        boolean success = false;
        if (bun != null) {
            String string = getString(KEY_SUCCESS, bun);
            if (Convert.getBool(string)) {
                success = true;
            }
        }

        return success;
    }

    /**
     * @return failure string if failurecode present in bundle
     */
    int getResponseFailureCode(Bundle bun)  {

        String KEY_FAILURE_CODE = "failurecode";

        if (bun != null) {
            return getInt(KEY_FAILURE_CODE, bun);
        } return 0;
    }

//    Maybe needed again in the future.

//    boolean hasActivated(Bundle bun) {
//        return bun.containsKey(KEY_ACTIVATED);
//    }

    /**
     * @param bun the bundle containing the response
     * @return true if the app is activated
     */
    boolean isActivated(Bundle bun) {
        return getBool(KEY_ACTIVATED, bun);
    }


    /**
     * Checks if the app is currently activated.
     * <p>Uses a combination of cached data and temporary activation.
     * <p>If Temporary Activation is on, always returns true. If off, lloks in cached data.
     * @return whether the app is activated
     */
    boolean isActivated(Context con) {
        return isTemporarilyActivated() || isActivatedInCache(con);
    }

    boolean hasExpirationTime(Bundle bun) {
        if (bun.containsKey(KEY_EXPIRATION)) {
            String temp = bun.getString(KEY_EXPIRATION);

            /*
            By default the expiration is set to 0000-00-00
            which is obviously a UNIX negative date.

            In the context of this app, we will consider the
            expiration not to exist in the bundle when this occurs.
             */
            Long tmpL = Long.valueOf(temp);
            return (tmpL > 0);
        } else
            return false;
    }


    /**
     *  @param bun the bundle containing the response
     *  @return the expiration date
     */
    long getExpirationTime(Bundle bun) {
        return getLong(KEY_EXPIRATION, bun);
    }

    boolean hasLevel(Bundle bun) {
        return bun.containsKey(KEY_LEVEL);
    }

    /**
     * @param bun the bundle containing the response
     * @return the app level
     */
    int getLevel(Bundle bun) {
        return getInt(KEY_LEVEL, bun);
    }


    /**
     * Retuns a int from the response map.
     *
     * @param key the key to search
     * @param bun the bundle containing the response
     * @return the int
     */
    private int getInt(String key, Bundle bun) {
        int num=0;
        String string = Convert.getString(bun.getString(key));
        try {
            num=Integer.parseInt(string);
        }
        catch (Exception e) {
            // Returns 0 if an exception occurs.
        }

        //return Lib.getInt(this.responseMap.get(key));
        return num;
    }


    /**
     * Retuns a long from the response map.
     *
     * @param key the key to search
     * @param bun the bundle containing the response
     * @return the long
     */
    private long getLong(String key, Bundle bun) {
        long num=0;
        String string = Convert.getString(bun.getString(key));
        try {
            num=Long.parseLong(string);
        }
        catch (Exception e) {
            // returns 0 if exception occurs
        }

        //return Lib.getInt(this.responseMap.get(key));
        return num;
    }


    /**
     * Retuns a boolean from the response map.
     *
     * @param key the key to search
     * @param bun the bundle containing the response
     * @return the boolean
     */
    private boolean getBool(String key, Bundle bun) {
        return Convert.getBool(bun.getString(key));
    }


    /**
     * Retuns a string from the response map.
     *
     * @param key the key to search
     * @param bun the bundle containing the response
     * @return the string
     */
    private String getString(String key, Bundle bun) {
        return Convert.getString(bun.getString(key));
    }


    /*
     * Check if network is configured and connected.
     *
     * @return true if network is connected
     */

    // Maybe be desirable to add a check in some context. The problem is where someone
    // tries to simply start the app without a network, by passing validation and
    // then turns on the network once the app is up.

//    boolean isNetworkAvailable(Context con) {
//        boolean available = false;
//        Object service = con.getSystemService(Context.CONNECTIVITY_SERVICE);
//        if (service != null && service instanceof ConnectivityManager) {
//            ConnectivityManager cm = (ConnectivityManager) service;
//
//            NetworkInfo networkInfo = cm.getActiveNetworkInfo();
//
//            // if no network is available networkInfo will be null, otherwise check if we are connected
//            if (networkInfo != null && networkInfo.isConnected()) {
//                available = true;
//            }
//        }
//        return available;
//    }


    /**
     * Calculates the number of days remaining for the Temporary Activation.
     *
     * @return the number of days remaining
     */
    int calcDaysRemaining(Context con, Activator theActivator) {
        int daysLeft = 0;

        if (temporaryActivationAvailable) {

            long firstSeconds = theActivator.getFirstTempActivationTS(con);
            int maxDays = theActivator.getMaximumActivationDelay();

            if (firstSeconds>0) {
                long todaySeconds = Calendar.getInstance().getTimeInMillis()/1000;
                long diff = todaySeconds - firstSeconds; // result in seconds

                int elapsedDays = (int) diff / (24 * 60 * 60);

                daysLeft = maxDays - elapsedDays;

                if (daysLeft < 0) {
                    daysLeft = 0;
                }
            }
            else {
                daysLeft=maxDays;	// temporary activation never issued yet
            }

        }

        return daysLeft;
    }



    /**
     * @return a failure string in the current language
     */
    String getGlobalFailureString() {

        String failureString;
        switch (getGlobalFailureCode()) {
            case ERROR_WRONG_ACTIVATION_CODE:
                failureString = Strings.wrong_activation_code.get();
                break;
            case ERROR_WRONG_APP_NAME:
                failureString = Strings.wrong_app_name.get();
                break;
            case ERROR_USERID_NOT_FOUND:
                failureString = Strings.userid_not_found.get();
                break;
            default:
                failureString = Strings.unrecognized_error.get() + ": " + failureCode;
                break;
        }
        String tmpS = getJustFailureString();
        if (!"".equals(tmpS))
            failureString += "["+ tmpS + "]";

        return failureString;
    }




    void deActivate(Context con, Activator theActivator) {
        theActivator.setActivated(con, false);

        // Leaving the data in preferences to allow for debugging/proof of a customer
        // no longer having a valid registration.

//        getPrefs().edit().remove(KEY_EXPIRATION).commit();
//        getPrefs().edit().remove(KEY_LEVEL).commit();
//        getPrefs().edit().remove(KEY_UNIQUEID).commit();
//        getPrefs().edit().remove(KEY_USERID).commit();
    }


    /**
     * Saves the timestamp of when the Activation needs to be validated in the future, stored in
     * shared preferences.
     */
    void setValidationTS(Context con) {
//        Timestamp ts = new Timestamp(System.currentTimeMillis());

        Date currentDate = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DATE, getValidationsDayCycle());
        currentDate = cal.getTime();

        // For sanity sake, using commit instead of apply.
        getPrefs(con).edit().putLong(KEY_TS_VALIDATION, currentDate.getTime()).commit();

        setFailedValidations(con, 0);
    }


    /**
     * Returns the timestamp of when the Activation was last validated from shared preferences.
     *
     * @return the unix timestamp of the last validation
     */
    private long getValidationTS(Context con) {
        return getPrefs(con).getLong(KEY_TS_VALIDATION, 0);
    }

    /**
     * Returns the validation date from cached data.
     * @return the validation date
     */
    Date getValidationDate(Context con) {
        long l = getValidationTS(con);
        if (l == 0) return null;
        return new Date(l);
    }

    /**
     * Saves the count of validation failures.
     *
     * @param count - the integer count of the number of validation failures
     */

    void setFailedValidations(Context con, int count) {
        // Ok, incrementing the number of failed validations immediately isn't vital. So, Apply.
        getPrefs(con).edit().putInt(KEY_FAILED_VALIDATION, count).apply();
    }


    /**
     * Returns the number of failed Validation Activations from shared preferences.
     *
     * @return the integer count of the number of validation failures.
     */
    int getFailedValidations(Context con) {
        // variable left for debugging.
        int debugNum = getPrefs(con).getInt(KEY_FAILED_VALIDATION, 0);
        return debugNum;
    }


}
