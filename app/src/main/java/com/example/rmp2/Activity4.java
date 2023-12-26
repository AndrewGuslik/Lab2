package com.example.rmp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void changebutton(View view) {
        Button button19 = findViewById(R.id.button9) ;
        button19.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));


    }
}