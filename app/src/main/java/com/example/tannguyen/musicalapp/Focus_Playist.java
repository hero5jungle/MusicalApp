package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Focus_Playist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        Button goBack = findViewById(R.id.back);
        // Set a click listener on that View
        goBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent goBackIntent = new Intent(Focus_Playist.this, MainActivity.class);
                // Start the new activity
                startActivity(goBackIntent);
            }
        });

        //        Create a playist arraylist
        ArrayList<Playist> playists = new ArrayList<>();
        playists.add(new Playist("Moonlight Sonata", "Beethoven"));
        playists.add(new Playist("Canon in D", "Johann Pachelbel "));
        playists.add(new Playist("Clair De Lune", "Claude Debussy"));

        //        Attach the arrayadapter and inflate the listview
        Playist_Adapter playistArrayAdapter = new Playist_Adapter(this, playists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playistArrayAdapter);
    }
}