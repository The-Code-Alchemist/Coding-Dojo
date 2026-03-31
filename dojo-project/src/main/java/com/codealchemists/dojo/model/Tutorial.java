package com.codealchemists.dojo.model;

public class Tutorial {

    private String title;
    private String platform;

    public Tutorial(String title, String platform) {
        this.title = title;
        this.platform = platform;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }
}
