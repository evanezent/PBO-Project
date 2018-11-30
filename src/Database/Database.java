/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esber
 */

public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    

    
    public void Connect(){
        //System.out.println("Connecting..");
        try {
            String url = "jdbc:mysql://localhost/OOP";//Database kita
            String user = "root";
            String pass = "";
            this.conn = DriverManager.getConnection(url, user, pass);
            this.stmt = conn.createStatement();
            //System.out.println("Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println("Connection Failed.");
        }
    }
    
    public void Disconnect(){
        try {
            this.conn.close();
            this.stmt.close();
            //System.out.println("Disconnected.");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.println("Disconnect failed");
        }
    }
    
    public boolean Manipulate(String query){
        boolean cek = false;
        try {
            int rows = this.stmt.executeUpdate(query);
            if(rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }


    public Connection getConn() {
        return conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public void setRs(String query) {
        try {
            this.rs = this.stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isRsEmpty(ResultSet rs) throws SQLException{
        return !rs.isBeforeFirst();
    }
    
}

