package com.example.musicalstructureapp;

/**
 * {@link Artist} represents a musical artist a user wants to review and the title of his/her/their
 * song from 2000
 */

public class Artist {
    // Name of artist
    private final String mMusicalArtist;

    //Title of song
    private final String mSongTitle;

    // Drawable resource ID
    private int mArtistImageId;

    /**
     * new Artist object
     * @param musicalArtist
     * @param songTitle
     * @param artistImage
     */
    public Artist(String musicalArtist,String songTitle, int artistImage){
        mMusicalArtist = musicalArtist;
        mSongTitle = songTitle;
        mArtistImageId = artistImage;
    }
    // get details about the artist
    public String getmMusicalArtist() {
        return mMusicalArtist;
    }
    // get details about the song
    public String getmSongTitle() {
        return mSongTitle;
    }

    // get artist image
    public int getmArtistImageId(){
        return mArtistImageId;
    }
}

