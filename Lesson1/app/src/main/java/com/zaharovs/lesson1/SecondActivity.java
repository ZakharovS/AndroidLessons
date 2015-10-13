package com.zaharovs.lesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView textViewFibonacci = (TextView) findViewById(R.id.fibonacciOutputText);
        final EditText editTextFibonacci = (EditText) findViewById(R.id.fibonacciInputText);
        Button buttonFibonacci = (Button) findViewById(R.id.fibonacciButton);

        final TextView textViewFactorial = (TextView) findViewById(R.id.factorialOutputText);
        final EditText editTextFactorial = (EditText) findViewById(R.id.factorialInputText);
        Button buttonFactorial = (Button) findViewById(R.id.factorialButton);

        buttonFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextFibonacci.getText().toString();
                if (checkStringg(inputText)) {
                    Long number = Long.parseLong(inputText);
                    textViewFibonacci.setText(((Long) displayFibonacci(number)).toString());
                } else {
                    textViewFibonacci.setText("You input incorrect value");
                }
            }
        });

        buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextFactorial.getText().toString();
                if (checkStringg(inputText)){
                    Long number = Long.parseLong(inputText);
                    textViewFactorial.setText(((Long) displayFactorial(number)).toString());
                } else {
                    textViewFactorial.setText("You input incorrect value");
                }
            }
        });

    }

    public static boolean checkString(String inputText) {
        if (inputText == null) return false;
        return inputText.matches("^-?\\d+$");
    }

    public static boolean checkStringg(String inputText){
        try{
            Long number = Long.parseLong(inputText);
            if (number>=1) return true;
            else return false;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static long displayFibonacci(long number) {
        if (number == 1) return 0L;
        else if (number == 2) return 1L;
        else {
            long sym = 0;
            long a = 0;
            long b = 1;
            for (int i = 3; i <= number; i++) {
                sym = a + b;
                a = b;
                b = sym;
            }
            return sym;
        }
    }

    public static long displayFactorial(long number) {
        long fact = 1L;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
