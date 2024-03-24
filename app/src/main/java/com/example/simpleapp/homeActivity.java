package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class homeActivity extends AppCompatActivity {

    ImageButton backbtn;
    LinearLayout tabOneLayout,tabTwoLayout,tabThreeLayout;
    FragmentManager manager;
    Fragment profileFrag,blankFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        init();
        manager.beginTransaction()
                .hide(profileFrag)
                .show(blankFrag)
                .commit();
        setListeners();



    }
    public void init()
    {
        backbtn = findViewById(R.id.backButton);
        tabOneLayout = findViewById(R.id.tabOneLayout);
        tabTwoLayout = findViewById(R.id.tabTwoLayout);
        tabThreeLayout = findViewById(R.id.tabThreeLayout);

        manager = getSupportFragmentManager();
        blankFrag = manager.findFragmentById(R.id.blank_frag);
        profileFrag = manager.findFragmentById(R.id.prof_frag);
    }
    public void setListeners() {
        tabOneLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tabOneIndicator).setVisibility(View.VISIBLE);
                findViewById(R.id.tabTwoIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabThreeIndicator).setVisibility(View.INVISIBLE);

                manager.beginTransaction()
                        .hide(profileFrag)
                        .show(blankFrag)
                        .commit();
            }
        });

        tabTwoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tabOneIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabTwoIndicator).setVisibility(View.VISIBLE);
                findViewById(R.id.tabThreeIndicator).setVisibility(View.INVISIBLE);

                manager.beginTransaction()
                        .hide(profileFrag)
                        .show(blankFrag)
                        .commit();
            }
        });

        tabThreeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tabOneIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabTwoIndicator).setVisibility(View.INVISIBLE);
                findViewById(R.id.tabThreeIndicator).setVisibility(View.VISIBLE);

                manager.beginTransaction()
                        .hide(blankFrag)
                        .show(profileFrag)
                        .commit();
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homeActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finish the current activity
            }
        });
    }







}