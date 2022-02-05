package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class PierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pier);

        TextView txtViewHours = findViewById(R.id.txtViewHours);
        txtViewHours.setText("Info: http://www.naver.com");
        Linkify.addLinks(txtViewHours, Linkify.WEB_URLS);
    }
}