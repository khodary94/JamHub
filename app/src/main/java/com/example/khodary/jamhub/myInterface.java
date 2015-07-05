package com.example.khodary.jamhub;

import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Khodary on 7/5/15.
 */
public interface myInterface {
    public void setImageUrl(String imageUrl);
    public void setTitle(String title);
    public void setRating(float rating);
    public void setLikes(int likes);
    public void setUploader(String uploader);
    public void setDuration(int duration);
    public void setTags(ArrayList<String> tags);
    public void setAncestor(Tracks ancestor);
    public void setID(int id);
    public void setInstruments(ArrayList<String> instruments);
    public void setChildren(ArrayList<Tracks> children);

    public String getImageUrl();
    public String getTitle();
    public float getRating();
    public int getLikes();
    public String getUploader();
    public int getDuration();
    public ArrayList<String> getTags();
    public Tracks getAncestor();
    public int getID();
    public ArrayList<String> getInstruments();
}

