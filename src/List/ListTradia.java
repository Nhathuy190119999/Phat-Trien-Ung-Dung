/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import static List.ListCtPhieuthue.ps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tanche_pc
 */
public class ListTradia {
    public Date ngaykhachhangdentratrongphieuthue(String maphieu) throws SQLException{
           // định dạng kiểu ngày	
    	
         Connection con=Database.getConnect();
         PreparedStatement stmt=null;
         String sql="select sophieu,hantra\n" +
"from [dbo].[Phieuthue]";
         Date ngaykhachhangdentraphieuthue = null;
          Statement statement=con.createStatement();
	  ResultSet rs=statement.executeQuery(sql);
          while(rs.next()){
              if(rs.getString("sophieu").equalsIgnoreCase(maphieu))
                 ngaykhachhangdentraphieuthue=rs.getDate(2);
          }
       return  ngaykhachhangdentraphieuthue;
     }
     public boolean updatengaykhachhangdentrathanhtien(String sophieu,String madia,Date ngaykhachhangdentra,int thanhtien) throws SQLException{
                Connection con=Database.getConnect();
		PreparedStatement stmt=null;
		int n=0;
		try
		{
                        
                            stmt=con.prepareStatement("update CtPhieuthue set thanhtien=?,ngaykhachhangdentra=? where sophieu =? and madia=?");
                    
                            stmt.setInt(1,thanhtien);
                            stmt.setDate(2,(java.sql.Date)ngaykhachhangdentra);
                            stmt.setString(3, sophieu);
                            stmt.setString(4, madia);
                            n=stmt.executeUpdate();
                        
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return n>0;
     }
      public boolean updatetinhtrang(String tinhtrang,String sophieu,String madia) throws SQLException{
         Connection con=Database.getConnect();
		PreparedStatement stmt=null;
		int n=0;

		try
		{
                        
                            stmt=con.prepareStatement("update CtPhieuthue set tinhtrang=? where sophieu =? and madia=?");
                            stmt.setString(1, tinhtrang);
                            stmt.setString(2, sophieu);
                            stmt.setString(3, madia);
                            n=stmt.executeUpdate();
                        
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return n>0;
     }

    public int soluongton(String madia) throws SQLException{
          
    	
         Connection con=Database.getConnect();
         PreparedStatement stmt=null;
         int soluongton=0;
         String sql="select *from dia";
          Statement statement=con.createStatement();
	  ResultSet rs=statement.executeQuery(sql);
          while(rs.next()){
              if(rs.getString("madia").equalsIgnoreCase(madia))
                 soluongton=rs.getInt("soluongton");
          }
       return  soluongton;
     }

  
}
