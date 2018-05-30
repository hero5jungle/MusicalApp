package com.example.tannguyen.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Focus_Playist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        ArrayList<Playist> playists = new ArrayList<>();
        playists.add(new Playist("Moonlight Sonata", "Beethoven"));
        playists.add(new Playist("Canon in D", "Johann Pachelbel "));
        playists.add(new Playist("Clair De Lune", "Claude Debussy"));

        Playist_Adapter playistArrayAdapter = new Playist_Adapter(this, playists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(playistArrayAdapter);
    }
}