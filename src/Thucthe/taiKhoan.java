/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thucthe;

/**
 *
 * @author Nhat
 */
public class taiKhoan {
    private String maNhanvien;
    private String matKhau;

    public taiKhoan(String maNhanvien, String matKhau) {
        this.maNhanvien = maNhanvien;
        this.matKhau = matKhau;
    }

    public taiKhoan() {
    }

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
    
    
}
