package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Workout_Playlist extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

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
                Intent backIntent = new Intent(Workout_Playlist.this, MainActivity.class);
                // Start the new activity
                startActivity(backIntent);
            }
        });

        //        Create a playlist arraylist
        final ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Thunderstruck", "AC/DC", R.raw.thuderstruck));
        playlists.add(new Playlist("Hustlin\'", "Rick Ross", R.raw.hutslin));
        playlists.add(new Playlist("X Gon' Give It to Ya", "DMX", R.raw.x_goin_to_give_it));

        //        Attach the arrayadapter and inflate the listview
        Playlist_Adapter playlistArrayAdapter = new Playlist_Adapter(this, playlists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playlistArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Playlist playlist = playlists.get(position);
                mMediaPlayer = MediaPlayer.create(Workout_Playlist.this, playlist.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}