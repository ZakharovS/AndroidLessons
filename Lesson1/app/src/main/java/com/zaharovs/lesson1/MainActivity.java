package com.zaharovs.lesson1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        final TextView textView = (TextView) findViewById(R.id.outputText);
        final EditText editText = (EditText) findViewById(R.id.inputText);
        Button button = (Button) findViewById(R.id.calculateButton);

        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          String inputText = editText.getText().toString();
                                           if (checkString(inputText)){
                                               Double number = Double.parseDouble(inputText);
                                               number = Math.pow(number, 2);
                                               textView.setText(number.toString());
                                           }  else {
                                               textView.setText("You input NOT a number");
                                           }

//                                          Double number = Double.parseDouble(editText.getText().toString());
//                                          number = Math.pow(number, 2);
//                                          textView.setText(number.toString());
                                      }
                                      public boolean checkString(String inputText) {
                                          if (inputText == null) return false;
                                          return inputText.matches("^-?\\d+$");
                                      }
                                  }
        );

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
