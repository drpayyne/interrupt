package com.lazytomatostudios.interrupt.navbarfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lazytomatostudios.interrupt.MyInterface;
import com.lazytomatostudios.interrupt.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment implements MyInterface{


    public Profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void fragmentVisible() {
        Log.d("TAG", "Profile visible");
    }
}
