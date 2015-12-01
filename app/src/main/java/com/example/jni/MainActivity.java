package com.example.jni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JniUtils jniUtils = new JniUtils();

        TextView tv = (TextView) findViewById(R.id.my_textview);
        tv.setText(jniUtils.getStringFromNative());

        Toast.makeText(this, jniUtils.getStringFromNative(), Toast.LENGTH_SHORT).show();

        Log.i("JNI String :", jniUtils.getStringFromNative());

    }

}
