/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cristina
 */
public class Connecting {
    
    public static final String URL = "jdbc:mysql://localhost:3306/test";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Labonis1913#";
    
    public static Connection getConnection(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected to database");
        } catch (Exception e){
        System.out.println(e);
        System.out.println("not Connectatabase");
    }
        return connection;
    }
    
}
