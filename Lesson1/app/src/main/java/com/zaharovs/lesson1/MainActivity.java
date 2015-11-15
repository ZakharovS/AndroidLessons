package com.zaharovs.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.zaharovs.lesson1.lesson1.FirstActivity;
import com.zaharovs.lesson1.lesson2.SecondActivity;
import com.zaharovs.lesson1.lesson3.ThirdActivity;
import com.zaharovs.lesson1.lesson4.FourthActivity;
import com.zaharovs.lesson1.lesson5.FifthActivity;
import com.zaharovs.lesson1.lesson6.SixthActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.homeTask1).setOnClickListener(clickListener);
        findViewById(R.id.homeTask2).setOnClickListener(clickListener);
        findViewById(R.id.homeTask3).setOnClickListener(clickListener);
        findViewById(R.id.homeTask4).setOnClickListener(clickListener);
        findViewById(R.id.homeTask5).setOnClickListener(clickListener);
        findViewById(R.id.homeTask6).setOnClickListener(clickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
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
        switch (item.getItemId()) {
            case R.id.action_item1:
                Intent intent1 = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent1);
                return true;
            case R.id.action_item2:
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent2);
                return true;
            case R.id.action_item3:
                Intent intent3 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent3);
                return true;
            case R.id.action_item4:
                Intent intent4 = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent4);
                return true;
            case R.id.action_item5:
                Intent intent5 = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.action_itemm1:
                Intent intent1 = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent1);
                break;
            case R.id.action_itemm2:
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent2);
                break;
            case R.id.action_itemm3:
                Intent intent3 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent3);
                break;
            case R.id.action_itemm4:
                Intent intent4 = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent4);
                break;
            case R.id.action_itemm5:
                Intent intent5 = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent5);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.homeTask1:
                    Intent intent1 = new Intent(MainActivity.this, FirstActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.homeTask2:
                    Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.homeTask3:
                    Intent intent3 = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.homeTask4:
                    Intent intent4 = new Intent(MainActivity.this, FourthActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.homeTask5:
                    Intent intent5 = new Intent(MainActivity.this, FifthActivity.class);
                    startActivity(intent5);
                    break;
                case R.id.homeTask6:
                    Intent intent6 = new Intent(MainActivity.this, SixthActivity.class);
                    startActivity(intent6);
                    break;
            }
        }
    };
}
