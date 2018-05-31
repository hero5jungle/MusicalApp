package com.example.tannguyen.musicalapp;

public class Playlist {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mTitle;
    private String mArtist;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Playlist(String title, String artist) {
        mTitle = title;
        mArtist = artist;
    }

    public Playlist(String title, String artist, int imageResourceId, int audioResourceId) {
        mTitle = title;
        mArtist = artist;
        mAudioResourceId = audioResourceId;
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

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
