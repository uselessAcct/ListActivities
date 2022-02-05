package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class ArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        TextView txtViewHrs = findViewById(R.id.txtViewHrs);
        txtViewHrs.setText("Info: http://www.naver.com");
        Linkify.addLinks(txtViewHrs, Linkify.WEB_URLS);
    }
}