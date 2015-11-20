package com.example.alienware.feedmepizza.screens;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.alienware.feedmepizza.R;
import com.example.alienware.feedmepizza.objects.Toppings;

import java.util.LinkedList;

public class Im_picky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_picky);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        configurePizzaHutButton();
        configureDominosButton();
        configureTwoforoneButton();
    }

    private void configureTwoforoneButton() {
        ImageButton TwoforoneButton = (ImageButton)findViewById(R.id.sbarro) ;
        TwoforoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Toppings_Page.class);
               intent.putExtra("place","sbarro's toppings are:");
                LinkedList SbarroToppings = new LinkedList();
                SbarroToppings.add("sbarro's topping no' 1");
                SbarroToppings.add("sbarro's topping no' 2");
                SbarroToppings.add("sbarro's topping no' 3");
                SbarroToppings.add("sbarro's topping no' 4");
                String toppings= SbarroToppings.toString();
                intent.putExtra("toppings", toppings);

                startActivityForResult(intent, 0);
            }
        });

    }

    private void configureDominosButton() {
        ImageButton DominosButton = (ImageButton)findViewById(R.id.dominos) ;
        DominosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Toppings_Page.class);
                intent.putExtra("place", "domino's toppings are:");
                LinkedList DominosToppings = new LinkedList();
                DominosToppings.add("domino's topping no' 1");
                DominosToppings.add("domino's topping no' 2");
                DominosToppings.add("domino's topping no' 3");
                DominosToppings.add("domino's topping no' 4");
                String toppings= DominosToppings.toString();
                intent.putExtra("toppings",toppings);
                startActivityForResult(intent, 0);
            }


        });

    }

    private void configurePizzaHutButton() {
        ImageButton HutButton = (ImageButton) findViewById(R.id.hut) ;
        HutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Toppings_Page.class);
                intent.putExtra("place", "Pizza Hut's toppings are:");
                LinkedList HutToppings = new LinkedList();
                HutToppings.add("hut's topping no' 1");
                HutToppings.add("hut's topping no' 2");
                HutToppings.add("hut's topping no' 3");
                HutToppings.add("hut's topping no' 4");
                String toppings= HutToppings.toString();
                intent.putExtra("toppings",toppings);
                startActivityForResult(intent, 0);
            }
        });
    }
}
