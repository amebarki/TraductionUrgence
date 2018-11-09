package com.hackathon.tradurgence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PainLocalizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain_localize);
    }


    public void onBackPressed()
    {
        super.onBackPressed();
        super.finish();
        //Intent
    }

}
