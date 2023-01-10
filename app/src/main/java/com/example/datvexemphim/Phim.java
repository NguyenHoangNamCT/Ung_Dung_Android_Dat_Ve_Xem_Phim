package com.example.datvexemphim;

import java.io.Serializable;

public class Phim implements Serializable {
    private String tenPhim, theLoai, ngayKhoiChieu, doDai, daoDien, cacDienVienChinh, tomTat;
    private int hinh;

    public Phim(String tenPhim, String theLoai, int hinh, String ngayKhoiChieu, String doDai, String daoDien, String cacDienVienChinh, String tomTat) {
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.hinh = hinh;
        this.ngayKhoiChieu = ngayKhoiChieu;
        this.doDai = doDai;
        this.daoDien = daoDien;
        this.cacDienVienChinh = cacDienVienChinh;
        this.tomTat = tomTat;
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

    public String getNgayKhoiChieu() {
        return ngayKhoiChieu;
    }

    public void setNgayKhoiChieu(String ngayKhoiChieu) {
        this.ngayKhoiChieu = ngayKhoiChieu;
    }

    public String getDoDai() {
        return doDai;
    }

    public void setDoDai(String doDai) {
        this.doDai = doDai;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public String getCacDienVienChinh() {
        return cacDienVienChinh;
    }

    public void setCacDienVienChinh(String cacDienVienChinh) {
        this.cacDienVienChinh = cacDienVienChinh;
    }

    public String getTomTat() {
        return tomTat;
    }

    public void setTomTat(String tomTat) {
        this.tomTat = tomTat;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
