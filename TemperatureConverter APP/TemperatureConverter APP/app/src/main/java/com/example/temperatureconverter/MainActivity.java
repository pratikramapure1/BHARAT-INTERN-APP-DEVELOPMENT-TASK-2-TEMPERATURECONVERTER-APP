package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonToCelcius, buttonToFarenhiet;
    TextView Farenhiet, Celcius;
    EditText inCelcius, inFarenhiet;

    Float numCel, numFar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonToCelcius = findViewById(R.id.button_toC);
        buttonToFarenhiet = findViewById(R.id.button_toF);
        Farenhiet = findViewById(R.id.textViewF);
        Celcius = findViewById(R.id.textViewC);
        inCelcius = findViewById(R.id.editTextCelcius);
        inFarenhiet = findViewById(R.id.editTextFarenhiet);
        buttonToCelcius.setOnClickListener(this);
        buttonToFarenhiet.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        if(inCelcius.getText().toString().equals("")){
            Toast.makeText(this, "Enter the temperature", Toast.LENGTH_SHORT).show();
        } else {
            numCel = Float.parseFloat(inCelcius.getText().toString());
        }if(inFarenhiet.getText().toString().equals("")){
            Toast.makeText(this, "Enter the temperature", Toast.LENGTH_SHORT).show();
        } else {
            numFar = Float.parseFloat(inFarenhiet.getText().toString());
        }
        if(view.getId() == R.id.button_toF){
            Farenhiet.setText(String.valueOf((numCel*9/5)+32) +"\u00B0F");
        } else if (view.getId() == R.id.button_toC) {
            float celciusValue = (numFar - 32) * 5 / 9;
            String celciusFormatted = String.format("%.1f", celciusValue);
            Celcius.setText(celciusFormatted + "\u00B0C");

        }
    }
}
