/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

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
public class ListThongKeKhachHang {
    private ArrayList<ThongkeThanhvien> dstvn;
     private ArrayList<ThongkeThanhvien> dstvt; 
      Vector<String> dsnam = new Vector<>();
     public ListThongKeKhachHang (){
        dstvn=new ArrayList<>();
        dstvt=new ArrayList<>();
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
     public ArrayList<ThongkeThanhvien> thanhvientheunhieunhattheonam(String nam) throws SQLException, ParseException{
	
	  Connection con = Database.getConnect();
	  String sql = "select  pt.maThanhvien,tv.tenThanhvien,tv.diaChi,SoLuongDiaThue=SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngaykhachhangdentra])="+nam+"\n" +
"group by pt.maThanhvien,tv.tenThanhvien,tv.diaChi\n" +
"order by SUM(ctpt.soluongthue) desc";
	  Statement statement = con.createStatement();
	  ResultSet rs = statement.executeQuery(sql);
	  
	  while(rs.next()) {
		String mathanhvien=rs.getString(1);
                String tenthanhvien=rs.getString(2);
                String diachi=rs.getString(3);
                int soluongdiathue=rs.getInt(4);
                ThongkeThanhvien thongkethanhvien=new ThongkeThanhvien(mathanhvien, tenthanhvien, diachi, soluongdiathue);
                dstvn.add(thongkethanhvien);
	  }
        return dstvn;
	 
  }
   public ArrayList<ThongkeThanhvien> thanhvientheunhieunhattheonamthang(String nam,String thang) throws SQLException, ParseException{
	
	  Connection con = Database.getConnect();
	  String sql = "select  pt.maThanhvien,tv.tenThanhvien,tv.diaChi,SoLuongDiaThue=SUM(ctpt.soluongthue)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien\n" +
"where tinhtrang=N'Đã trả' and MONTH([ngaykhachhangdentra])="+thang+" and YEAR([ngaykhachhangdentra])="+nam+"\n" +
"group by pt.maThanhvien,tv.tenThanhvien,tv.diaChi\n" +
"order by SUM(ctpt.soluongthue) desc";
	  Statement statement = con.createStatement();
	  ResultSet rs = statement.executeQuery(sql);
	  
	  while(rs.next()) {
		String mathanhvien=rs.getString(1);
                String tenthanhvien=rs.getString(2);
                String diachi=rs.getString(3);
                int soluongdiathue=rs.getInt(4);
                ThongkeThanhvien thongkethanhvien=new ThongkeThanhvien(mathanhvien, tenthanhvien, diachi, soluongdiathue);
                dstvt.add(thongkethanhvien);
	  }
        return dstvt;
	 
  }
   public void xoaphantulist(){
      dstvn.clear();
      dstvt.clear();
   }
    public double tongsokhachhang() throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongkhachhang=0;
           String sql="select Count(maThanhvien)\n" +
"from Thanhvien";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongkhachhang=rs.getInt(1);
            }                           
       return tongkhachhang;
     }
     public double tongsokhachhangchuatratheonam(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongkhachhangchuatra=0;
           String sql="select Count(DISTINCT pt.mathanhvien)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongkhachhangchuatra=rs.getInt(1);
            }                           
       return tongkhachhangchuatra;
     }
     public double tongsokhachhangchuatratheonamthang(String nam,String thang) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongkhachhangchuatra=0;
           String sql="select Count(DISTINCT pt.mathanhvien)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien\n" +
"where tinhtrang=N'Chưa trả' and YEAR([ngayThue])="+nam+" and MONTH([ngayThue]) between 1 and "+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongkhachhangchuatra=rs.getInt(1);
            }                           
       return tongkhachhangchuatra;
     }
      public double tongsokhachhangdatratheonam(String nam) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongkhachhangchuatra=0;
           String sql="select Count(DISTINCT pt.mathanhvien)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngayThue])="+nam+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongkhachhangchuatra=rs.getInt(1);
            }                           
       return tongkhachhangchuatra;
     }
     public double tongsokhachhangdatratheonamthang(String nam,String thang) throws SQLException{
            Connection con=Database.getConnect();
            PreparedStatement stmt=null;
            int tongkhachhangchuatra=0;
           String sql="select Count(DISTINCT pt.mathanhvien)\n" +
"from [dbo].[CtPhieuthue] ctpt join [dbo].[Phieuthue] pt on ctpt.sophieu=pt.sophieu join Thanhvien tv on tv.maThanhvien=pt.maThanhvien\n" +
"where tinhtrang=N'Đã trả' and YEAR([ngayThue])="+nam+" and MONTH([ngayThue])="+thang+"";
            Statement statement=con.createStatement();
	    ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                tongkhachhangchuatra=rs.getInt(1);
            }                           
       return tongkhachhangchuatra;
     }
}
