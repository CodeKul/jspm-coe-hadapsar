package com.codekul.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private DbHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DbHelper(
                this,
                "codekul_db",
                null,
                1
        );
    }

    public void onInsertDb(View view) {
        SQLiteDatabase sqDb = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("stNm", getNm());
        values.put("mob", getMob());
        values.put("eml", getEml());

        sqDb.insert("codekul_seminar", null, values);

        sqDb.close();
    }

    public void onUpdateDb(View view) {

        String table = "codekul_seminar";
        ContentValues values = new ContentValues();
        values.put("eml", getEml());
        values.put("stNm", getNm());
        String whereClause = " mob = ?";
        String[] whereArgs = {getMob()};

        SQLiteDatabase sqDb = helper.getWritableDatabase();

        sqDb.update(table, values, whereClause, whereArgs);

        sqDb.close();
    }

    public void onDeleteDb(View view) {

    }

    public void onQueryDb(View view) {

        String table = "codekul_seminar";
        String[] columns = {};
        String selection = "";
        String[] selectionArgs = {};
        String groupBy = "";
        String having = "";
        String orderBy = "";

        SQLiteDatabase sqDb = helper.getReadableDatabase();
        Cursor cursor = sqDb.query(table, columns, selection, selectionArgs, groupBy, having, orderBy);
        while (cursor.moveToNext()) {
            String stNm = cursor.getString(0);
            String mob = cursor.getString(cursor.getColumnIndex("mob"));
            String eml = cursor.getString(2);

            Log.i("@coekul", "Name - " + stNm + " Mob - " + mob + "Email - " + eml);
        }
        sqDb.close();
    }

    private String getNm() {
        return ((EditText) findViewById(R.id.etNm)).getText().toString();
    }

    private String getMob() {
        return ((EditText) findViewById(R.id.etMob)).getText().toString();
    }

    private String getEml() {
        return ((EditText) findViewById(R.id.etEml)).getText().toString();
    }
}
