package com.example.alienware.feedmepizza.screens;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.alienware.feedmepizza.R;
import com.example.alienware.feedmepizza.screens.Im_picky;
public class MainActivity extends AppCompatActivity {
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private ListView navList;
    private android.support.v7.app.ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setTheme(android.R.style.Theme_Holo);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeSettingsBar();
       getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        setContentView(R.layout.activity_main);
      //  configureImageButton();
       // configureIAmPickyButton();
       // configureSettingsButton();
    }

    private void initializeSettingsBar() {

         drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        navList = (ListView)findViewById(R.id.navlist);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.opendrawer,R.string.closedrawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
        
    }

//    private void configureSettingsButton() {
//        ImageButton imgButton = (ImageButton)findViewById(R.id.settingsButton);
//        imgButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(),Im_picky.class);
//                startActivity(intent);
//                overridePendingTransition(R.anim.right_slide_in,R.anim.right_slide_out);
//
//
//            }
//        });
//    }
//
//    private void configureIAmPickyButton() {
//        Button iAmPickyButton = (Button)findViewById(R.id.i_am_picky_button);
//        iAmPickyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(),Im_picky.class);
//                startActivityForResult(intent,0);
//
//            }
//        });
//    }
//
//    private void configureImageButton() {
//        ImageButton imgButton = (ImageButton) findViewById(R.id.imageButton);
//        imgButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(),Im_picky.class);
//                startActivityForResult(intent,0);
//            }
//        });
//    }

//    @Override
   public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if(id == android.R.id.home) {
                if(drawerLayout.isDrawerOpen(navList)){
                    drawerLayout.closeDrawer(navList);
                }
                else{
                    drawerLayout.openDrawer(navList);
                }
        }

        return super.onOptionsItemSelected(item);
    }
}
