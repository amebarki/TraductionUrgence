package com.hackathon.tradurgence;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PainLocalizeActivity extends AppCompatActivity {


    private Button buttonNext;
    private Button buttonOptions;
    private Button buttonAbdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain_localize);

        buttonNext = findViewById(R.id.buttonNext);
        buttonOptions = findViewById(R.id.buttonOption);
        buttonAbdo = findViewById(R.id.abdoButton);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        buttonOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        buttonAbdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AbdoActivity.class);
                startActivity(intent);
            }
        });

    }


    public void onBackPressed() {
        super.onBackPressed();
        super.finish();
        //Intent
    }

}
