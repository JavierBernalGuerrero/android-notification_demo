package com.projects.android.notificationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("FIREBASE TOKEN", "El token es -> " + FirebaseInstanceId.getInstance().getToken());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
