package com.example.maburm.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maburm.test.R;

public class MyAdapter extends BaseAdapter {// Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrings,detailStrings;


    public MyAdapter(Context context, int[] ints, String[] titleStrings
            , String[] detailStrings) {

        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลใน Array แล้วส่งข้อมูลไปยัง Method getView()
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//รับข้อมูลจาก getcount มาแสดงผล
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.activity_listview, viewGroup, false);

        //ผูกตัวแปรjava กับ element บน xml ที่หน้า my_listview
        ImageView imageView = view1.findViewById(R.id.img);
        TextView titleTextView = view1.findViewById(R.id.txv);
        // TextView detailTextView = view1.findViewById(R.id.txv3);

        //show data นำข้อมูลไปแสดงผลบนแอพ
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        // detailTextView.setText(detailStrings[i]);
        return view1;
    }
}