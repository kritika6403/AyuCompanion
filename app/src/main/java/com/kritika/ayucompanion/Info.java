package com.kritika.ayucompanion;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kritika.ayucompanion.adapters.StaticRvAdapter;
import com.kritika.ayucompanion.models.StaticRvModel;

import java.util.ArrayList;

public class Info extends AppCompatActivity {
       private RecyclerView recyclerView,recyclerView1;
       private StaticRvAdapter staticRvAdapter;
       SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);
        ArrayList<StaticRvModel> item= new ArrayList<>();
        item.add(new StaticRvModel(R.drawable.prakartii,"Prakarti"));
        item.add(new StaticRvModel(R.drawable.foodplate,"Food"));
        item.add(new StaticRvModel(R.drawable.yoga,"Yoga"));
        item.add(new StaticRvModel(R.drawable.prakarti,"Meditation"));
        recyclerView=findViewById(R.id.recyclerView);
        staticRvAdapter= new StaticRvAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticRvAdapter);



    }
}

