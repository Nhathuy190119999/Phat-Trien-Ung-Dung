/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nhat
 */
public class Database {
    private static Connection con;
    
    public static Connection getConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TestDb1;Username=sa;Password =sapassword");
        } catch (Exception e) {
            System.out.println("Ket noi khong thanh cong");
        }
        return con;
    }
    public static String testConnect(){
        try {
            con = Database.getConnect();
            return "Ket noi thanh cong";
        } catch (Exception e) {
            return "Ket noi that bai";
        }
        
    }
    
}
