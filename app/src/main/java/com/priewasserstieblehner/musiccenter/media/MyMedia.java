package com.priewasserstieblehner.musiccenter.media;

import android.net.Uri;

/**
 * Created by jakob_000 on 19.12.2015.
 */
public class MyMedia {
    private long id;
    private String title;
    private Uri uri;
    private MediaType type;

    public MyMedia(MediaType type, long id, String title, Uri uri) {
        this(type, id, title);
        this.uri = uri;
    }

    public MyMedia(MediaType type, long id, String title) {
        this.type = type;
        this.id = id;
        this.title = title;
    }

    public void setUri(Uri uri) { this.uri = uri; }

    public long getId() { return id; }

    public String getTitle() { return title; }

    public Uri getUri() { return uri; }

    public MediaType getType() { return type; }

}

