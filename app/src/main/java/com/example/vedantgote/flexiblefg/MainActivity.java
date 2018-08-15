package com.example.vedantgote.flexiblefg;


import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragA.Comm{

    FragA f1;
    FragB f2;
    android.support.v4.app.FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        f1=(FragA)fm.findFragmentById(R.id.fga);

    }

    @Override
    public void resp(int i) {
        f2=(FragB)fm.findFragmentById(R.id.fgb);
        if(f2!=null && f2.isVisible())
        {
            f2.change(i);
        }
        else
        {
            Intent it = new Intent(MainActivity.this,Another.class);
            it.putExtra("index",i);
            startActivity(it);
        }

    }
}
