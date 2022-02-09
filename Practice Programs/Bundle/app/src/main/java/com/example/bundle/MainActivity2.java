package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t = (TextView) findViewById(R.id.t);

        Bundle bundle = getIntent().getExtras();
        String a = bundle.getString("message");
        t.setText(a);
    }
}