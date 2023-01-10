package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPhim;
    ArrayList<Phim> phimArrayList;
    phim_adapter phimAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();

        phimAdapter = new phim_adapter(this, R.layout.dong_phim, phimArrayList);
        lvPhim.setAdapter(phimAdapter);

        lvPhim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, chi_tiet_phim.class);
                intent.putExtra("dulieu", "Nội dung chuổi");
                startActivity(intent);
            }
        });
    }

    public void anhXa(){
        lvPhim = (ListView) findViewById(R.id.lsvPhim);
        phimArrayList = new ArrayList<>();
        String t = "Tên phim: ", tl = "Thể loại: ";
        phimArrayList.add(new Phim(t+"Siêu nhân gao" + R.drawable.hinh1, tl+"Trẻ em", R.drawable.hinh1));
        phimArrayList.add(new Phim(t+"Avarta 2", tl+"Viễn tưởng", R.drawable.img2));
        phimArrayList.add(new Phim(t+"Vương triều xác sống phần 2", tl+"hành động", R.drawable.img3));
        phimArrayList.add(new Phim(t+"Ký sinh thú", tl+"hành động", R.drawable.img4));
    }
}