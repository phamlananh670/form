package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class form_1 extends AppCompatActivity {
    ImageView home;
    ImageView gui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_6intent = new Intent(form_1.this,form14.class);
                startActivity(a_6intent);
            }
        });
        gui = findViewById(R.id.gui);
        gui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_7intent = new Intent(form_1.this,form_5.class);
                startActivity(a_7intent);
            }
        });
    }
}