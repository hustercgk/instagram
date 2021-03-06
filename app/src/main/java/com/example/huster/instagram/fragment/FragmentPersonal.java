package com.example.huster.instagram.fragment;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.huster.instagram.R;

public class FragmentPersonal extends Fragment {
    static Fragment fragmentPersonal = null;
    public FragmentPersonal() {
        // Required empty public constructor
    }
    static public Fragment newInstance(){
        if(fragmentPersonal==null) fragmentPersonal = new FragmentPersonal();
        return fragmentPersonal;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal, container, false);
    }

    @Override
    public void onDestroy() {
        fragmentPersonal = null;
        super.onDestroy();
    }
}
