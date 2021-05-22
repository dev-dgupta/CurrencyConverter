package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        EditText rupees=(EditText) findViewById(R.id.rupeeEditText);
        int usd = Integer.parseInt(rupees.getText().toString())*60;

        Toast.makeText(this, usd + "$", Toast.LENGTH_SHORT).show();
    }
}