package com.example.khodary.jamhub;

/**
 * Created by Mostafa on 7/5/2015.
 */
public class ServerManager {
    private static String serverURL = "";
    private static String serverStatus = null;
    private static String error = null;

    public static void setServerStatus(String status){
        serverStatus = status;
    }

    public static void setError(String error) {
        ServerManager.error = error;
    }

    public static String getServerURL() {
        return serverURL;
    }

    public static String getServerStatus() {
        return serverStatus;
    }

    public static String getError() {
        return error;
    }
}
