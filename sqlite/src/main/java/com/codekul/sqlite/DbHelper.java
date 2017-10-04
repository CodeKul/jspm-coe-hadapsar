package com.codekul.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aniruddha on 4/10/17.
 */

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(
            Context context,
            String dbNm,
            SQLiteDatabase.CursorFactory factory,
            int version
    ) {
        super(context, dbNm, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" create table codekul_seminar(stNm text, mob text, eml text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVer, int newVer) {

    }
}
