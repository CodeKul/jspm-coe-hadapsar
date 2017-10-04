package com.codekul.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DbHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DbHelper(this, "codekul_db", null, 1);
    }

    public void onInsertDb(View view) {

    }

    public void onUpdateDb(View view) {

    }

    public void onDeleteDb(View view) {

    }

    public void onQueryDb(View view) {

    }
}
