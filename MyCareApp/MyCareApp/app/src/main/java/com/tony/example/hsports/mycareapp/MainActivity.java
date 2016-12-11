package com.tony.example.hsports.mycareapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static ArrayList<String> animalGroups = new ArrayList<String>();
    private static ArrayList<Animal> animalList = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up groupings of animals to be collapsible in AnimalActivity
        animalGroups.add("Big Cats & Bear");
        animalGroups.add("Reptiles & Crocodilians");
        animalGroups.add("Barnyard Bunch");
        animalGroups.add("Small Mammals");
        animalGroups.add("Monkeys");
        animalGroups.add("Birds");
        animalGroups.add("Domestics");

        LoadAnimals();

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

    private void LoadAnimals(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("animalList.txt"));
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";\t");
                for (String str : values) {
                    System.out.println(str);
                }
            }
            reader.close();
        } catch(Exception e) {
            // TODO: Something went horribly wrong.
        }
        animalList.add();
    }
}
