package com.example.androiddemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment extends Fragment {


    // there are 2 types of fragments creation:
    // 1. static fragment created by xml design and pull fragment to activity.
    // 2. dynamic fragment created by java code .. object of fragment and fragment manager.


    Button countBtn;
    Comunicator comunicator;
    int counter = 0;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;

        view = inflater.inflate(R.layout.fragment_blank, container, false);
        countBtn = view.findViewById(R.id.count_btn);
        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comunicator.counter(++counter);
            }
        });
        return view;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comunicator = (CounterActivity) getActivity();
    }
}