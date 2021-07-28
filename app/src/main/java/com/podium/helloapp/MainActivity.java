package com.podium.helloapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = findViewById(R.id.textCount);
    }

    public void showToast(View view) {
        Toast.makeText(this, "this is android 2021", Toast.LENGTH_LONG).show();
    }

    public void updateCount(View v) {
        counter++;
        textCount.setText(String.valueOf(counter));
    }

    //todo add a reset button to reset the counter
}