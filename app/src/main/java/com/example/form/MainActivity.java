package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   ImageView b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    b1=findViewById(R.id.b1);
    b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent a_8intent = new Intent(MainActivity.this,form13.class);
        startActivity(a_8intent);
        finish();
        }
    });
    }
}