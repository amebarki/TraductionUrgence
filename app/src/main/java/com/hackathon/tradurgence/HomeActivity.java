package com.hackathon.tradurgence;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hackathon.Country;
import com.hackathon.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HomeActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private Button buttonNext;
    private List<Country> countries = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonNext = findViewById(R.id.button);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PainLocalizeActivity.class);
                startActivity(intent);
            }
        });

        addCountries();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false));
        recyclerView.setAdapter(new MyAdapter(countries, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Country item) {
                Toast.makeText(getApplicationContext(), "Item Clicked : " + item.text, Toast.LENGTH_LONG).show();
                String languageToLoad = null;
                    recreate();
                if (item.text.equals("Espagne")) {
                    languageToLoad = "es";
                } else if (item.text.equals("English")) {
                    Log.d("URGENCE","English");
                    languageToLoad = "en";
                } else if (item.text.equals("French")) {
                    languageToLoad = "fr";
                }
                if (languageToLoad != null) {
                    Locale locale = new Locale(languageToLoad);
                    Locale.setDefault(locale);
                    Configuration config = new Configuration();
                    config.locale = locale;
                    getBaseContext().getResources().updateConfiguration(config,
                            getBaseContext().getResources().getDisplayMetrics());
                }
            }
        }));
    }

    private void addCountries() {
        countries.add(new Country("French", R.drawable.french));
        countries.add(new Country("English", R.drawable.kingdom));
        countries.add(new Country("German", R.drawable.german));
        countries.add(new Country("Spanish", R.drawable.spain));
    }
}
