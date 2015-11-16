package com.example.alienware.feedmepizza.screens;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.alienware.feedmepizza.R;

public class Toppings_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings__page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView nameView = (TextView) findViewById(R.id.textView3);
        nameView.setText(getIntent().getExtras().getString("place"));
        String toppingsToShow = getIntent().getExtras().getString("toppings");
        TextView showToppings = (TextView) findViewById(R.id.showingToppings);
        showToppings.setText(toppingsToShow);
    }
}
