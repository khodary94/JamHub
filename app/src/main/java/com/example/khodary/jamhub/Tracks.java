package com.example.khodary.jamhub;

/**
 * Created by Khodary on 7/5/15.
 */
public class Tracks implements myInterface {
    private String imageUrl;
    private String title;
    private float rating;
    private int likes;

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public float getRating() {
        return rating;
    }

    @Override
    public int getLikesCount() {
        return likes;
    }
}
