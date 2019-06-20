package com.example.lenovo.ifelsecondition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberET,secondNumberET,ageET,textET;
    Button button,answerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberET = findViewById(R.id.firstNumberET);
        secondNumberET = findViewById(R.id.secondNUmberET);
        textET = findViewById(R.id.textET);
        ageET = findViewById(R.id.ageET);
        answerButton = findViewById(R.id.answer);
        button = findViewById(R.id.button);
    }

    public void addData(View view) {

        int first = Integer.parseInt(firstNumberET.getText().toString());
        int second = Integer.parseInt(secondNumberET.getText().toString());

        if (first > second){
            button.setText("First number is greater than second");
        }else {
            button.setText("Second Number is greater than First");
        }
        if (first == second){
            button.setText("Equal");
        }
    }

    public void dataAdd(View view) {

        int age = Integer.parseInt(ageET.getText().toString());
        String text = textET.getText().toString();


        if ((age > 18) && (text.equals("Yes")) ){
           answerButton.setText("Yes ! i am android Developer");
            Toast.makeText(this, "Yes I am developer", Toast.LENGTH_SHORT).show();
        }else {
            answerButton.setText("No ! I am not");
            Toast.makeText(this, "No !", Toast.LENGTH_SHORT).show();
        }


    }
}
