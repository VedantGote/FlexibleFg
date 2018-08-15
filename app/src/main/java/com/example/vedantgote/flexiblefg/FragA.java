package com.example.vedantgote.flexiblefg;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by vedant gote on 31-03-2018.
 */

public class FragA extends android.support.v4.app.Fragment {

    Comm cm;
    ListView lv;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag_a,container,false);
        lv = (ListView)v.findViewById(R.id.lv);
        ArrayAdapter a = ArrayAdapter.createFromResource(getActivity(),R.array.tit,android.R.layout.simple_list_item_1);
        lv.setAdapter(a);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                cm.resp(position);

            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try
        {
            cm=(Comm)context;
        }
        catch (ClassCastException e)
        {
            e.printStackTrace();
        }
    }

    /*public void setCm(Comm cm)
    {
        this.cm=cm;
    }*/

    public interface Comm{
        public void resp(int i);
    }
}
