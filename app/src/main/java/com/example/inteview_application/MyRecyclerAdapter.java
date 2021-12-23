package com.example.inteview_application;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {


    MainActivity context;

    ArrayList<NewsListModel> mList;

    public MyRecyclerAdapter(MainActivity context, ArrayList<NewsListModel> mList){
        this.context = context;
        this.mList = mList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_single_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,int position) {
      holder.mTextTitle.setText(mList.get(position).getTitle());
      holder.mTextViewDesc.setText(mList.get(position).getDescription());
      Glide.with(context).load(mList.get(position).getImage()).fitCenter().into(holder.mImage);
      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(context,DetailActivity.class);
              intent.putExtra("data",mList.get(holder.getAdapterPosition()));
              context.startActivity(intent);
          }
      });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextTitle,mTextViewDesc;
        ImageView mImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextTitle = itemView.findViewById(R.id.recylcer_single_title);
            mTextViewDesc = itemView.findViewById(R.id.recylcer_single_desc);
            mImage = itemView.findViewById(R.id.recylcer_single_image);
        }
    }
}
