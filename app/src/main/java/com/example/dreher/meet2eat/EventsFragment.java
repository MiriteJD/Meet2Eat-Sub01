package com.example.dreher.meet2eat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class EventsFragment extends Fragment {

    public EventsFragment() {
    }

    public static EventsFragment newInstance() {
        EventsFragment fragment = new EventsFragment();

        return fragment;
    }

    ListView elist;
    TextView etv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_e, container, false);

        elist = (ListView) rootView.findViewById(R.id.listView3);
        etv = (TextView) rootView.findViewById(R.id.textView2);
        return rootView;
    }
}