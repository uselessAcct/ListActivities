package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listViewSites;
    List<String> siteNames = new ArrayList<>(
            Arrays.asList("Magnificent Miles", "Navy Pier", "Art Institute")
    );
    List<Integer> sitePics = new ArrayList<>(
            Arrays.asList(R.drawable.artinst, R.drawable.pier, R.drawable.magmile)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewSites = findViewById(R.id.listViewSites);
        SiteAdapter siteAdapter = new SiteAdapter(siteNames, sitePics);
        listViewSites.setAdapter(siteAdapter);

        listViewSites.setOnItemClickListener((AdapterView<?> adapterView, View view, int i, long l) -> {

            switch(i){
                case 0:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com")));
                    break;
                case 1:
                    startActivity(new Intent(MainActivity.this, PierActivity.class));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this, ArtActivity.class));
                    break;
            }
        });
    }
}