package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Focus_Playlist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        Button back = findViewById(R.id.back);
        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Focus_Playlist.this, MainActivity.class);
                // Start the new activity
                startActivity(backIntent);
            }
        });

        //        Create a playist arraylist
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Moonlight Sonata", "Beethoven"));
        playlists.add(new Playlist("Canon in D", "Johann Pachelbel "));
        playlists.add(new Playlist("Clair De Lune", "Claude Debussy"));

        //        Attach the arrayadapter and inflate the listview
        Playist_Adapter playistArrayAdapter = new Playist_Adapter(this, playlists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playistArrayAdapter);
    }
}