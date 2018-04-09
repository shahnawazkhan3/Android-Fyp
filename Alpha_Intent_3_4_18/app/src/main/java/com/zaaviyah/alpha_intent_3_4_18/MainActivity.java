package com.zaaviyah.alpha_intent_3_4_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   String Tag = "wellcome Aplha 1";

   Button b1CALL, b2REGS,b3TOG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("shah ONCREATE()",Tag);

        b1CALL =(Button)findViewById(R.id.btCall);
        b2REGS=(Button)findViewById(R.id.btReg);
        b3TOG=(Button)findViewById(R.id.btTog);
        b3TOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toggle = new Intent(MainActivity.this,ToggleActivity.class);
                startActivity(toggle);
            }
        });



        b1CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callINTEN =new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9510300000"));

                startActivity(callINTEN);
            }
        });

//        b2REGS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent registerINTEN = new Intent(MainActivity.this,RegisterNewACTIVITY.class);
//                startActivity(registerINTEN);
//            }
//        });
        b2REGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"YES",Toast.LENGTH_SHORT).show();

                Intent registerActivity = new Intent(MainActivity.this,RegisterKNOWactivit.class);
                startActivity(registerActivity);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shah  onStart()",Tag);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shah onRestart() ",Tag);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shah  onResume() ",Tag);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shah  onstop ",Tag);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shah  onDestroy() ",Tag);
    }
}
