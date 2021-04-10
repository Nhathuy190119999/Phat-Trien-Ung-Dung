/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import static List.ListNhanvien.ps;
import Thucthe.Nhanvien;
import Thucthe.taiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class ListTaiKhoan {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public Nhanvien dangNhap(String taiKhoan, String pass) {
        Nhanvien nv = null;
        try{
            ps = Database.getConnect().prepareStatement("SELECT * FROM taikhoan where maNhanvien = ? and matKhau=?");
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
                nv = new Nhanvien();
               
                
            }
        }
        catch(Exception e) {
            return nv = null;
        }
        return nv;
    }
    
    public static ResultSet ShowTextField(String sql){
        try {
            ps = Database.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
    public static void InsertTaiKhoan(taiKhoan tk){
        String sql = "Insert into Taikhoan values(?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(1, tk.getMaNhanvien());
            ps.setString(2, tk.getMatKhau());
            
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    public boolean UpdateTaiKhoan(taiKhoan tk){
        try {
            ps = Database.getConnect().prepareStatement("Update taiKhoan set matKhau = ? where maNhanvien = ?");
            ps.setString(2, tk.getMaNhanvien());
            ps.setString(1, tk.getMatKhau());
            
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteTaiKhoan(String mnv){
        try {
            ps = Database.getConnect().prepareCall("Delete From taiKhoan where maNhanvien = ?");
            ps.setString(1, mnv);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
