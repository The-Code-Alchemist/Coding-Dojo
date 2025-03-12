package com.codingdojo.model;

public class Tutorial {
    private Long id;
    private String title;
    private String description;
    private String link;
    private String platform;

    public Tutorial(Long id, String title, String description, String link, String platform) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.platform = platform;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }
}
