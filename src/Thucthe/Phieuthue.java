/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thucthe;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Nhat
 */
public class Phieuthue {
    private String maPhieu;
    private String maThanhvien;
    private String maNhanvien;
    private Date ngayThue;
    private Date hanTra;

    public Phieuthue(String maPhieu, String maThanhvien, String maNhanvien, Date ngayThue, Date hanTra) {
        this.maPhieu = maPhieu;
        this.maThanhvien = maThanhvien;
        this.maNhanvien = maNhanvien;
        this.ngayThue = ngayThue;
        this.hanTra = hanTra;
    }

    public Phieuthue() {
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaThanhvien() {
        return maThanhvien;
    }

    public void setMaThanhvien(String maThanhvien) {
        this.maThanhvien = maThanhvien;
    }

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getHanTra() {
        return hanTra;
    }

    public void setHanTra(Date hanTra) {
        this.hanTra = hanTra;
    }

    
    
    
}
