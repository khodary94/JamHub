package com.example.khodary.jamhub;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mostafa on 6/29/2015.
 */
public class Track {
    private String name;                //track name
    private String uploader;            //track auploader name
    private boolean band;               //true it the uploader is band
    private int trackID;                //track id
    private int duration;               //in seconds
    private String imgurl;              //image source location
    private String upload_date;           //track upload date
    private ArrayList<String> tags;     //track tags
    private Track ancestor;             //ID of ancestor track, null if solo
    private ArrayList<Track> children;          //ID of children tracks, empty if last jam
    //private ArrayList<String> contributors;         //names of contributing users
    //private ArrayList<String> instruments;          //names of instrucments involved
    String instrument;
    private int likes;                  //number of likes
    private double rating;              //track average rating
    private int raters;                 //number of raters

    public static int id=0;

    public Track(String name, String uploader, boolean band, int duration, String imgurl, ArrayList<String> tags, String instrument){
        this.name = name;
        this.uploader = uploader;
        this.band = band;
        trackID = ++id;
        this.duration = duration;
        this.imgurl = imgurl;
        Date date = new Date();
        upload_date = new SimpleDateFormat("dd-MM-yyyy").format(date);
        this.tags = tags;
        ancestor = null;
        children = null;
        //contributors = null;
        this.instrument = instrument;
        likes = 0;
        rating = 0;
        raters = 0;
    }

    public Track(String uploader, boolean band, String instrument, Track ancestor){
        this.name = ancestor.name;
        this.uploader = uploader;
        this.band = band;
        trackID = ++id;
        this.duration = ancestor.duration;
        this.tags = ancestor.tags;
        this.ancestor = ancestor;
        children = null;
        //contributors = ancestor.contributors;
        //contributors.add(ancestor.uploader);
        this.instrument = instrument;
        likes = 0;
        rating = 0;
        raters = 0;

        ancestor.children.add(this);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public void addTag(String tag){
        tags.add(tag);
    }

    public void addTags(ArrayList<String> tags){
        this.tags.addAll(tags);
    }

    public void like(){
        likes = likes++;
    }

    public void rate(double rating){
        double totalRating = (double) (this.rating * raters);
        totalRating += rating;
        raters++;
        this.rating = totalRating / raters;
    }

    public int getTrackID(){
        return trackID;
    }

    public String getImgurl() {
        return imgurl;
    }

    public String getUploader(){
        return uploader;
    }

    public String getInstrument(){
        return instrument;
    }

    public int getDuration(){
        return duration;
    }

    public String getUpload_date() {
        return upload_date;
    }

    public Track getAncestor(){
        return ancestor;
    }

    public ArrayList<Track> getChildren(){
        return children;
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
