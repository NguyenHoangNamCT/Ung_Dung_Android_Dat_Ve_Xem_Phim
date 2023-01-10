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
                intent.putExtra("phimDuocChon", phimArrayList.get(i));
                startActivity(intent);
            }
        });
    }

    public void anhXa(){
        lvPhim = (ListView) findViewById(R.id.lsvPhim);
        phimArrayList = new ArrayList<>();
        String t = "Tên phim: ", tl = "Thể loại: ", kc = "Khởi chiếu: ", d = "Độ dài: ", dd = "Đạo diễn: ", dv = "Diễn viên chính: ";
        phimArrayList.add(new Phim(t+"Siêu nhân gao", tl+"Trẻ em", R.drawable.hinh1,kc + "12/12/2022", d + "120 phút", dd + "ABC Vlog", dv + "Anh vi ca", " saldkjf saldkjf saldkjf lksadj flkj lf salkdfj ksjadfkl jsadlkf jlk;sdfjlkasdlk fjsdl;kf"));
//        phimArrayList.add(new Phim(t+"Avarta 2", tl+"Viễn tưởng", R.drawable.img2));
//        phimArrayList.add(new Phim(t+"Vương triều xác sống phần 2", tl+"hành động", R.drawable.img3));
//        phimArrayList.add(new Phim(t+"Ký sinh thú", tl+"hành động", R.drawable.img4));
    }
}