package com.example.alienware.feedmepizza.screens;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.alienware.feedmepizza.R;

public class Im_picky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_picky);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        configurePizzaHutButton();
        configureDominosButton();
        configureTwoforoneButton();
    }

    private void configureTwoforoneButton() {
        Button TwoforoneButton = (Button)findViewById(R.id.twoForOne) ;
        TwoforoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Toppings_Page.class);
               intent.putExtra("place","TwoForOne toppings");
                startActivityForResult(intent, 0);
            }
        });

    }

    private void configureDominosButton() {
        Button DominosButton = (Button)findViewById(R.id.dominos) ;
        DominosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Toppings_Page.class);
                intent.putExtra("place","dominos toppings");
                startActivityForResult(intent, 0);
            }


        });

    }

    private void configurePizzaHutButton() {
        Button HutButton = (Button)findViewById(R.id.Hut) ;
        HutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Toppings_Page.class);
                intent.putExtra("place","Hut toppings");
                startActivityForResult(intent, 0);
            }
        });
    }
}
