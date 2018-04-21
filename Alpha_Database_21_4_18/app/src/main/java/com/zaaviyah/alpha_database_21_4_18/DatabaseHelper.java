package com.zaaviyah.alpha_database_21_4_18;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME= "shah.db";
    public static final String TABLE_NAME ="shah";


    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,1);

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();


    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        sqLiteDatabase.execSQL("CREATE TABLE " +TABLE_NAME +
                " (ID INTEGER PRIMARY KEY AUTOINCREMENT ," +
                " NAME TEXT ," +
                " MOBILE_NUMBER TEXT ," +
                "EMAIL TEXT)"  );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" IF TABLE DROP "+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }


    boolean addContact(String phone, String name, String email){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME", name);
        contentValues.put("MOBILE_NUMBER", phone);
        contentValues.put("EMAIL", email);

        long result =sqLiteDatabase.insert("shah", null, contentValues);

        if (result == -1)
            return false ;
        else
            return  true ;
    }
}
