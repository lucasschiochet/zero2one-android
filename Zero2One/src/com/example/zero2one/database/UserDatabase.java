package com.example.zero2one.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class UserDatabase extends SQLiteOpenHelper{

	public static final String DATABASE_NAME = "user";
	public static final String DATABASE_NUMBER = "2";
	public static final int DATABASE_VERSION = 1;


	public UserDatabase(Context context){
		super(context, DATABASE_NAME+DATABASE_NUMBER, null, DATABASE_VERSION );
	}

	@Override
	public void onCreate(SQLiteDatabase db) {}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}



}

