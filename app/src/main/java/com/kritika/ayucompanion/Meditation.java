package com.kritika.ayucompanion;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kritika.ayucompanion.meditation.m2;
import com.kritika.ayucompanion.meditation.m3;
import com.kritika.ayucompanion.meditation.medifragment;

public class Meditation extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditation);

        ViewPager viewPager
                = (ViewPager)findViewById(
                R.id.viewpager);

        SsimpleFragmentPagerAdapter
                adapter
                = new SsimpleFragmentPagerAdapter(
                getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
class SsimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SsimpleFragmentPagerAdapter(
            FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new medifragment();
        } else if (position == 1) {
            return new m2();
        } else {
            return new m3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
