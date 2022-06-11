package com.example.appband;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.sql.Connection;

public class Conexao extends SQLiteOpenHelper {

    private Context context;

    private static final String DB_SYSTEM = "system.db";
    private static final int DB_SYSTEM_VERSION = 1;
    private static final String TABLE_BAND= "band";

    private static final String COLUMN_BAND_ID = "_id";
    private static final String COLUMN_BAND_NAME = "name";
    private static final String COLUMN_BAND_MUSIC = "music";
    private static final String COLUMN_BAND_DATE = "date";
    private static final String COLUMN_BAND_STYLE = "style";

    public Conexao(@Nullable Context context) {
        super(context, DB_SYSTEM, null, DB_SYSTEM_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE IF NOT EXISTS " + TABLE_BAND +
                "(" + COLUMN_BAND_ID    + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                      COLUMN_BAND_NAME  + " TEXT, " +
                      COLUMN_BAND_MUSIC + " TEXT, " +
                      COLUMN_BAND_DATE  + " TEXT, " +
                      COLUMN_BAND_STYLE + " TEXT  " + ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BAND);
        onCreate(db);
    }

    long inserInfo(String name, String music, String date, String style)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_BAND_NAME,  name);
        cv.put(COLUMN_BAND_MUSIC, music);
        cv.put(COLUMN_BAND_DATE,  date);
        cv.put(COLUMN_BAND_STYLE, style);

        long result = db.insert(TABLE_BAND, null, cv);

        return result;
    }

    Cursor listAll()
    {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = null;

        cursor = database.rawQuery(
                "SELECT * FROM " + TABLE_BAND, null);

        return cursor;
    }

}
