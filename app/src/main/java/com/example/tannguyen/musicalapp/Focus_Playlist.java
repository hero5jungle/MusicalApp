package com.example.tannguyen.musicalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Focus_Playlist extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

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
                releaseMediaPlayer();
                startActivity(backIntent);
            }
        });

        //        Create a playlist arraylist
        final ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Moonlight Sonata", "Beethoven", R.raw.moonlight_sonata));
        playlists.add(new Playlist("Canon in D", "Johann Pachelbel", R.raw.canon_in_d));
        playlists.add(new Playlist("Clair De Lune", "Claude Debussy", R.raw.clair_de_lune));

        //        Attach the arrayadapter and inflate the listview
        Playlist_Adapter playlistArrayAdapter = new Playlist_Adapter(this, playlists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(playlistArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Playlist playlist = playlists.get(position);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(Focus_Playlist.this, playlist.getAudioResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}