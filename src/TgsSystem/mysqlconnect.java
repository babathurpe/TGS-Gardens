/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TgsSystem;

/**
 *
 * @author Babathurpe
 */
import java.sql.*;
import javax.swing.*;
public class mysqlconnect {
    Connection conn = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tgsdb", "root","root");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
