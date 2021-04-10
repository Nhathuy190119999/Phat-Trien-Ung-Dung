/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;


import Thucthe.CtPhieuThue;
import Thucthe.Dia;
import Thucthe.GetDataDia;
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
public class ListCtPhieuthue {
    
    Vector<String> dsMaPhieu = new Vector<>();
    
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

    
    public static void InsertCtPhieuthue(CtPhieuThue ctpt){
        String sql = "Insert into CtPhieuthue(sophieu,madia,soluongthue,giathue,tinhtrang) values(?,?,?,?,?)";
        try {
            ps = Database.getConnect().prepareCall(sql);
            ps.setString(1, ctpt.getMaPhieu());
            ps.setString(2, ctpt.getMaDia());
            ps.setInt(3, ctpt.getSoLuong());
            ps.setInt(4, ctpt.getGiaThue());
            ps.setString(5, ctpt.getTinhTrang());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo",1);
        }
    }
    
    public boolean UpdateCtPhieuthue(CtPhieuThue ctpt){
        try {
            ps = Database.getConnect().prepareStatement("Update CtPhieuthue set maDia = ?, soLuongThue = ?,"
                    +"giaThue=?, tinhTrang = ? where soPhieu = ?");
            ps.setString(5, ctpt.getMaPhieu());
            ps.setString(1, ctpt.getMaDia());
            ps.setInt(2, ctpt.getSoLuong());
            ps.setInt(3, ctpt.getGiaThue());
            ps.setString(4, ctpt.getTinhTrang());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
  
    public boolean UpdateSltDia(Dia d){
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
  
    public boolean UpdateSltDia2(String maDia, int soLuongTon){
        Connection con=Database.getConnect();
		PreparedStatement stmt=null;
		int n=0;
		try
		{
			stmt=con.prepareStatement("update Dia set soLuongTon=? where maDia=?");
			stmt.setString(2, maDia);
                        stmt.setInt(1, soLuongTon);
			n=stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return n>0;
    }
    
    
    public Vector<String> docMaPhieu() {
		try
		{
			Connection con=Database.getConnect();
			String sql="Select soPhieu from Phieuthue";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next())
			{
				String maPhieu=rs.getString("soPhieu");
				dsMaPhieu.add(maPhieu);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dsMaPhieu;
	}
    
    public boolean delete(String soPhieu) {
		Connection con=Database.getConnect();
		PreparedStatement stmt=null;
		int n=0;
		try
		{
			stmt=con.prepareStatement("delete from CtPhieuthue where soPhieu = ?");
			stmt.setString(1, soPhieu);
			n=stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return n>0;
	}
}
