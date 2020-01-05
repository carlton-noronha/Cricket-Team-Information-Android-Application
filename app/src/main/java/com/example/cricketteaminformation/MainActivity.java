package com.example.cricketteaminformation;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvIndia, tvAustralia, tvSouthAfrica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvIndia = findViewById(R.id.india);
        tvAustralia = findViewById(R.id.australia);
        tvSouthAfrica = findViewById(R.id.southAfrica);

        tvIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,IndiaActivity.class);
                startActivity(intent);
            }

        });

        tvAustralia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AustraliaActivity.class);
                startActivity(intent);
            }
        });

        tvSouthAfrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SouthAfricaActivity.class);
                startActivity(intent);
            }
        });
    }
}
