package com.kritika.ayucompanion;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kritika.ayucompanion.food.Oliveoil;
import com.kritika.ayucompanion.food.Sunfloweroil;
import com.kritika.ayucompanion.food.Walnutoil;

public class Oils extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oils);
        ViewPager viewPager
                = (ViewPager)findViewById(
                R.id.viewpager);

        SimleFragmentPagerAdapter
                adapter
                = new SimleFragmentPagerAdapter(
                getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
class SimleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimleFragmentPagerAdapter(
            FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Oliveoil();
        } else if (position == 1) {
            return new Sunfloweroil();
        } else {
            return new Walnutoil();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

