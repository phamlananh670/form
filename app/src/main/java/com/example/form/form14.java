package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class form14 extends AppCompatActivity {
    ImageView gui;
    ImageView chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form14);
        gui=findViewById(R.id.gui);
        gui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_1intent = new Intent(form14.this, form_5.class);
                startActivity(a_1intent);
            }
        });
        chart=findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_2intent = new Intent(form14.this, form_1.class);
                startActivity(a_2intent);
            }
        });
    }
}