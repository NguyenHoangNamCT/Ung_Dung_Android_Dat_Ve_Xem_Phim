package com.example.datvexemphim;

import java.io.Serializable;
import java.util.ArrayList;

public class GioChieu implements Serializable {
    private String gioChieu;
    private ArrayList<ghe_ngoi> ghe_ngoiArrayList;

    public GioChieu(String gioChieu) {
        this.gioChieu = gioChieu;
        ghe_ngoiArrayList = new ArrayList<>();
        for(int i = 0; i < 12; i++)
            ghe_ngoiArrayList.add(new ghe_ngoi((i+1), R.drawable.g0, 0));
    }

    public String getGioChieu() {
        return gioChieu;
    }

    public void setGioChieu(String gioChieu) {
        this.gioChieu = gioChieu;
    }

    public ArrayList<ghe_ngoi> getGhe_ngoiArrayList() {
        return ghe_ngoiArrayList;
    }

    public void setGhe_ngoiArrayList(ArrayList<ghe_ngoi> ghe_ngoiArrayList) {
        this.ghe_ngoiArrayList = ghe_ngoiArrayList;
    }
}
