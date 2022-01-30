package com.kritika.ayucompanion.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kritika.ayucompanion.R;
import com.kritika.ayucompanion.yoga.Yoga1;
import com.kritika.ayucompanion.yoga.Yoga2;
import com.kritika.ayucompanion.yoga.Yoga3;
import com.kritika.ayucompanion.yoga.Yoga4;
import com.kritika.ayucompanion.yoga.Yoga5;
import com.kritika.ayucompanion.yoga.Yoga6;
import com.kritika.ayucompanion.yoga.Yoga7;
import com.kritika.ayucompanion.yoga.Yoga8;
import com.kritika.ayucompanion.yoga.Yoga9;
import com.kritika.ayucompanion.models.YogaRvModel;

import java.util.ArrayList;

public class YogaAdapter extends RecyclerView.Adapter<YogaAdapter.YogaRvHolder> {
    @NonNull
    @Override
    public YogaAdapter.YogaRvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.yoga_rv_item,parent,false);
        YogaAdapter.YogaRvHolder yogaRvHolder= new YogaRvHolder(view);
        return  yogaRvHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull YogaAdapter.YogaRvHolder holder, int position) {
        YogaRvModel current_Yoga=yoga_list.get(position);
        holder.imageView.setImageResource(current_Yoga.getImage());
        holder.textView.setText(current_Yoga.getName());
        holder.linearLayout.setBackgroundResource(R.drawable.dynamic_rv_bg);
        if (position==0)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga1.class);
                    c.startActivity(intent);
                }
            });
        else if (position==1)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga2.class);
                    c.startActivity(intent);
                }
            });
        else if (position==2)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga3.class);
                    c.startActivity(intent);
                }
            });
        else if (position==3)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga4.class);
                    c.startActivity(intent);
                }
            });
        else if (position==4)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga5.class);
                    c.startActivity(intent);
                }
            });
        else if (position==5)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga6.class);
                    c.startActivity(intent);
                }
            });
        else if (position==6)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga7.class);
                    c.startActivity(intent);
                }
            });
        else if (position==7)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga8.class);
                    c.startActivity(intent);
                }
            });
        else if (position==8)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Yoga9.class);
                    c.startActivity(intent);
                }
            });
    }
    public ArrayList<YogaRvModel> yoga_list;
    public YogaAdapter(ArrayList<YogaRvModel> yoga_list){
        this.yoga_list=yoga_list;
    }

    @Override
    public int getItemCount() {
        return yoga_list.size();
    }

    public static class YogaRvHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        LinearLayout linearLayout;
        public YogaRvHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.yoga);
            textView=itemView.findViewById(R.id.yogaName);
            linearLayout=itemView.findViewById(R.id.lt1);
        }
    }
}
