package com.example.maburm.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Mainmenu extends AppCompatActivity {
    ListView listView;
    private String[] titleStrings,detailStrings;
    private int[] ints = new int[]{R.drawable.w1,R.drawable.w2,
            R.drawable.w3
            ,R.drawable.w4,R.drawable.w5,
            R.drawable.p6,R.drawable.w7,R.drawable.w8,R.drawable.w9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        listView = findViewById(R.id.list);
        titleStrings = getResources().getStringArray(R.array.title);
        MyAdapter myAdapter = new MyAdapter(Mainmenu.this, ints, titleStrings, detailStrings);

        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> ar0, View ar1, int ar2, long ar3) {
                Intent intent;
                switch (ar2) {
                    case 0:
                        intent = new Intent(getApplicationContext(), Detail.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(getApplicationContext(),detail2.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(getApplicationContext(),detail3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), detail4.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), detail5.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), detail6.class);
                        startActivity(intent);
                        break;
                    case 6 :
                        intent = new Intent(getApplicationContext(), detail7.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), detail8.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), detail9.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }

    }

