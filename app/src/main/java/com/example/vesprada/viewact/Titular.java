package com.example.vesprada.viewact;

/**
 * Created by vesprada on 26/10/15.
 */
public class Titular {
    private String title;
    private String subtitle;
    private String url;
    private int imageResource;

    public Titular(String title, String subtitle, int imageResource, String url) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageResource = imageResource;
        this.url = url;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getSubtitle() {
        return subtitle;
    }
    public String getUrl() { return this.url; }
    public String getTitle() {
        return title;
    }
}
