package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    Intent intent;
    TextView phoneTV;
    TextView msgTV;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        phoneTV = findViewById(R.id.txtPhone);
        msgTV = findViewById(R.id.txtMessage);
        backButton = findViewById(R.id.btnBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        intent = getIntent();

        msgTV.setText(intent.getStringExtra(MainActivity.MESSAGE));
        phoneTV.setText(intent.getStringExtra(MainActivity.PHONE));
    }
}