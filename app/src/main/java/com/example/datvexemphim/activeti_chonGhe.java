package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class activeti_chonGhe extends AppCompatActivity {

    GridView gvGhe;
    ghe_adapter gheAdapter;
    Button btnHoanTat;

    Phim phim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activeti_chon_ghe);

        anhXa();
        Intent intent = getIntent();
        phim = (Phim) intent.getSerializableExtra("phimDuocChon");
        int rapDuocChon = intent.getIntExtra("rapDuocChon", -1);
        int gioDuocChon = intent.getIntExtra("gioDuocChon", -1);



        gheAdapter = new ghe_adapter(activeti_chonGhe.this, R.layout.item_ghe_ngoi, phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList());

        for(int i = 0; i < phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().size(); i++) {
            if (phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).getTrangThai() == 0)
                phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).setHinh(R.drawable.g0);
            if (phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).getTrangThai() == 1)
                phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).setHinh(R.drawable.g3);
            if (phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).getTrangThai() == 2)
                phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).setHinh(R.drawable.g6);
        }
        gvGhe.setAdapter(gheAdapter);

        gvGhe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).getTrangThai() == 2)
                    Toast.makeText(activeti_chonGhe.this, "Ghế này đã được chọn vui lòng chọn ghế khác", Toast.LENGTH_SHORT).show();
                else if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).getTrangThai() == 0){
                    phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(i).setTrangThai(1);
                }
                for(int j = 0; j < phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().size(); j++){
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 0)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setHinh(R.drawable.g0);
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 1)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setHinh(R.drawable.g3);
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 2)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setHinh(R.drawable.g6);
                    gheAdapter.notifyDataSetChanged();
                }
            }
        });

        btnHoanTat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int j = 0; j < phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().size(); j++){
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 1)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setTrangThai(2);
                    gheAdapter.notifyDataSetChanged();
                }

                for(int j = 0; j < phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().size(); j++){
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 0)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setHinh(R.drawable.g0);
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 1)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setHinh(R.drawable.g3);
                    if(phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).getTrangThai() == 2)
                        phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().get(gioDuocChon).getGhe_ngoiArrayList().get(j).setHinh(R.drawable.g6);
                    gheAdapter.notifyDataSetChanged();
                }
            }
        });
    }

    public void anhXa(){
        gvGhe = findViewById(R.id.gvGhe);
        btnHoanTat = findViewById(R.id.btnHoanTat);
    }
}


