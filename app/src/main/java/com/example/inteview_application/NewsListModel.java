package com.example.inteview_application;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class NewsListModel implements Serializable {

    private String title;
    private String description;
    private String image;

    public NewsListModel(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
