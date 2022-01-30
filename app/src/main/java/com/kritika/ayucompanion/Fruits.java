package com.kritika.ayucompanion;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kritika.ayucompanion.food.Apple;
import com.kritika.ayucompanion.food.Apricot;
import com.kritika.ayucompanion.food.Avocado;

public class Fruits extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        // Create an adapter that
        // knows which fragment should
        // be shown on each page
        SimplFragmentPagerAdapter
                adapter = new SimplFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto
        // the view pager
        viewPager.setAdapter(adapter);
    }
}
class SimplFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimplFragmentPagerAdapter(
            FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Apple();
        } else if (position == 1) {
            return new Apricot();
        } else {
            return new Avocado();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}


