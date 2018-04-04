package com.zaaviyah.alpha_intent_3_4_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1CALL, b2REGISTER;
    EditText etNAME, Etpass;
    TextView tvSHOW;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1CALL = (Button)findViewById(R.id.btCALL);
        b2REGISTER=(Button)findViewById(R.id.btREgister);

        b1CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callInten = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9510300000"));
                startActivity(callInten);
            }
        });

        b2REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent REgistrintent =new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(REgistrintent);
            }
        });



    }
}
