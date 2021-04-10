/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import static List.ListTaiKhoan.ps;
import Thucthe.theLoai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class ListTheLoai {
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
    
    public static void InsertTheLoai(theLoai tl){
        String sql = "Insert into theLoai values(?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(2, tl.getTenTheLoai());
            ps.setString(1, tl.getGhiChu());
            
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    
    
    public boolean DeleteTheLoai(String ttl){
        try {
            ps = Database.getConnect().prepareCall("Delete From theLoai where tenTheLoai = ?");
            ps.setString(1, ttl);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
