package com.example.jni;

/**
 * Created by lvxia on 2015-12-01.
 */
public class JniUtils {

    static {
        System.loadLibrary("JniExample");
    }

    public native String getStringFromNative();

}
