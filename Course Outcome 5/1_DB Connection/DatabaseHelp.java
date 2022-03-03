package com.example.workshopsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelp extends SQLiteOpenHelper {

    public static final String CUSTOMER = "customer";
    public static final String ID = "id";
    public static final String CUSTOMER_NAME = "customer_name";
    public static final String CUSTOMER_AGE = "customer_age";
    public static final String CUSTOMER_STATUS = "customer_status";

    public DatabaseHelp(@Nullable Context context) {
        super(context, "customer.db", null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query= "Create table " + CUSTOMER + "(" + ID + " int primary key autoincrement," + CUSTOMER_NAME + " text," + CUSTOMER_AGE + " int," + CUSTOMER_STATUS + " bool)";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        }
    public boolean insertData(UserDetails userDetails){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(CUSTOMER_NAME,userDetails.getName());
        cv.put(CUSTOMER_AGE,userDetails.getAge());
        cv.put(CUSTOMER_STATUS,userDetails.isUserStatus());
        Long insert = db.insert(CUSTOMER,null,cv);
        if(insert==-1){
            return false;
        }
        else
            return true;



    }
}
