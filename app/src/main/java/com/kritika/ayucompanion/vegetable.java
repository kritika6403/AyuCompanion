package com.kritika.ayucompanion;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kritika.ayucompanion.food.Corn;
import com.kritika.ayucompanion.food.Eggplant;
import com.kritika.ayucompanion.food.Onion;

public class vegetable extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Set the content of the activity
        // to use the activity_main.xml
        // layout file
        setContentView(R.layout.vegetable);

        // Find the view pager that will
        // allow the user to swipe
        // between fragments
        ViewPager viewPager
                = (ViewPager)findViewById(
                R.id.viewpager);

        // Create an adapter that
        // knows which fragment should
        // be shown on each page
        SimpleFragmentPagerAdapter
                adapter
                = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto
        // the view pager
        viewPager.setAdapter(adapter);
    }
}
 class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(
            FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Corn();
        } else if (position == 1) {
            return new Onion();
        } else {
            return new Eggplant();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
