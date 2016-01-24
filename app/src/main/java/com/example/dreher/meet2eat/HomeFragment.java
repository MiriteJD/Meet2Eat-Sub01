package com.example.dreher.meet2eat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
    public HomeFragment() {
    }

    TextView htv;
    ListView hlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_h, container, false);
        hlist = (ListView) rootView.findViewById(R.id.listView2);
        htv = (TextView) rootView.findViewById(R.id.textView2);


        return rootView;
    }


}