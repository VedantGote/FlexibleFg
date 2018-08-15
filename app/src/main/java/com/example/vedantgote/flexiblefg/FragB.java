package com.example.vedantgote.flexiblefg;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vedant gote on 31-03-2018.
 */

public class FragB extends android.support.v4.app.Fragment {
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_b,container,false);
        tv =(TextView)v.findViewById(R.id.tv);
        return v;

    }

    public void change(int i)
    {
        String s[] = getResources().getStringArray(R.array.body);
        tv.setText(s[i]);
    }
}
