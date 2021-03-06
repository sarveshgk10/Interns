package com.example.interns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.Date;
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
        profileUpdate.put("Phone", "+919819569167");
        profileUpdate.put("Gender", "Male");


        //clevertapDefaultInstance.pushProfile(profileUpdate);
        //clevertapDefaultInstance.pushEvent("Product viewed");

        HashMap<String, Object> prodViewedAction = new HashMap<String, Object>();
        prodViewedAction.put("Product Name", "Nike Shoes");
        prodViewedAction.put("Category", "Shoes");
        prodViewedAction.put("Price", 159.99);
        prodViewedAction.put("Date", new Date());

        clevertapDefaultInstance.pushEvent("Product viewed", prodViewedAction);
//        CleverTapAPI cleverTapAPI = CleverTapAPI.getDefaultInstance(getApplicationContext());
//        cleverTapAPI.createNotificationChannel(getApplicationContext(),"54321","Sarvesh","CleverTap notification", NotificationManager.IMPORTANCE_MAX,true);
//
//        cleverTapAPI.pushEvent("Test Event");
    }
}