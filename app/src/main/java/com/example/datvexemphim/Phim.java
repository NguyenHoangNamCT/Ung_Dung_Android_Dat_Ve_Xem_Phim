package com.example.datvexemphim;

public class Phim {
    private String tenPhim, theLoai;
    private int hinh;

    public Phim(String tenPhim, String theLoai, int hinh) {
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.hinh = hinh;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
