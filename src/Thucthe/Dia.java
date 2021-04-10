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
public class Dia {
    private String maDia;
    private String tenDia;
    private String tenTheLoai;
    private int soLuongTon;
    private String hangSx;
    private int giaThue;

    public Dia(String maDia, String tenDia, String tenTheLoai, int soLuongTon, String hangSx, int giaThue) {
        this.maDia = maDia;
        this.tenDia = tenDia;
        this.tenTheLoai = tenTheLoai;
        this.soLuongTon = soLuongTon;
        this.hangSx = hangSx;
        this.giaThue = giaThue;
    }

    public Dia() {
    }

    public String getMaDia() {
        return maDia;
    }

    public void setMaDia(String maDia) {
        this.maDia = maDia;
    }

    public String getTenDia() {
        return tenDia;
    }

    public void setTenDia(String tenDia) {
        this.tenDia = tenDia;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public int getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.maDia);
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
        final Dia other = (Dia) obj;
        if (!Objects.equals(this.maDia, other.maDia)) {
            return false;
        }
        return true;
    }
    
    
    
}
