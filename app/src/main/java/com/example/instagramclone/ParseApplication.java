package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yMolfsQfB7LOMRKxUeXy41NBGzOItvKtsYYablCR")
                .clientKey("s6qBQK1LbDgPlW4T4klcBP7NJEdDGQzqyWjIrgqj")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
