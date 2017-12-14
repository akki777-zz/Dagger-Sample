package com.akshay.daggersample;

import android.util.Log;

/**
 * Created by akshaymahajan on 13/12/17.
 */

public class Logger {

    static void log(String tag, Object message) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, "" + message);
        }
    }

    static void logException(String tag, Throwable throwable) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, "" + throwable);
        }
    }
}
