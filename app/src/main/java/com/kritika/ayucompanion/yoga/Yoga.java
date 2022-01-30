package com.kritika.ayucompanion.yoga;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kritika.ayucompanion.R;
import com.kritika.ayucompanion.adapters.YogaAdapter;
import com.kritika.ayucompanion.models.YogaRvModel;

import java.util.ArrayList;

public class Yoga extends AppCompatActivity {
    LinearLayout linearLayout;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yoga);
        ArrayList<YogaRvModel> yoga_list=new ArrayList<>();
        yoga_list.add(new YogaRvModel(R.drawable.adomukashvanasana,"Ado-mukashvanasana"));
        yoga_list.add(new YogaRvModel(R.drawable.akarnadhanurasana,"Akarna-Dhanurasana"));
        yoga_list.add(new YogaRvModel(R.drawable.anantasana,"Anantasana"));
        yoga_list.add(new YogaRvModel(R.drawable.ardhachandrasanayogaasana,"Ardha-Chandrasana "));
        yoga_list.add(new YogaRvModel(R.drawable.ardhardhwabhujangasana,"Ardhar-Dhwabhujangasana"));
        yoga_list.add(new YogaRvModel(R.drawable.baddhakonasana,"Baddhakon asana"));
        yoga_list.add(new YogaRvModel(R.drawable.bakasanayogaasana,"Bakasana"));
        yoga_list.add(new YogaRvModel(R.drawable.bhujangasanayogaasana,"Bhujangasana asana"));
        yoga_list.add(new YogaRvModel(R.drawable.dhanurasanayogaasana,"Dhanurasana"));
               linearLayout=findViewById(R.id.lt2);
               recyclerView=findViewById(R.id.rv1);
               YogaAdapter yogaAdapter=new YogaAdapter(yoga_list);
               LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
               recyclerView.setLayoutManager(manager);
              recyclerView.setAdapter(yogaAdapter);
    }
}
