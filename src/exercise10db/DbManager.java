/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10db;

import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author Philip Evans
 */
public class DbManager {
    public static void main(String[] args) throws Exception {
        //
        Class.forName("org.hsqldb.jdbc.JDBCDriver");
        
        try{
            
            Connection con = DriverManager.getConnection("jdbc:hsqldb:file:c/db/pcvo2018", "SA", "");
            PreparedStatement ps1 = con.prepareStatement("insert into books values (?,?)");
            ps1.setString(1, "title");
            ps1.setInt(2, 12413);
            //non-select statements
            ps1.executeUpdate();
            
            PreparedStatement ps2 = con.prepareStatement("select * from books");
            //for select statements only
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next()){
                System.out.println(rs2.getString(1) + " " + rs2.getInt(2));
            }
        } 
        catch (Exception ex)
        {
            System.out.println("error:" + Arrays.toString(ex.getStackTrace()) + "\r\n" + ex.toString());
        }
        
        
    }
}
