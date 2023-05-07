package com.example.ourdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RagistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragistration_activity);


    }

    public void login(View view) {
        startActivity(new Intent(RagistrationActivity.this,LoginActivity.class));
    }
}