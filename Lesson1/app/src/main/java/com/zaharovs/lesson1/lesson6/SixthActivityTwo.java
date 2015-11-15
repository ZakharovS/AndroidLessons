package com.zaharovs.lesson1.lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.zaharovs.lesson1.R;

public class SixthActivityTwo extends AppCompatActivity {

    Bundle bundle;
    int position;
    Intent intent;
    FragmentDetails fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_ht_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activity_sixth);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        intent = getIntent();
        position = intent.getIntExtra("position", 0);
        fragmentTwo = new FragmentDetails();
        bundle = new Bundle();
        bundle.putInt("position", position);
        fragmentTwo.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.sixth_ht_frame_layout, fragmentTwo).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}