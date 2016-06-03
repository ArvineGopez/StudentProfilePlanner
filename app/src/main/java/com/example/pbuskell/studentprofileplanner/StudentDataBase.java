package com.example.pbuskell.studentprofileplanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by student on 30/05/2016.
 */
public class StudentDataBase extends SQLiteOpenHelper {
    private static final String DB_NAME = "student";
    private static final int DB_VERSION = 1;


    public StudentDataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("CREATE TABLE EMPLOYEE (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NAME TEXT, " +
                "POSITION TEXT, " +
                "EMPLOYEE_NUM INTEGER PRIMARY KEY, " +
                "WAGE REAL);");
    }

    public void insertElement(SQLiteDatabase db, ContentValues newContent){

        db.insert("EMPLOYEE", null, newContent);

    }

    public int alterElement(SQLiteDatabase db, ContentValues alteredContent, String where,
                            String[] whereArgs){

        return db.update("EMPLOYEE", alteredContent, where, whereArgs);

    }

    public int deleteElement(SQLiteDatabase db, String where, String[] whereArgs){

        return db.delete("EMPLOYEE", where, whereArgs);

    }
}
