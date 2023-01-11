package com.example.datvexemphim;

import java.io.Serializable;

public class ghe_ngoi implements Serializable {
    private int soGhe;
    private int hinh;
    private int trangThai;


    public ghe_ngoi(int soGhe, int hinh, int trangThai) {
        this.soGhe = soGhe;
        this.hinh = hinh;
        this.trangThai = trangThai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
