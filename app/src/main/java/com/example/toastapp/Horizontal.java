package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.toastapp.databinding.ActivityMainBinding;

public class Horizontal extends AppCompatActivity {
          //Create Quantity...
          private int quantity = 0;
           private ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
              ///Initiliaze the Activity Binding..
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
              //hkc
    }
///Create Toast
    public void TOAST(View view) {
        Toast.makeText(this, "Hello word", Toast.LENGTH_SHORT).show();
    }
///Increment Quantity..
    public void qty(View view) {
        b.qty.setText(""+quantity++);
    }
}
