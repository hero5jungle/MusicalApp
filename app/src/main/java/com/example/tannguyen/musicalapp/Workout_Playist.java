package com.example.tannguyen.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Workout_Playist extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        ArrayList<Playist> playists = new ArrayList<>();
        playists.add(new Playist("Thunderstruck", "AC/DC"));
        playists.add(new Playist("Hustlin\'", "Rick Ross"));
        playists.add(new Playist("X Gon' Give It to Ya", "DMX"));

        Playist_Adapter playistArrayAdapter = new Playist_Adapter(this, playists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(playistArrayAdapter);
    }
}