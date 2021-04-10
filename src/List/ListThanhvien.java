/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import Thucthe.Thanhvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class ListThanhvien {
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
    
    public static void InsertThanhvien(Thanhvien tv){
        String sql = "Insert into Thanhvien values(?,?,?,?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(1, tv.getMaThanhvien());
            ps.setString(2, tv.getTenThanhvien());
            ps.setString(3, tv.getDiaChi());
            ps.setString(4, tv.getsDT());
 
            ps.setString(5, tv.getcMND());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    public boolean UpdateThanhvien(Thanhvien tv){
        try {
            ps = Database.getConnect().prepareStatement("Update Thanhvien set tenThanhvien = ?, diaChi = ?,"
                    +"sDT=?,  cMND = ? where maThanhvien = ?");
            ps.setString(5, tv.getMaThanhvien());
            ps.setString(1, tv.getTenThanhvien());
            ps.setString(2, tv.getDiaChi());
            ps.setString(3, tv.getsDT());
           
            ps.setString(4, tv.getcMND());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteThanhvien(String mtv){
        try {
            ps = Database.getConnect().prepareCall("Delete From Thanhvien where maThanhvien = ?");
            ps.setString(1, mtv);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
