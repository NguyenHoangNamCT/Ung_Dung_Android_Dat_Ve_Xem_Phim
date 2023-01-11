package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChonGio extends AppCompatActivity {

    ListView lsvGio;
    Phim phim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_gio);
        anhXa();
        Intent intent = getIntent();
        phim = (Phim) intent.getSerializableExtra("phimDuocChon");
        int rapDuocChon = intent.getIntExtra("rapDuocChon", -1);
        ArrayList<String> gioChieus = new ArrayList<>();
        for(int i = 0; i < phim.getRapPhimArrayList().get(rapDuocChon).getGioChieuArrayList().size(); i++){
            gioChieus.add(phim.getRapPhimArrayList().get(i).getGioChieuArrayList().get(i).getGioChieu());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(ChonGio.this, android.R.layout.simple_list_item_1 ,gioChieus);
        lsvGio.setAdapter(arrayAdapter);
        lsvGio.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent1 = new Intent(, ChonGio.class);
//                intent1.putExtra("phimDuocChon", phim);
//                intent1.putExtra("rapDuocChon", rapDuocChon);
//                intent1.putExtra("gioDuocChon", i);
//                startActivity(intent1);
            }
        });
    }

    public void anhXa(){
        lsvGio = findViewById(R.id.lsvGioChieu);
    }
}