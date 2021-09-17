package com.example.androiddemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class counterFragment extends Fragment {

    TextView counterTV;

    public counterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_counter, container, false);
        counterTV = view.findViewById(R.id.counterFragment);
        return view;


    }

    public void updateTextView(int c) {
        counterTV.setText(c);
    }
}