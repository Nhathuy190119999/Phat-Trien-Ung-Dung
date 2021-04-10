/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import Thucthe.ThongKeDia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author tanche_pc
 */
public class ListThongKeDia {
    private ArrayList<ThongKeDia> dsdn;
     private ArrayList<ThongKeDia> dsdt; 
     Vector<String> dsnam = new Vector<>();
     public ListThongKeDia (){
        dsdn=new ArrayList<>();
        dsdt=new ArrayList<>();
    }
     public Vector<String> docnam() {
	try
	{
		Connection con=Database.getConnect();
		String sql="select DISTINCT Year([ngaythue]) from Phieuthue order by Year([ngaythue]) asc";
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		while(rs.next())
		{
			String ngaykhdentra=rs.getString(1);
			dsnam.add(ngaykhdentra);
		}
	}
	catch(SQLException e){
		e.printStackTrace();
	}
		return dsnam;
    }
    public double tongsodiaton() throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongsodiaton=0;
           String sql="select SUM(soluongton) from Dia";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongsodiaton=rs.getInt(1);
            }                           
       return tongsodiaton;
     }
     public double tongsodiachuatratheonam(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongkhachhangchuatra=0;
           String sql="select SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongkhachhangchuatra=rs.getInt(1);
            }                           
       return tongkhachhangchuatra;
     }
     public double tongsodiachuatratheonamthang(String nam,String thang) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongsodiachuatra=0;
           String sql="select SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+" and MONTH([ngayThue]) between 1 and "+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongsodiachuatra=rs.getInt(1);
            }                           
       return tongsodiachuatra;
     }
     public double tongsodiadatratheonam(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongdiadatra=0;
           String sql="select SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongdiadatra=rs.getInt(1);
            }                           
       return tongdiadatra;
     }
     public double tongsodiadatratheonamthang(String nam,String thang) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongdiadatra=0;
           String sql="select SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+" and MONTH([ngaykhachhangdentra])="+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongdiadatra=rs.getInt(1);
            }                           
       return tongdiadatra;
     }
     
     public ArrayList<ThongKeDia> diatheunhieunhattheonam(String nam) throws SQLException, ParseException{
	
	  Connection con = Database.getConnect();
	  String sql = "select  ctpt.madia,tendia,tenTheLoai,SoLuongDiaThue=SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia\n" +
"where YEAR([ngayThue])="+nam+"\n" +
"group by ctpt.madia,tendia,tenTheLoai\n" +
"order by SUM(ctpt.soluongthue) desc";
	  Statement statement = con.createStatement();
	  ResultSet rs = statement.executeQuery(sql);
	  
	  while(rs.next()) {
		String madia=rs.getString(1);
                String tendia=rs.getString(2);
                String tentheloai=rs.getString(3);
                int soluongdiathue=rs.getInt(4);
                ThongKeDia thongkedia=new ThongKeDia(madia, tendia, tentheloai, soluongdiathue);
                dsdn.add(thongkedia);
	  }
        return dsdn;
	 
  }
     public ArrayList<ThongKeDia> diatheunhieunhattheonamthang(String nam,String thang) throws SQLException, ParseException{
	
	  Connection con = Database.getConnect();
	  String sql = "select  ctpt.madia,tendia,tenTheLoai,SoLuongDiaThue=SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join dia d on d.maDia=ctpt.maDia\n" +
"where YEAR([ngayThue])="+nam+" and MONTH([ngayThue])="+thang+"\n" +
"group by ctpt.madia,tendia,tenTheLoai\n" +
"order by SUM(ctpt.soluongthue) desc";
	  Statement statement = con.createStatement();
	  ResultSet rs = statement.executeQuery(sql);
	  
	  while(rs.next()) {
		String madia=rs.getString(1);
                String tendia=rs.getString(2);
                String tentheloai=rs.getString(3);
                int soluongdiathue=rs.getInt(4);
                ThongKeDia thongkedia=new ThongKeDia(madia, tendia, tentheloai, soluongdiathue);
                dsdt.add(thongkedia);
	  }
        return dsdt;
	 
  }
     public void xoaphantulist(){
      dsdt.clear();
      dsdn.clear();
   }
}
