package com.example.datvexemphim;

import java.io.Serializable;

public class GioChieu implements Serializable {
    private String gioChieu;

    public GioChieu(String gioChieu) {
        this.gioChieu = gioChieu;
    }

    public String getGioChieu() {
        return gioChieu;
    }

    public void setGioChieu(String gioChieu) {
        this.gioChieu = gioChieu;
    }
}
