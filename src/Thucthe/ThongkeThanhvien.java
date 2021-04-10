/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thucthe;

/**
 *
 * @author tanche_pc
 */
public class ThongkeThanhvien {
    private String mathanhvien;
    private String tenthanhvien;
    private String diachi;
    private int soluongdiathue;

    public ThongkeThanhvien(String mathanhvien, String tenthanhvien, String diachi, int soluongdiathue) {
        this.mathanhvien = mathanhvien;
        this.tenthanhvien = tenthanhvien;
        this.diachi = diachi;
        this.soluongdiathue = soluongdiathue;
    }
    
    public String getMathanhvien() {
        return mathanhvien;
    }

    public void setMathanhvien(String mathanhvien) {
        this.mathanhvien = mathanhvien;
    }

    public String getTenthanhvien() {
        return tenthanhvien;
    }

    public void setTenthanhvien(String tenthanhvien) {
        this.tenthanhvien = tenthanhvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSoluongdiathue() {
        return soluongdiathue;
    }

    public void setSoluongdiathue(int soluongdiathue) {
        this.soluongdiathue = soluongdiathue;
    }
    
}
