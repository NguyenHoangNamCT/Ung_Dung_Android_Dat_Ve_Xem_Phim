package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChonGhe extends AppCompatActivity {

    GridView gvGhe;
    ghe_adapter gheAdapter;
    ArrayList<ghe_ngoi> gheNgoiArrayList;
    ArrayList<Integer> trangThaiGhe;
    Phim phim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_ghe);
        anhXa();
        Intent intent = getIntent();
        phim = (Phim) intent.getSerializableExtra("phimDuocChon");
        int rapDuocChon = intent.getIntExtra("rapDuocChon", -1);
        int gioDuocChon = intent.getIntExtra("gioDuocChon", -1);

        gheNgoiArrayList = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            trangThaiGhe.add(0);
            gheNgoiArrayList.add(new ghe_ngoi((i+1), R.drawable.g0, 0));
        }

        gheAdapter = new ghe_adapter(ChonGhe.this, R.layout.item_ghe_ngoi, gheNgoiArrayList);
        gvGhe.setAdapter(gheAdapter);
    }

    public void anhXa(){
        gvGhe = findViewById(R.id.gvGhe);
    }
}