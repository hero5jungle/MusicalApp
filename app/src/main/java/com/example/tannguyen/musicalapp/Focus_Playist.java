package com.example.tannguyen.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Focus_Playist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus__playist);
        setContentView(R.layout.list);


        ArrayList<Playist> playists = new ArrayList<>();
        playists.add(new Playist("a", "1"));
        playists.add(new Playist("b", "2"));
        playists.add(new Playist("c", "3"));

        Playist_Adapter playistArrayAdapter = new Playist_Adapter(this, playists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(playistArrayAdapter);
    }
}
