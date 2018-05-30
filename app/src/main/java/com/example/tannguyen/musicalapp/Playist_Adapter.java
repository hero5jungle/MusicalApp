package com.example.tannguyen.musicalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Playist_Adapter extends ArrayAdapter<Playist> {

    public Playist_Adapter(Context context, ArrayList<Playist> playists) {
        super(context, 0, playists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_focus__playist, parent, false);
        }

//        Get item position
        Playist currentPlayist = getItem(position);

//        Set text to the tile id
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentPlayist.getTitle());

//        Set text to the artist id
        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentPlayist.getArtist());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlayist.getImageResourceId());
        return listItemView;
    }
}
