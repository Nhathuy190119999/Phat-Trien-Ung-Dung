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
public class Thanhvien {
    private String maThanhvien;
    private String tenThanhvien;
    private String diaChi;
    private String sDT;
    
    private String cMND;

    public Thanhvien(String maThanhvien, String tenThanhvien, String diaChi, String sDT, String cMND) {
        this.maThanhvien = maThanhvien;
        this.tenThanhvien = tenThanhvien;
        this.diaChi = diaChi;
        this.sDT = sDT;
       
        this.cMND = cMND;
    }

    public Thanhvien() {
    }

    public String getMaThanhvien() {
        return maThanhvien;
    }

    public void setMaThanhvien(String maThanhvien) {
        this.maThanhvien = maThanhvien;
    }

    public String getTenThanhvien() {
        return tenThanhvien;
    }

    public void setTenThanhvien(String tenThanhvien) {
        this.tenThanhvien = tenThanhvien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

   

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.maThanhvien);
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
        final Thanhvien other = (Thanhvien) obj;
        if (!Objects.equals(this.maThanhvien, other.maThanhvien)) {
            return false;
        }
        return true;
    }
    
    
    
}
