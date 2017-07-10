package com.example.gregorymohacsi.toptendownloader;

import java.util.ArrayList;

/**
 * Created by gregorymohacsi on 7/10/17.
 */
public class ParseApplications {

    private static final String TAG = "ParseApplications";
    private ArrayList<FeedEntry> applications;

    public ParseApplications() {
        this.applications = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }

}
