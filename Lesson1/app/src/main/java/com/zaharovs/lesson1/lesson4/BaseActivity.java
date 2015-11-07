package com.zaharovs.lesson1.lesson4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zaharovs.lesson1.R;

/**
 * Created by 555 on 07.11.2015.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        if ((savedInstanceState == null) && (isAddFragment())){
            addFragment();
        }
    }

    abstract boolean isAddFragment();

    abstract void addFragment();

}
