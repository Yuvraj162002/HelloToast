package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.toastapp.databinding.ActivityMainBinding;

public class Horizontal extends AppCompatActivity {
          private int quantity = 0;
           private ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
    }

    public void TOAST(View view) {
        Toast.makeText(this, "Hello word", Toast.LENGTH_SHORT).show();
    }

    public void qty(View view) {
        b.qty.setText(""+quantity++);
    }
}