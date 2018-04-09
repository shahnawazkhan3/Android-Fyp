package com.zaaviyah.alpha_intent_3_4_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    Button b1ssub;
    ToggleButton tg1,tg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);


        b1ssub=(Button)findViewById(R.id.btSubmit);
        tg1=(ToggleButton)findViewById(R.id.tg1);
        tg2 =(ToggleButton)findViewById(R.id.tg2);

        b1ssub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();

                result.append("toggle 1 ").append(tg1.getText().toString());
                result.append("\ntoggle 2").append(tg2.getText().toString());

                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();

            }
        });

    }
}
