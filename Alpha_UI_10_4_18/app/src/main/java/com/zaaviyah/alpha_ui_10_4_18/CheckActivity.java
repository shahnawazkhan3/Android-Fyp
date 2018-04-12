package com.zaaviyah.alpha_ui_10_4_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    Button b1show;
    CheckBox cbpizaa, cbburger, cbicecrem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        b1show= (Button)findViewById(R.id.btShow);

        cbpizaa=(CheckBox)findViewById(R.id.cbPizza);
        cbicecrem=(CheckBox)findViewById(R.id.cbIce);
        cbburger=(CheckBox)findViewById(R.id.cbBurger);


        b1show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int totalAmount= 0;
                StringBuilder result = new StringBuilder();
                result.append("select items");


                if(cbpizaa.isChecked())
                {
                   result.append("\n Rs 100");
                   totalAmount+=100;
                }

                if(cbburger.isChecked())
                {
                    result.append("\n Rs 50");
                    totalAmount+=50;
                }
                if(cbicecrem.isChecked())
                {
                    result.append("\n Rs 150");
                    totalAmount+=150;
                }

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();

            }
        });





    }
}
