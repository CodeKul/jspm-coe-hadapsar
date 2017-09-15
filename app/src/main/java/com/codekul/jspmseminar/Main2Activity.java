package com.codekul.jspmseminar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onLogin(View view) {

        EditText etUs = findViewById(R.id.etUsNm);
        EditText etPass = findViewById(R.id.etPass);

        if(etUs.getText().toString().equals("codekul") &&
        etPass.getText().toString().equals("codekul")) {
            Class cls = Main3Activity.class;
            startActivity(
                    new Intent(this, cls)
            );
        }
    }
}
