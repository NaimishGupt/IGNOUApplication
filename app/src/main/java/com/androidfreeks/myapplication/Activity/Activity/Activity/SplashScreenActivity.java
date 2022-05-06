package com.androidfreeks.myapplication.Activity.Activity.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.androidfreeks.myapplication.R;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity{
    private int SPLASH_SCREEN_TIMEOUT = 4000;
   @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            },SPLASH_SCREEN_TIMEOUT);

    }
}
