package com.tony.example.hsports.mycareapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

/**
 * Created by Tony on 11/24/2016.
 */

public class AnimalActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_layout);

        ImageButton luciousButton = (ImageButton)  findViewById(R.id.luciousButton);
        luciousButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //setResult(RESULT_OK);
                //finish();

                //startLuciousActivity();
                startSpecificAnimalActivity();
            }
        } );
    }

    public void startSpecificAnimalActivity(){
        Intent intent = new Intent(this, specificAnimal.class);
        startActivity(intent);

        Log.d("lucious button clicked", "the lucious button was clicked");
    }

}
