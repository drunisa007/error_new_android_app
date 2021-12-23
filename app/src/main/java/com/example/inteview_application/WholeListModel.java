package com.example.inteview_application;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WholeListModel {
    @SerializedName("totalResults")
    public Integer totalResults;
    @SerializedName("articles")
    public ArrayList<NewsListModel> data = new ArrayList();

    public ArrayList<NewsListModel> getData() {
        return data;
    }
}
