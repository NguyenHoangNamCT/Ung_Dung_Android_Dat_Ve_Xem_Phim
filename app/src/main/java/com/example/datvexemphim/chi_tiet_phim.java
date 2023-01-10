package com.example.datvexemphim;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class chi_tiet_phim extends AppCompatActivity {
    ImageView imgHinhChiTiet;
    TextView txtTenPhim, txtKhoiChieu, txtTheLoai, txtDoDai, txtDaoDien, txtDienVien, txtTomTat;
    Button btnDatVe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_phim);
        anhXa();
        Intent intent = getIntent();
        Phim phim = (Phim) intent.getSerializableExtra("phimDuocChon");
        txtTenPhim.setText(phim.getTenPhim());
        txtTheLoai.setText(phim.getTheLoai());
        imgHinhChiTiet.setImageResource(phim.getHinh());
        txtKhoiChieu.setText(phim.getNgayKhoiChieu());
        txtDoDai.setText(phim.getDoDai());
        txtDaoDien.setText(phim.getDaoDien());
        txtDienVien.setText(phim.getCacDienVienChinh());
        txtTomTat.setText(phim.getTomTat());

        btnDatVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(chi_tiet_phim.this, ChonRapPhim.class);
                intent.putExtra("phimDuocChon", phim);
                startActivity(intent);
            }
        });
    }

    public void anhXa(){
        imgHinhChiTiet = findViewById(R.id.imgHinhPhim);
        txtTenPhim = findViewById(R.id.txtTenPhim);
        txtKhoiChieu = findViewById(R.id.txtKhoiChieu);
        txtTheLoai = findViewById(R.id.txtTheLoai);
        txtDoDai = findViewById(R.id.txtDoDai);
        txtDaoDien = findViewById(R.id.txtDaoDien);
        txtDienVien = findViewById(R.id.txtDienVien);
        txtTomTat = findViewById(R.id.txtTomTat);
        btnDatVe = findViewById(R.id.btnDatVe);
    }
}