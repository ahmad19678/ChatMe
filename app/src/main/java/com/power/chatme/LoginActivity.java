package com.power.chatme;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    private FirebaseUser currentUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        if(currentUser!=null){
//            SendUserToMainActivity();
//
//        }
//    }
//
//    private void SendUserToMainActivity() {
//
//        Intent MainIntent = new Intent(LoginActivity.this,MainActivity.class);
//        startActivity(MainIntent);
//    }

}