package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radio_Button extends AppCompatActivity {
    android.widget.RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        radioGroup=findViewById(R.id.radioGroup);

    }
    public void onButton(View view){
        int selectId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(selectId);
        if (selectId == -1){
            Toast.makeText(this,"no ha seleccionado nada", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,radioButton.getText(),Toast.LENGTH_SHORT).show();
        }
    }
}