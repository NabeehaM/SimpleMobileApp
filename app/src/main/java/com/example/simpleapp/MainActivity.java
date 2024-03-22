package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        LinearLayout tabOneLayout = findViewById(R.id.tabOneLayout);
        LinearLayout tabTwoLayout = findViewById(R.id.tabTwoLayout);
        LinearLayout tabThreeLayout = findViewById(R.id.tabThreeLayout);

        tabOneLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.tabOneIndicator).setVisibility(View.VISIBLE);
                findViewById(R.id.tabTwoIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabThreeIndicator).setVisibility(View.INVISIBLE);
            }
        });
        tabTwoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tabOneIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabTwoIndicator).setVisibility(View.VISIBLE);
                findViewById(R.id.tabThreeIndicator).setVisibility(View.INVISIBLE);
            }
        });

        tabThreeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tabOneIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabTwoIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabThreeIndicator).setVisibility(View.VISIBLE);
            }
        });
    }







}