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
public class theLoai {
    private String ghiChu;
    private String tenTheLoai;

    public theLoai(String maTheLoai, String tenTheLoai) {
        this.ghiChu = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }

    public theLoai() {
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
    
    
    
}
