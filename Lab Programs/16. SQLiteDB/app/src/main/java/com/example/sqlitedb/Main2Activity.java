package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dbHandler = new DBHandler(Main2Activity.this);

        textView = (TextView) findViewById(R.id.textView);

        String a = dbHandler.getAllData();
        textView.setText(a);
    }
}
