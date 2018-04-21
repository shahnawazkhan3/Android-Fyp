package com.zaaviyah.alpha_database_21_4_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1Add,b2update,b3delete,b4Serach;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1Add=(Button)findViewById(R.id.btAdd);
        b2update=(Button)findViewById(R.id.btUpdate);
        b3delete=(Button)findViewById(R.id.btDelete);
        b4Serach=(Button)findViewById(R.id.btSearch);


        b1Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAdd = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intentAdd);
            }
        });

    }
}
