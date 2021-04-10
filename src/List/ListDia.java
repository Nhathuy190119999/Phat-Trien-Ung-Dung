/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import Thucthe.Dia;
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
public class ListDia {
    
    Vector<String> dsTheLoai = new Vector<>();
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
    
    public static void InsertDia(Dia d){
        String sql = "Insert into Dia values(?,?,?,?,?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(1, d.getMaDia());
            ps.setString(2, d.getTenDia());
            ps.setString(3, d.getTenTheLoai());
            ps.setInt(4, d.getSoLuongTon());
            ps.setString(5, d.getHangSx());
            ps.setInt(6, d.getGiaThue());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    public Vector<String> docTheLoai() {
		try
		{
			Connection con=Database.getConnect();
			String sql="Select tenTheLoai from theLoai";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next())
			{
				String tenTheLoai=rs.getString("tenTheLoai");
				dsTheLoai.add(tenTheLoai);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dsTheLoai;
	}
    
    public boolean UpdateDia(Dia d){
        try {
            ps = Database.getConnect().prepareStatement("Update Dia set tenDia = ?, tenTheLoai = ?,"
                    +"soLuongTon=?, hangSx=?, giaThue = ? where maDia = ?");
            ps.setString(6, d.getMaDia());
            ps.setString(1, d.getTenDia());
            ps.setString(2, d.getTenTheLoai());
            ps.setInt(3, d.getSoLuongTon());
            ps.setString(4, d.getHangSx());
            ps.setInt(5, d.getGiaThue());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteDia(String md){
        try {
            ps = Database.getConnect().prepareCall("Delete From Dia where maDia = ?");
            ps.setString(1, md);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
}
