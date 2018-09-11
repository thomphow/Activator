package ca.howardthompson.activator;

import android.content.Context;

import java.lang.reflect.Field;

public class Constants
{
    public static final String TAG = "Activator";

    public static boolean debug = false;

    public static void setDebug(boolean isDebug) {
        debug = isDebug;
        ca.howardthompson.rxdialog.Constants.setDebug(isDebug);
    }

}
