package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChonRapPhim extends AppCompatActivity {

    ListView lsvRapPhim;
    Phim phim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_rap_phim);
        anhXa();
        Intent intent = getIntent();
        phim = (Phim) intent.getSerializableExtra("phimDuocChon");
        ArrayList<String> rapPhims = new ArrayList<>();
        for(int i = 0; i < phim.getRapPhimArrayList().size(); i++){
            rapPhims.add(phim.getRapPhimArrayList().get(i).getTenRap());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(ChonRapPhim.this, android.R.layout.simple_list_item_1, rapPhims);
        lsvRapPhim.setAdapter(arrayAdapter);

        lsvRapPhim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(ChonRapPhim.this, ChonGio.class);
                intent1.putExtra("phimDuocChon", phim);
                intent1.putExtra("rapDuocChon", i);
                startActivity(intent1);
            }
        });
    }

    public void anhXa(){
        lsvRapPhim = findViewById(R.id.lsvRapChieuPhim);
    }
}