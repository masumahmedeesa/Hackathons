package com.example.smsrecieve;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="numberDb";
    private static final int DATABASE_VERSION=1;
    private static final String CREATE= "create table "+DbConnect.TABLE_NAME+" (id integer primary key auto increment,"+ DbConnect.INCOMING_NUMBER+" text);";
    private static final String DROP="drop table if exists"+DbConnect.TABLE_NAME;


    public DbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP);
        onCreate(db);
    }

    public void saveNumber(String number, SQLiteDatabase database)
    {

    }
}
