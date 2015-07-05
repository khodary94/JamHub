package com.example.khodary.jamhub;

import android.os.AsyncTask;

/**
 * Created by Mostafa on 7/5/2015.
 */
public class InsertTrack extends AsyncTask<Track, Void, String> {
    @Override
    protected String doInBackground(Track... params) {
        String response=null;
        return response;
    }

    @Override
    protected void onPostExecute(String s) {
        ServerManager.setServerStatus(s);
    }
}
