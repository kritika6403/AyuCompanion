package com.kritika.ayucompanion.food;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kritika.ayucompanion.R;
import com.kritika.ayucompanion.adapters.DynamicRvAdapter;
import com.kritika.ayucompanion.models.DynamicRvModel;

import java.util.ArrayList;

public class Food extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DynamicRvAdapter dynamicRvAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        ArrayList<DynamicRvModel> type=new ArrayList<>();
        type.add(new DynamicRvModel(R.drawable.fruits,"Fruits"));
        type.add(new DynamicRvModel(R.drawable.vegetable,"Vegetable"));
        type.add(new DynamicRvModel(R.drawable.oils_1,"Oil"));
        type.add(new DynamicRvModel(R.drawable.spices,"Spices"));
        type.add(new DynamicRvModel(R.drawable.dairyp,"Dairy"));
        type.add(new DynamicRvModel(R.drawable.grains_1,"Grains"));
        recyclerView=findViewById(R.id.rv1);
        dynamicRvAdapter=new DynamicRvAdapter(type);
        RecyclerView.LayoutManager manager= new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(dynamicRvAdapter);
    }
}
