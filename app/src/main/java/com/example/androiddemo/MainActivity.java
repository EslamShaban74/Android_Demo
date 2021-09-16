package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnClose;
    Intent outIntent;
    EditText phoneEditText;
    EditText msgEditText;
    String txt = "";
    public static final String MESSAGE = "MESSAGE";
    public static final String PHONE = "phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = findViewById(R.id.btnClose);
        phoneEditText = findViewById(R.id.editTextPhone);
        msgEditText = findViewById(R.id.editTextMessage);


        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void next(View view) {

        outIntent = new Intent(MainActivity.this, InfoActivity.class);
        txt = phoneEditText.getText().toString();
        outIntent.putExtra(PHONE, txt);
        txt = msgEditText.getText().toString();
        outIntent.putExtra(MESSAGE, txt);
        startActivity(outIntent);

    }


}