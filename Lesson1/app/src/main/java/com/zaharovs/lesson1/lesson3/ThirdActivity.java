package com.zaharovs.lesson1.lesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.zaharovs.lesson1.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 555 on 20.10.2015.
 */
public class ThirdActivity extends AppCompatActivity {

    private String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        createAndShowNumbers();

        findViewById(R.id.button_1).setOnClickListener(clickListener);
        findViewById(R.id.button_2).setOnClickListener(clickListener);
        findViewById(R.id.button_3).setOnClickListener(clickListener);
        findViewById(R.id.button_4).setOnClickListener(clickListener);

        text2 = (TextView) findViewById(R.id.text_2);
    }

    TextView text2;

    private void createAndShowNumbers() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text1 = (TextView) findViewById(R.id.text_1);
        text1.setText(strings);
    }

    private void reverseOrder() {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        Collections.reverse(list);
        String strings = TextUtils.join(", ", list);
        text2.setText(strings);
    }

    private void removeEveryThird() {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        for (int i = list.size(); i > 0; i--) {
            if (i % 3 == 0) {
                list.remove(i - 1);
            }
        }
        String strings = TextUtils.join(", ", list);
        text2.setText(strings);
    }

    private void removeDuplicates() {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        Set<String> set = new HashSet<>();
        for (String str : list){
            set.add(str);
        }
        String strings = TextUtils.join(", ", set);
        text2.setText(strings);
    }

    private void sortValues() {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        Collections.sort(list);
        String strings = TextUtils.join(", ", list);
        text2.setText(strings);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_1:
                    reverseOrder();
                    break;
                case R.id.button_2:
                    removeEveryThird();
                    break;
                case R.id.button_3:
                    removeDuplicates();
                    break;
                case R.id.button_4:
                    sortValues();
                    break;
            }
        }
    };
}
