package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class form9 extends AppCompatActivity {
    ImageButton imageBt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form9);
        imageBt1=findViewById(R.id.imageBt1);
        imageBt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hiintent = new Intent(form9.this,form10.class);
                startActivity(hiintent);
        }

        });
    }
}