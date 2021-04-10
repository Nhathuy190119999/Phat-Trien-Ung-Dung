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
public class CtPhieuThue {
    private String maPhieu;
    private String maDia;
    private int soLuong;
    private int giaThue;
    private String tinhTrang;

    public CtPhieuThue(String maPhieu, String maDia, int soLuong, int giaThue, String tinhTrang) {
        this.maPhieu = maPhieu;
        this.maDia = maDia;
        this.soLuong = soLuong;
        this.giaThue = giaThue;
        this.tinhTrang = tinhTrang;
    }

    public CtPhieuThue() {
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaDia() {
        return maDia;
    }

    public void setMaDia(String maDia) {
        this.maDia = maDia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }
    
  
    
    public String getTinhTrang(){
        return tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang){
        this.tinhTrang = tinhTrang;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.maPhieu);
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
        final CtPhieuThue other = (CtPhieuThue) obj;
        if (!Objects.equals(this.maPhieu, other.maPhieu)) {
            return false;
        }
        return true;
    }
    
    
    
}
