package com.zaharovs.lesson1.lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.zaharovs.lesson1.R;

public class SixthActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6_2);

        // Получим позицию из намерения активности
        Intent intent = getIntent();
        int buttonIndex = intent.getIntExtra("buttonIndex", -1);
        if (buttonIndex != -1) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            Fragment2 fragment2 = (Fragment2) fragmentManager
                    .findFragmentById(R.id.fragment2);
            fragment2.setDescription(buttonIndex);
        }
    }
}
