package com.example.cadastro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    private Context context;
    private static final String DB_SYSTEM = "system.db";
    private static final int DB_SYSTEM_VERSION = 1;

    private static final String TABLE_USERS = "users";
    private static final String COLUMN_USERS_ID = "_id";
    private static final String COLUMN_USERS_LOGIN = "login";
    private static final String COLUMN_USERS_PASSWORD = "password";

    private static final String TABLE_CLIENTS = "clients";
    private static final String COLUMN_CLIENTS_ID = "_id";
    private static final String COLUMN_CLIENTS_NAME = "name";
    private static final String COLUMN_CLIENTS_ADDRESS = "address";
    private static final String COLUMN_CLIENTS_MAIL= "mail";

    public DataBase(@Nullable Context context) {
        super(context, DB_SYSTEM, null, DB_SYSTEM_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE IF NOT EXISTS " + TABLE_USERS +
                       "(" + COLUMN_USERS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                       COLUMN_USERS_LOGIN + " TEXT, " +
                       COLUMN_USERS_PASSWORD + " TEXT)";
        db.execSQL(query);

        query = "CREATE TABLE IF NOT EXISTS " + TABLE_CLIENTS +
                "(" + COLUMN_CLIENTS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_CLIENTS_NAME + " TEXT, " +
                COLUMN_CLIENTS_ADDRESS + " TEXT," +
                COLUMN_CLIENTS_MAIL + " TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLIENTS);
        onCreate(db);
    }

    long insertUser(String login, String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_USERS_LOGIN, login);
        cv.put(COLUMN_USERS_PASSWORD, password);

        long result = db.insert(TABLE_USERS, null, cv);

        return result;
    }

    long insertClient(String name, String address, String phone)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_CLIENTS_NAME, name);
        cv.put(COLUMN_CLIENTS_ADDRESS, address);
        cv.put(COLUMN_CLIENTS_MAIL, phone);

        long result = db.insert(TABLE_CLIENTS, null, cv);

        return result;
    }

    Cursor searchUser(String user, String password)
    {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = null;

        if(password == null)
        {
            cursor = database.rawQuery(
                    "SELECT * " +
                        "  FROM " + TABLE_USERS +
                        " WHERE " + COLUMN_USERS_LOGIN + " = '" + user + "'", null);
        }
        else
        {
            cursor = database.rawQuery(
                "SELECT * " +
                    "  FROM " + TABLE_USERS +
                    " WHERE " + COLUMN_USERS_LOGIN + " = '" + user + "'" +
                    "   AND " + COLUMN_USERS_PASSWORD + " = '" + password + "'", null);
        }

        return cursor;
    }

    boolean validateUser(String user, String password)
    {
        boolean v = false;
        DataBase db = new DataBase((context.getApplicationContext()));
        Cursor cursor = db.searchUser(user, password);
        if(cursor.moveToFirst())
        {
            v = true;
        }

        return v;
    }
}
