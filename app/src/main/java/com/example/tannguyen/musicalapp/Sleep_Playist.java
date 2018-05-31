package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Sleep_Playist extends AppCompatActivity {
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
                Intent backIntent = new Intent(Sleep_Playist.this, MainActivity.class);
                // Start the new activity
                startActivity(backIntent);
            }
        });

//        Create a playist arraylist
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Greensleeves", "David Nevue"));
        playlists.add(new Playlist("A Whole New World", "Aladdin"));
        playlists.add(new Playlist("Colors Of The Wind", "Pocahontas"));

//        Attach the arrayadapter and inflate the listview
        Playist_Adapter playistArrayAdapter = new Playist_Adapter(this, playlists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playistArrayAdapter);
    }
}