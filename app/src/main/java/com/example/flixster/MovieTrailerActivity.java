package com.example.flixster;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class MovieTrailerActivity extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_trailer);

        final String videoId = "tKodtNFpzBA";  // replace iwth movie trailer video id
    }
}