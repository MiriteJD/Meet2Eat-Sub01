package com.example.dreher.meet2eat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class GruppenFragment extends Fragment {

    public GruppenFragment() {
    }

    static GruppenFragment newInstance() {
        GruppenFragment fragment = new GruppenFragment();

        return fragment;
    }

    TextView gtv;
    ListView glist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_g, container, false);

        glist = (ListView) rootView.findViewById(R.id.listView1);
        gtv = (TextView) rootView.findViewById(R.id.textView2);



        return rootView;
    }
}