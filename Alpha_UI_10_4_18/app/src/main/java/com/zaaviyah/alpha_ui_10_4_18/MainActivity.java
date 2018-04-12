package com.zaaviyah.alpha_ui_10_4_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button b1Alert, b2Check,b3RADIO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1Alert=(Button)findViewById(R.id.btAlert);
        b2Check=(Button)findViewById(R.id.btCheck);
        b3RADIO=(Button)findViewById(R.id.btRadio);


        b1Alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent alert=new Intent(MainActivity.this,AlertActivity.class);
                startActivity(alert);
            }
        });

        b2Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent checkintent = new Intent(MainActivity.this,CheckActivity.class);
                startActivity(checkintent);
            }
        });
        b3RADIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RadioINTENT = new Intent(MainActivity.this,RadioActivity.class);
                startActivity(RadioINTENT);
            }
        });

    }
}
