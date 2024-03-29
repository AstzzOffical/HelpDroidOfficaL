package com.tpxsofts.helpdroid.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tpxsofts.helpdroid.Model.MessagesnotificationDataForPopullation;
import com.tpxsofts.helpdroid.R;

import java.util.ArrayList;

public class MyadapterMessagesnotification extends  RecyclerView.Adapter<MyadapterMessagesnotification.MyViewHolder>{
ArrayList<MessagesnotificationDataForPopullation> dataArray=new ArrayList<>();

    int position=0;
Context context;
    MessagesnotificationDataForPopullation  data;
View v;
    public MyadapterMessagesnotification(ArrayList<MessagesnotificationDataForPopullation> dataArray, Context context) {
        this.dataArray = dataArray;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
     LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
     v=layoutInflater.inflate(R.layout.itemfor_grid_msg,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
data=dataArray.get(i);
        myViewHolder.img.setImageResource(data.Pic);



    }

    @Override
    public int getItemCount() {
        return dataArray.size();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {
ImageView img;
        public MyViewHolder(View v) {
            super(v);
            img=v.findViewById(R.id.imggrid);


            //      position=getAdapterPosition();

        }}



}
