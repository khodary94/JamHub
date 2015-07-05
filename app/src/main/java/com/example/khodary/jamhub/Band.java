package com.example.khodary.jamhub;

import java.util.ArrayList;

/**
 * Created by Mostafa on 6/29/2015.
 */
public class Band {
    public String name;
    public ArrayList<User> members;
    public ArrayList<Track> tracks;

    public Band(String name){
        this.name = name;
        members = null;
        tracks = null;
    }

    public void addMember(User member){
        members.add(member);
    }

    public void addTrack(Track track){
        tracks.add(track);
    }
}