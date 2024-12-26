package com.example.metalife_beta.funcionalities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.MainActivity;
import com.example.metalife_beta.R;
import com.example.metalife_beta.SignInActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        }, 800);

    }
}