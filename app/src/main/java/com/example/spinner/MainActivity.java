package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Radiobutton (View view){
        Intent radio = new Intent(this, Radio_Button.class);
        startActivity(radio);
    }
    public void Radio (View view){
        Intent radio = new Intent(this, Spinner.class);
        startActivity(radio);
    }
}