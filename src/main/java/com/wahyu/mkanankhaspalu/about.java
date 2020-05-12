package com.wahyu.mkanankhaspalu;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.ActionBar;
import android.os.Bundle;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            // aslo set in menifest
        }

        assert actionBar != null;
        actionBar.setTitle("About");
    }
}
