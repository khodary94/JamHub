package com.example.khodary.jamhub;

import java.util.ArrayList;

/**
 * Created by Khodary on 7/5/15.
 */
public class Track implements myInterface {
    private String title;                //track name
    private String uploader;            //track auploader name
    private boolean band;               //true it the uploader is band
    private int id;                //track id
    private int duration;               //in seconds
    private String imageUrl;              //image source location
    private String upload_date;           //track upload date
    private ArrayList<String> tags;     //track tags
    private Track ancestor;             //ID of ancestor track, null if solo
    private ArrayList<Track> children;          //ID of children tracks, empty if last jam
    //private ArrayList<String> contributors;         //names of contributing users
    //private ArrayList<String> instruments;          //names of instrucments involved
    private String instrument;
    private int likes;                  //number of likes
    private float rating;
    private int raters;

    public Track(String title, String uploader, boolean band, int duration, String imageUrl,
                 ArrayList<String> tags, String instrument){
        this.title = title;
        this.uploader = uploader;
        this.band = band;
        this.duration = duration;
        this.imageUrl = imageUrl;
        this.tags = tags;
        this.instrument = instrument;
    }
    public Track(String Uploader, boolean band, String instrument, Track original){

    }
    @Override
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public void setAncestor(Track ancestor) {
        this.ancestor = ancestor;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void setChildren(ArrayList<Track> children) {
        this.children = children;
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
        return uploader;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public ArrayList<String> getTags() {
        return tags;
    }

    @Override
    public Track getAncestor() {
        return ancestor;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getInstrument() {
        return instrument;
    }

    public ArrayList<String> getContributors(){
        ArrayList<String> contributors = new ArrayList<String>();
        Track node = this;
        do{
            contributors.add(node.getUploader());
        }while(node.getAncestor()!=null);

        return contributors;
    }

    public ArrayList<String> getInstruments(){
        ArrayList<String> instruments = new ArrayList<String>();
        Track node = this;
        do{
            instruments.add(node.getInstrument());
        }while(node.getAncestor()!=null);

        return instruments;
    }
}
