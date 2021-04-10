/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import Thucthe.Nhanvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class ListNhanvien {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    
    
    public static ResultSet ShowTextField(String sql){
        try {
            ps = Database.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
    public static void InsertNhanvien(Nhanvien nv){
        String sql = "Insert into Nhanvien values(?,?,?,?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(1, nv.getMaNhanvien());
            ps.setString(2, nv.getTenNhanvien());
            ps.setString(3, nv.getDiaChi());
            ps.setString(4, nv.getSoDt());
            ps.setString(5, nv.getGioiTinh());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    public boolean UpdateNhanvien(Nhanvien nv){
        try {
            ps = Database.getConnect().prepareStatement("Update Nhanvien set tenNhanvien = ?, diaChi = ?,"
                    +"soDt=?, gioiTinh=? where maNhanvien = ?");
            ps.setString(6, nv.getMaNhanvien());
            ps.setString(1, nv.getTenNhanvien());
            ps.setString(2, nv.getDiaChi());
            ps.setString(3, nv.getSoDt());
            ps.setString(4, nv.getGioiTinh());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteNhanvien(String mnv){
        try {
            ps = Database.getConnect().prepareCall("Delete From Nhanvien where maNhanvien = ?");
            ps.setString(1, mnv);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
