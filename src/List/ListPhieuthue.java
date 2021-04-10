/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import Thucthe.Phieuthue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhat
 */
public class ListPhieuthue {
    
   Vector<String> dsMaNV = new Vector<>();
    
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
    
    
    
    public static void InsertPhieuthue(Phieuthue pt){
        String sql = "Insert into Phieuthue values(?,?,?,?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(1, pt.getMaPhieu());
            ps.setString(2, pt.getMaThanhvien());
            ps.setString(3, pt.getMaNhanvien());
            ps.setDate(4, pt.getNgayThue());
            ps.setDate(5, pt.getHanTra());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    public Vector<String> docMaNV() {
		try
		{
			Connection con=Database.getConnect();
			String sql="Select maNhanvien from Nhanvien";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next())
			{
				String maNhanvien=rs.getString("maNhanvien");
				dsMaNV.add(maNhanvien);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dsMaNV;
	}
    
    public boolean UpdatePhieuthue(Phieuthue pt){
        try {
            ps = Database.getConnect().prepareStatement("Update Phieuthue set maThanhvien = ?, maNhanvien = ?,"
                    +"ngayThue=?, hanTra=? where soPhieu = ?");
            ps.setString(5, pt.getMaPhieu());
            ps.setString(1, pt.getMaThanhvien());
            ps.setString(2, pt.getMaNhanvien());
            ps.setDate(3, pt.getNgayThue());
            ps.setDate(4, pt.getHanTra());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeletePhieuthue(String mpt){
        try {
            ps = Database.getConnect().prepareCall("Delete From Phieuthue where soPhieu = ?");
            ps.setString(1, mpt);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
