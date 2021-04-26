package com.flysnail.demoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.flysnail.demoapp.layout.Layout_test;
import com.flysnail.demoapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "com.flysnail.demoapp.MainActivity";
    public static final String EXTRA_MESSAGE = "com.flysnail.demoapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(null != savedInstanceState){
            Log.i(TAG, "onCreate: savedInstanceState");
        }
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.i(TAG, "onRestoreInstanceState");
    }

    public void layoutTest(View view){
        Intent intent = new Intent(this, Layout_test.class);
        intent.putExtra(EXTRA_MESSAGE,getString(R.string.LayoutTest));
        startActivity(intent);
    }

    public void loginActivity(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}