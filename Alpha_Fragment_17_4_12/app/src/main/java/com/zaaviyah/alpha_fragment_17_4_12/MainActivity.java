package com.zaaviyah.alpha_fragment_17_4_12;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        /// here code
        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Lm_frgements ls_fragment = new Lm_frgements();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }else{
            /**
             * Portrait mode of the device
             */
            Pm_fregments pm_fragment = new Pm_fregments();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();
    }
}
