package com.example.khodary.jamhub;

import java.util.ArrayList;

/**
 * Created by Khodary on 7/5/15.
 */
public class Tracks implements myInterface {
    private String imageUrl;
    private String title;
    private float rating;
    private int likes;

    @Override
    public void setImageUrl(String imageUrl) {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setRating(float rating) {

    }

    @Override
    public void setLikes(int likes) {

    }

    @Override
    public void setUploader(String uploader) {

    }

    @Override
    public void setDuration(int duration) {

    }

    @Override
    public void setTags(ArrayList<String> tags) {

    }

    @Override
    public void setAncestor(Tracks ancestor) {

    }

    @Override
    public void setID(int id) {

    }

    @Override
    public void setInstruments(ArrayList<String> instruments) {

    }

    @Override
    public void setChildren(ArrayList<Tracks> children) {

    }

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
    public int getLikes() {
        return likes;
    }

    @Override
    public String getUploader() {
        return null;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public ArrayList<String> getTags() {
        return null;
    }

    @Override
    public Tracks getAncestor() {
        return null;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public ArrayList<String> getInstruments() {
        return null;
    }
}
