package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

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
                Intent focusIntent = new Intent(MainActivity.this, Focus_Playist.class);
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
