package com.example.tannguyen.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Playlist_Adapter extends ArrayAdapter<Playlist> {

    public Playlist_Adapter(Context context, ArrayList<Playlist> playlists) {
        super(context, 0, playlists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_focus__playlist, parent, false);
        }

//        Get item position
        Playlist currentplaylist = getItem(position);

//        Set text to the tile id
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentplaylist.getTitle());

//        Set text to the artist id
        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentplaylist.getArtist());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentplaylist.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentplaylist.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setImageResource(R.drawable.play_button);
        }
        return listItemView;
    }
}
