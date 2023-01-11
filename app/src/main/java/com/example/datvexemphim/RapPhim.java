package com.example.datvexemphim;

import java.io.Serializable;
import java.util.ArrayList;

public class RapPhim implements Serializable {
    private String tenRap;
    private ArrayList<GioChieu> gioChieuArrayList;

    public RapPhim(String tenRap) {
        this.tenRap = tenRap;
        this.gioChieuArrayList = new ArrayList<>();
        this.gioChieuArrayList.add(new GioChieu("7h"));
        this.gioChieuArrayList.add(new GioChieu("9h30"));
        this.gioChieuArrayList.add(new GioChieu("13h"));
        this.gioChieuArrayList.add(new GioChieu("15h30"));
        this.gioChieuArrayList = gioChieuArrayList;
    }

    public String getTenRap() {
        return tenRap;
    }

    public void setTenRap(String tenRap) {
        this.tenRap = tenRap;
    }

    public ArrayList<GioChieu> getGioChieuArrayList() {
        return gioChieuArrayList;
    }

    public void setGioChieuArrayList(ArrayList<GioChieu> gioChieuArrayList) {
        this.gioChieuArrayList = gioChieuArrayList;
    }
}
