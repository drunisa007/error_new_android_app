package com.example.inteview_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;

    ArrayList<NewsListModel> mList = new ArrayList<NewsListModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0;i<10;i++){
            mList.add(new NewsListModel("title"+i,"This is just description",
                   "https://i.guim.co.uk/img/media/ca6510f803407d964fd80ff9557086fe8b4ffd67/0_0_2500_1500/master/2500.jpg?width=1200&height=630&quality=85&auto=format&fit=crop&overlay-align=bottom%2Cleft&overlay-width=100p&overlay-base64=L2ltZy9zdGF0aWMvb3ZlcmxheXMvdGctZGVmYXVsdC5wbmc&enable=upscale&s=97716d5459b278ab12bea31316f47f0f"));
        }

     mRecyclerView = findViewById(R.id.news_recycler);
      mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
     mRecyclerView.setAdapter(new MyRecyclerAdapter(MainActivity.this,mList));










//        fetchingNewsDataFromApi();




    }

    private void fetchingNewsDataFromApi() {

    }
}