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
public class ThongKeDia {
    private String madia;
    private String tendia;
    private String theloai;
    private int soluongdiathue;

    public ThongKeDia(String madia, String tendia, String theloai, int soluongdiathue) {
        this.madia = madia;
        this.tendia = tendia;
        this.theloai = theloai;
        this.soluongdiathue = soluongdiathue;
    }

    public String getMadia() {
        return madia;
    }

    public void setMadia(String madia) {
        this.madia = madia;
    }

    public String getTendia() {
        return tendia;
    }

    public void setTendia(String tendia) {
        this.tendia = tendia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getSoluongdiathue() {
        return soluongdiathue;
    }

    public void setSoluongdiathue(int soluongdiathue) {
        this.soluongdiathue = soluongdiathue;
    }
    
}
