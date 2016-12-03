package com.tony.example.hsports.mycareapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mapActivityButton = (Button) findViewById(R.id.launchMapButton);
        mapActivityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startMapActivity();
            }
        } );

        Button animalActivityButton = (Button) findViewById(R.id.launchAnimalButton);
        animalActivityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startAnimalActivty();
            }
        });
    }

    public void startMapActivity(){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);

        Log.d("map button clicked", "the map button was clicked");
    }

    public void startAnimalActivty(){
        Intent intent = new Intent(this, AnimalActivity.class);
        startActivity(intent);

        Log.d("Animal button clicked", "animal button was clicked");
    }
}
