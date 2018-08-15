package com.example.vedantgote.flexiblefg;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class Another extends AppCompatActivity {
    FragB f2;
    android.support.v4.app.FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Bundle b = getIntent().getExtras();
        int i = b.getInt("index");
        fm = getSupportFragmentManager();
        f2=(FragB)fm.findFragmentById(R.id.fgb);

        f2.change(i);

    }
}
