package com.example.form;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class form12 extends AppCompatActivity {
    ImageView back;
    TextView signup;
    EditText email,password;
    Button bt_continue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form12);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_9intent = new Intent(form12.this, form10.class);
                startActivity(a_9intent);
                finish();
            }
        });
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(form12.this, form11.class);
                startActivity(intent);
            }
        });
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        bt_continue=findViewById(R.id.bt_continue);
        bt_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("alanloveq@gmail.com")&& password.getText().toString().equals("alan123456")){
                    //correct
                    Toast.makeText(form12.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(form12.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}