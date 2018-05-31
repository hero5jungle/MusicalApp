package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button workout = findViewById(R.id.button7);
        // Set a click listener on that View
        workout.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent workoutIntent = new Intent(MainActivity.this, Workout_Playist.class);
                // Start the new activity
                startActivity(workoutIntent);
            }
        });

        Button focus = findViewById(R.id.button8);
        // Set a click listener on that View
        focus.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent focusIntent = new Intent(MainActivity.this, Focus_Playlist.class);
                // Start the new activity
                startActivity(focusIntent);
            }
        });

        Button sleep = findViewById(R.id.button10);
        // Set a click listener on that View
        sleep.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent sleepIntent = new Intent(MainActivity.this, Sleep_Playist.class);
                // Start the new activity
                startActivity(sleepIntent);
            }
        });
    }
}
