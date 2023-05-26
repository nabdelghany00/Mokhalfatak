package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {
    Button btnUser;
    Button btnPO;

//Login as User or Police Officer
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        btnUser = findViewById(R.id.btnUser);
        btnPO = findViewById(R.id.btnPO);

        btnUser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, SignInUserActivity.class);
                startActivity(intent);
            }
        });

        btnPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this, SignInPoliceActivity.class);
                startActivity(intent);
            }
        });

    }
}