package edu.niu.z1973110.additionapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText Integer_One;
    private EditText Integer_Two;
    private TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer_One = findViewById(R.id.First_Text);
        Integer_Two = findViewById(R.id.Second_Text);
        Result = findViewById(R.id.Result);
    }

    public void onButtonClick(View view) {
        int number1 = Integer.parseInt(Integer_One.getText().toString());
        int number2 = Integer.parseInt(Integer_Two.getText().toString());
        int result = number1 + number2;
        Result.setText("Result: " + result);
    }
}