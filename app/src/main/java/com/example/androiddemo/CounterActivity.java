package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CounterActivity extends AppCompatActivity implements Comunicator {

    counterFragment Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        Fragment = (counterFragment) getSupportFragmentManager().findFragmentById(R.id.counterFragment);
    }

    @Override
    public void counter(int c) {
      Fragment.updateTextView(c);
    }
}