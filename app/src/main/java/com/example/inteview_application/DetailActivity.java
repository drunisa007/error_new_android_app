package com.example.inteview_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {


    ImageView mImage;
    TextView mTitleText,mTitleDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

       NewsListModel mModel = (NewsListModel) getIntent().getSerializableExtra("data");


        mImage =findViewById(R.id.detail_image);
        mTitleText  = findViewById(R.id.detail_title);
        mTitleDesc = findViewById(R.id.detail_desc);
        Glide.with(DetailActivity.this).load(mModel.getImage()).into(mImage);
        mTitleText.setText(mModel.getTitle());
        mTitleDesc.setText(mModel.getDescription());
    }
}