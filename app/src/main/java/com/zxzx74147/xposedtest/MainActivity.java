package com.zxzx74147.xposedtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import com.zxzx74147.xposedtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static String json = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_main, null, false);
        setContentView(binding.getRoot());


    }



}
