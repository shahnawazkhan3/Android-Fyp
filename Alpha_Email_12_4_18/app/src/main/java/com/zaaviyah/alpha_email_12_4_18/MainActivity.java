package com.zaaviyah.alpha_email_12_4_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b1Send ;
    EditText etEMAIL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1Send=(Button)findViewById(R.id.btSEND);
        etEMAIL =(EditText)findViewById(R.id.etEmail);

        b1Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendEmail();

            }
        });



    }

    private void sendEmail() {


        Log.d("SEND","");

        Intent sendEmail = new Intent(Intent.ACTION_SEND);

        String [] TO ={""};
        String [] CC ={" "};

        sendEmail.setData(Uri.parse("mailto"));
        sendEmail.setType("Text/plain");
        sendEmail.putExtra(Intent.EXTRA_EMAIL,TO);
        sendEmail.putExtra(Intent.EXTRA_CC,CC);
        sendEmail.putExtra(Intent.EXTRA_SUBJECT,"your subject");
        sendEmail.putExtra(Intent.EXTRA_TEXT,"hhh");


        try {

            startActivity(Intent.createChooser(sendEmail,"sending"));

            Log.d("sending","yes");
            finish();


        }catch (Exception e){
            Toast.makeText(MainActivity.this,"no send",Toast.LENGTH_SHORT).show();
        }


    }


}
