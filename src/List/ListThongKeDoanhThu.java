/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import Thucthe.ThongKeDia;
import Thucthe.ThongkeThanhvien;
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
public class ListThongKeDoanhThu {
     Vector<String> dsnam = new Vector<>();
     private ArrayList<Integer> dsn;
     public ListThongKeDoanhThu (){
        dsn=new ArrayList<>();
        
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
    public double tongtientheonam(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien])\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }
    public double tongtientheonamquy(String nam,String quy) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien])\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+" and DATEPART(quarter,[ngaykhachhangdentra])="+quy+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }         
     public double tongtientheonamquythang(String nam,String thang,String quy) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien])\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+" and DATEPART(quarter,[ngaykhachhangdentra])="+quy+" and MONTH([ngaykhachhangdentra])="+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }                                       
     
      public double tongtienkhachchuatratheonam(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM(soLuongThue*giathue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }
    public double tongtienkhachchuatratheonamquy(String nam,String quy) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM(soLuongThue*giathue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+" and DATEPART(quarter,[ngayThue]) between 1 and "+quy+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }         
     public double tongtienkhachchuatranamquythang(String nam,String thang,String quy) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM(soLuongThue*giathue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+" and DATEPART(quarter,[ngayThue])="+quy+" and MONTH([ngayThue]) between 1 and "+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }     
     public double tongphantram(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien]) \n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     } 
      public double bieudothang(int thang,String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien]) \n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+" and MONTH([ngaykhachhangdentra])="+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     } 
     public double bieudonam(int nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien]) \n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }  
    public int tongsonam() throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongnam=0;
           String sql="select count(DISTINCT Year([ngaykhachhangdentra])) \n" +
"from [dbo].[CtPhieuthue]";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongnam=rs.getInt(1);
            }                           
       return tongnam;
     }  
    public ArrayList<Integer> dsnam() throws SQLException, ParseException{
	
	  Connection con = Database.getConnect();
	  String sql = "select DISTINCT Year([ngaykhachhangdentra])\n" +
"from [dbo].[CtPhieuthue]\n" +
"where tinhtrang=N'Đã trả'";
	  Statement statement = con.createStatement();
	  ResultSet rs = statement.executeQuery(sql);
	  
	  while(rs.next()) {
                int sonam=rs.getInt(1);
                dsn.add(sonam);
	  }
        return dsn;
	 
  }
     public double bieudoquy(int quy,String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            double thanhtien=0;
           String sql="select SUM([thanhtien]) \n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on pt.soPhieu=ctpt.soPhieu\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+" and DATEPART(quarter,[ngaykhachhangdentra])="+quy+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                thanhtien=rs.getDouble(1);
            }                           
       return thanhtien;
     }  
}
