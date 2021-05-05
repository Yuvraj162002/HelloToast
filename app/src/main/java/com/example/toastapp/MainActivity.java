package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.toastapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
             //Create quantity..
            private int quantity = 0;
            private ActivityMainBinding c;

    @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                        
                 ///Initialize the activity binding..
                c = ActivityMainBinding.inflate(getLayoutInflater());
                
                setContentView(c.getRoot());
            }

              // Create Toast..
            public void TOAST(View view) {

                Toast.makeText(this, "Hello toast", Toast.LENGTH_SHORT).show();

            }
                 ///Increment the quantity..
            public void qty(View view) {
               c.qty.setText(""+quantity++);

            }

        }
