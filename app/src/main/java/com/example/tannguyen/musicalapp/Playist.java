package com.example.tannguyen.musicalapp;

public class Playist {
    private String mTitle;
    private String mArtist;


    public Playist(String title, String artist){
        mTitle = title;
        mArtist = artist;

    }
    public String getTitle(){
        return mTitle;
    }

    public String getArtist(){
        return mArtist;
    }
}
