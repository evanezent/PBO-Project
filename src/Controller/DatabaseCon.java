/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fadhil Zakaria
 */
public class DatabaseCon {
    private Connection conn = null;
    private ResultSet rs = null;
    private Statement statement = null;
    
    public void connect(){
        try{
            String url = "jdbc:mysql://localhost/mod10";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try{
            conn.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

