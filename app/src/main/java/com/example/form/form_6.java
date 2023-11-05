package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class form_6 extends AppCompatActivity {
     ImageView gui;
     ImageView chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6);
        gui = findViewById(R.id.gui);
        gui.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent aintent=new Intent(form_6.this, form_5.class);
                startActivity(aintent);
            }
        }
        );
        chart=findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_3intent=new Intent(form_6.this, form_1.class);
                startActivity(a_3intent);
            }
        });
    }
}