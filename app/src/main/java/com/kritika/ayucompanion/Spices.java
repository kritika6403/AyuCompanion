package com.kritika.ayucompanion;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kritika.ayucompanion.food.Blackpepper;
import com.kritika.ayucompanion.food.Coriander;
import com.kritika.ayucompanion.food.Cumin;

public class Spices extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spices);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        // Create an adapter that
        // knows which fragment should
        // be shown on each page
        SimpFragmentPagerAdapter
                adapter = new SimpFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto
        // the view pager
        viewPager.setAdapter(adapter);
    }
}
class SimpFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpFragmentPagerAdapter(
            FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Coriander();
        } else if (position == 1) {
            return new Cumin();
        } else {
            return new Blackpepper();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}



