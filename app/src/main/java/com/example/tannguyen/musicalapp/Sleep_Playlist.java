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

public class Sleep_Playlist extends AppCompatActivity {

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
                Intent backIntent = new Intent(Sleep_Playlist.this, MainActivity.class);
                // Start the new activity
                startActivity(backIntent);
            }
        });

//        Create a playlist arraylist
        final ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Greensleeves", "David Nevue", R.raw.greensleeves));
        playlists.add(new Playlist("A Whole New World", "Aladdin", R.raw.a_whole_new_world));
        playlists.add(new Playlist("Colors Of The Wind", "Pocahontas", R.raw.colors_of_the_wind));

//        Attach the arrayadapter and inflate the listview
        Playlist_Adapter playlistArrayAdapter = new Playlist_Adapter(this, playlists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playlistArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Playlist playlist = playlists.get(position);
                mMediaPlayer = MediaPlayer.create(Sleep_Playlist.this, playlist.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}