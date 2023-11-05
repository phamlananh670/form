package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;



public class form8 extends AppCompatActivity {
    ImageButton imageBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form8);
        imageBt=findViewById(R.id.imageBt);
        imageBt.setOnClickListener(new View.OnClickListener(){
    public void onClick(View view){
        //khai báo intent
            Intent myintent=new Intent(form8.this, form9.class);
            //khoi dong
            startActivity(myintent);
        }
    });
    }
}