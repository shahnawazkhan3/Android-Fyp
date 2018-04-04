package com.zaaviyah.apha_fyp_29_3_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    String Tag ="welcome fyp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("onCreate",Tag);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart()",Tag);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Stop()",Tag);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy()",Tag);
    }
}
