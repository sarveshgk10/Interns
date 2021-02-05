package com.example.interns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());
        HashMap<String, Object> profileUpdate = new HashMap<String, Object>();

//Update pre-defined profile properties
        profileUpdate.put("Name", "Sarvesh Kulkarni");
        profileUpdate.put("Email", "sarveshgk10@gmail.com");
//Update custom profile properties
        profileUpdate.put("Plan Type", "Platinum");
       // profileUpdate.put("Identity", 61026032);
        profileUpdate.put("Phone", "+919819569167");
        profileUpdate.put("Gender", "Male");


        clevertapDefaultInstance.pushProfile(profileUpdate);
        clevertapDefaultInstance.pushEvent("Product viewed");

//        CleverTapAPI cleverTapAPI = CleverTapAPI.getDefaultInstance(getApplicationContext());
//        cleverTapAPI.createNotificationChannel(getApplicationContext(),"54321","Sarvesh","CleverTap notification", NotificationManager.IMPORTANCE_MAX,true);
//
//        cleverTapAPI.pushEvent("Test Event");
    }
}