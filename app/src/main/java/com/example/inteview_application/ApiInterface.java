package com.example.inteview_application;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("everything?q=headline&apiKey=a8192b9ff1dd413cac9d4aa40689815a")
    Call<WholeListModel> doGetListResources();
}
