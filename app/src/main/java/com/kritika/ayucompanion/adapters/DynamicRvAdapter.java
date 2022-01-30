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

import com.kritika.ayucompanion.food.Dairy;
import com.kritika.ayucompanion.models.DynamicRvModel;
import com.kritika.ayucompanion.Fruits;
import com.kritika.ayucompanion.food.Grains;
import com.kritika.ayucompanion.Oils;
import com.kritika.ayucompanion.R;
import com.kritika.ayucompanion.Spices;
import com.kritika.ayucompanion.vegetable;

import java.util.ArrayList;
public class DynamicRvAdapter extends RecyclerView.Adapter<DynamicRvAdapter.DynamicRvHolder> {
    @NonNull
    @Override
    public DynamicRvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dynamic_rv_item_layout,parent,false);
        DynamicRvHolder dynamicRvHolder= new DynamicRvHolder(view);
        return  dynamicRvHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull DynamicRvHolder holder, int position) {
       DynamicRvModel currenttype= type.get(position);
        holder.imageView.setImageResource(currenttype.getImage());
        holder.textView.setText(currenttype.getName());
        holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
        if(position==0) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Fruits.class);
                    c.startActivity(intent);
                }
            });
        } else if(position==1)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, vegetable.class);
                    c.startActivity(intent);
                }
            });
        else if(position==2)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Oils.class);
                    c.startActivity(intent);
                }
            });
        else if(position==3) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Spices.class);
                    c.startActivity(intent);
                }
            });
        } else if(position==4)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Dairy.class);
                    c.startActivity(intent);
                }
            });
        else if(position==5)
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context c=v.getContext();
                    Intent intent=new Intent(c, Grains.class);
                    c.startActivity(intent);
                }
            });
    }
    @Override
    public int getItemCount() {
        return type.size();
    }
    public ArrayList<DynamicRvModel> type;
    public DynamicRvAdapter(ArrayList<DynamicRvModel> type) {
        this.type=type;
    }
    public class DynamicRvHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;
        public DynamicRvHolder(@NonNull View itemView) {
            super(itemView);
           textView=itemView.findViewById(R.id.t10);
           imageView=itemView.findViewById(R.id.image);
           linearLayout=itemView.findViewById(R.id.LinearLayout);
        }
    }
}

