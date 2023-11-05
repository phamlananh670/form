package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class form10 extends AppCompatActivity {
     ImageButton imageBt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form10);
        imageBt2 = findViewById(R.id.imageBt2);
        imageBt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent heintent= new Intent(form10.this, form12.class);
                startActivity(heintent);
            }
        });
    }
}