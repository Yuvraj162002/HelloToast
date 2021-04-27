package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.toastapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
            private int quantity = 0;
            private ActivityMainBinding c;

    @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                c = ActivityMainBinding.inflate(getLayoutInflater());
                // setContentView(R.layout.activity_main);
                setContentView(c.getRoot());
            }

            public void TOAST(View view) {

                Toast.makeText(this, "Hello toast", Toast.LENGTH_SHORT).show();

            }

            public void qty(View view) {
               c.qty.setText(""+quantity++);

            }

        }
