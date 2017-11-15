/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Macealpe
 */
public class MyConnection {
    private static Connection connection = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            if(!(connection instanceof Connection)) {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost/docesesalgados", "postgres", "postgres");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        return connection;
    }    
}
