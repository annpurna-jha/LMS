/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author 91895
 */
public class DBConnection {
 public static Connection c = null; 
//    public static Statement st;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "Annpurna@2002");
//            st=c.createStatement();
        }catch(Exception ex){
//                JOptionPane.showMessageDialog(null, ex);
                    ex.printStackTrace();
        }
        return c;
    }
}
