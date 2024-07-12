package com.example.quadraticequationsolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.quadraticequationsolver.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mybinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        mybinding = DataBindingUtil.setContentView( this,
                R.layout.activity_main);

        Myequation equation = new Myequation(mybinding);

        mybinding.setMyequation( equation );
    }
}