/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thucthe;

import java.util.Objects;

/**
 *
 * @author Nhat
 */
public class Nhanvien {
    private String maNhanvien;
    private String tenNhanvien;
    private String diaChi;
    private String soDt;
    private String gioiTinh;
    

    public Nhanvien(String maNhanvien, String tenNhanvien, String diaChi, String soDt, String gioiTinh) {
        this.maNhanvien = maNhanvien;
        this.tenNhanvien = tenNhanvien;
        this.diaChi = diaChi;
        this.soDt = soDt;
        this.gioiTinh = gioiTinh;
      
    }

    public Nhanvien() {
    }

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getTenNhanvien() {
        return tenNhanvien;
    }

    public void setTenNhanvien(String tenNhanvien) {
        this.tenNhanvien = tenNhanvien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.maNhanvien);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nhanvien other = (Nhanvien) obj;
        if (!Objects.equals(this.maNhanvien, other.maNhanvien)) {
            return false;
        }
        return true;
    }
    
    
}
