package com.hackathon.tradurgence;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        //Glide.with(this).asGif().load(R.drawable.animated_picture).into(imageView);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Locale object
                Locale locale = new Locale("en");
                Locale.setDefault(locale);
                // Create a new configuration object
                Configuration config = new Configuration();
                // Set the locale of the new configuration
                config.locale = locale;
                // Update the configuration of the Application context
                getResources().updateConfiguration(
                        config,
                        getResources().getDisplayMetrics()
                );
             setContentView(R.layout.activity_main);
            }
        });


    }






}
