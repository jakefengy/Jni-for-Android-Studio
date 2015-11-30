package com.example.jni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    static {
        System.loadLibrary("JniExample");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.my_textview);
        tv.setText(getStringFromNative());

        Toast.makeText(this, getStringFromNative(), Toast.LENGTH_SHORT).show();

        Log.i("JNI String :", getStringFromNative());

    }

    public native String getStringFromNative();


}
