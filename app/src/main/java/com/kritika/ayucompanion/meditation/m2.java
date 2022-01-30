package com.kritika.ayucompanion.meditation;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.kritika.ayucompanion.R;

public class m2 extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState)
    {
        return inflater
                .inflate(
                        R.layout.fragment_m2,
                        container, false);
    }
}