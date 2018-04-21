package com.zaaviyah.alpha_database_21_4_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {


    EditText etNAME, etPhone,etEmail;
    Button b1Save;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        databaseHelper = new DatabaseHelper(this);


        b1Save=(Button)findViewById(R.id.btAddSave);
        etNAME =(EditText)findViewById(R.id.etName);
        etEmail =(EditText)findViewById(R.id.etEmail);
        etPhone =(EditText)findViewById(R.id.etPhone);


        b1Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean result = databaseHelper.addContact(etNAME.getText().toString(),etPhone.getText().toString(),etEmail.getText().toString());
                if(result){
                    Toast.makeText(AddActivity.this,"ADD SAVED",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AddActivity.this,"NOT SAVE",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
