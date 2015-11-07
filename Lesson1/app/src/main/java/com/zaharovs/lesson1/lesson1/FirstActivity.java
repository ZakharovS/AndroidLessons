package com.zaharovs.lesson1.lesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zaharovs.lesson1.R;
import com.zaharovs.lesson1.lesson2.SecondActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final TextView textView = (TextView) findViewById(R.id.outputText);
        final EditText editText = (EditText) findViewById(R.id.inputText);
        Button button = (Button) findViewById(R.id.calculateButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                if (SecondActivity.checkString(inputText)) {
                    Double number = Double.parseDouble(inputText);
                    number = Math.pow(number, 2);
                    textView.setText(number.toString());
                } else {
                    textView.setText("You input incorrect value");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}

