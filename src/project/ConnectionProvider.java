/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:127.0.0.1:3306/bank-account_management","root","Waseelalj14012000@#$");
            
            // new start
           // String sql = "insert into "
            
            return con;
        }
            catch(Exception e)
            {
                return null;
            
            }
    }
}
    
