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

import com.kritika.ayucompanion.food.Food;
import com.kritika.ayucompanion.Meditation;
import com.kritika.ayucompanion.Prakriti;
import com.kritika.ayucompanion.R;
import com.kritika.ayucompanion.models.StaticRvModel;
import com.kritika.ayucompanion.yoga.Yoga;

import java.util.ArrayList;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRVViewholder> {
    private ArrayList<StaticRvModel> item;
    int row_index=-1;
    private View.OnClickListener mOnclicListener;

    public StaticRvAdapter(ArrayList<StaticRvModel> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public StaticRVViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item,parent,false);
        StaticRVViewholder staticRVViewholder=new StaticRVViewholder(view);
        return  staticRVViewholder;
    }


    @Override
    public void onBindViewHolder(@NonNull StaticRVViewholder holder, int position) {
        StaticRvModel currentitem = item.get(position);
        holder.imageView.setImageResource(currentitem.getImage());
        holder.textView.setText(currentitem.getName());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();
            }
        });
        if (row_index == position) {
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
        } else {
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);
        }
        if (position == 0) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c = v.getContext();
                    Intent intent = new Intent(c, Prakriti.class);
                    c.startActivity(intent);
                }
            });
        }
        else if (position==1)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c = v.getContext();
                    Intent intent = new Intent(c, Food.class);
                    c.startActivity(intent);
                }
            });
        else if (position==2)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c = v.getContext();
                    Intent intent = new Intent(c, Yoga.class);
                    c.startActivity(intent);
                }
            });
        else if (position==3)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c = v.getContext();
                    Intent intent = new Intent(c, Meditation.class);
                    c.startActivity(intent);
                }
            });
    }
    @Override
    public int getItemCount() {
        return item.size();
    }

    public static class StaticRVViewholder extends RecyclerView.ViewHolder  {
        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;
        public StaticRVViewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            linearLayout = itemView.findViewById(R.id.linear);
        }
    }

}

