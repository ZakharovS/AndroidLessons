package com.zaharovs.lesson1.lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.zaharovs.lesson1.R;

public class SixthActivity extends AppCompatActivity implements
        Fragment1.OnSelectedItemListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6);
    }

    @Override
    public void onButtonSelected(int buttonIndex) {
        // подключаем FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Получаем ссылку на второй фрагмент по ID
        Fragment2 fragment2 = (Fragment2) fragmentManager
                .findFragmentById(R.id.fragment2);

        // если фрагмента не существует или он невидим
        if (fragment2 == null || !fragment2.isVisible()) {
            // запускаем активность
            Intent intent = new Intent(this, SixthActivity2.class);
            intent.putExtra("buttonIndex", buttonIndex);
            startActivity(intent);
        } else {
            // Выводим нужную информацию
            fragment2.setDescription(buttonIndex);
        }

    }
}
