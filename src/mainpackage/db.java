/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author TrungAladin
 */
public class db {
    
    Connection conn = null;
    public static Connection java_db(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\TrungAladin\\Desktop\\MyApp\\java-app\\DBFile.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
