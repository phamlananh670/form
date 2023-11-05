package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class form_5 extends AppCompatActivity {
    ImageView home;
    ImageView chart;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form5);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_4intent = new Intent(form_5.this, form14.class);
                startActivity(a_4intent);
            }
        });
        chart = findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_5intent = new Intent(form_5.this,form_1.class);
                startActivity(a_5intent);
            }
        });
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_10intent = new Intent(form_5.this, form_6.class);
                startActivity(a_10intent);
                finish();
            }
        });
    }
}