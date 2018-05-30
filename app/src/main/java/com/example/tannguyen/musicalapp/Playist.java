package com.example.tannguyen.musicalapp;

public class Playist {
    private String mTitle;
    private String mArtist;
    private int mImageResourceId;

    public Playist(String title, String artist) {
        mTitle = title;
        mArtist = artist;
    }

    public Playist(String title, String artist, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
