package com.androidfreeks.myapplication.Activity.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.androidfreeks.myapplication.Activity.Activity.Fragment.HomeFragment;
import com.androidfreeks.myapplication.R;

public class LoginActivity extends AppCompatActivity {
    CardView guestUserLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        guestUserLogin = findViewById(R.id.guest_user);
    }
    public void guestUser(){
        guestUserLogin.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this,HomeFragment.class);
            startActivity(intent);
        });
    }
}