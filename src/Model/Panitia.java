/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Database.Database;
import javax.swing.JOptionPane;
 /*
 * @author TamaBarbar
 */
public class Panitia {
    private String nama_panitia, user_panitia, pasw_panitia;
    List<Pemilih> pemilih = new ArrayList();
    List<Kandidat> kandidat = new ArrayList();
    Scanner input = new Scanner(System.in);

    public Panitia(String nama_panitia, String user_panitia, String pasw_panitia) {
        this.nama_panitia = nama_panitia;
        this.user_panitia = user_panitia;
        this.pasw_panitia = pasw_panitia;
    }

    public String getNama_panitia() {
        return nama_panitia;
    }

    public void setNama_panitia(String nama_panitia) {
        this.nama_panitia = nama_panitia;
    }

    public String getUser_panitia() {
        return user_panitia;
    }

    public void setUser_panitia(String user_panitia) {
        this.user_panitia = user_panitia;
    }

    public String getPasw_panitia() {
        return pasw_panitia;
    }

    public void setPasw_panitia(String pasw_panitia) {
        this.pasw_panitia = pasw_panitia;
    }
    
    public String tampilPanitia()
    {
        String s = "Nama : "+nama_panitia+"\n"
                + "Username : "+user_panitia+"\n"
                + "Password : "+pasw_panitia+"\n";
        return s;
    }
    
        public boolean checkUser(String uname, String pass) throws SQLException{
        boolean valid = false;
        Database db = new Database();
        db.Connect();
        String query = "SELECT * FROM `Panitia` WHERE `Username` LIKE '"+uname+"'";
        System.out.println(query);
        db.setRs(query);
        if (db.isRsEmpty(db.getRs())) {
            System.out.println("Username not found");
        }else {
            while(db.getRs().next()){
                if(db.getRs().getString("Password").equals(pass)){
                    valid = true;
                }else{
                    System.out.println("Wrong Password");
                }
            }
        }
        db.Disconnect();
        return valid;
    }
    
    public void insertPanitia(Panitia p) throws SQLException
    {
        String query = "INSERT INTO `Panitia` VALUES('";
                        query +=  p.getNama_panitia() +"','";
                        query +=  p.getUser_panitia() +"','";
                        query +=  p.getPasw_panitia() +"')";
        Database db = new Database();
        db.Connect();
        System.out.println(query);
        if (db.Manipulate(query))
        {
            System.out.println("SUCCES");
        }
        else
        {
            System.out.println("FAILED");
        }
                       
    }
    
    public void deletePanitia(Panitia p) throws SQLException
    {
        Database db = new Database();
        db.Connect();
        String query = "DELETE FROM `Panitia` WHERE `Username` = '"+p.getUser_panitia()+"';";
        
    }

    public List<Panitia> getAllPanitia() throws SQLException
    {
        List<Panitia> panitia = new ArrayList();
        Database db = new Database();
        db.Connect();
        String query = "SELECT * FROM `Panitia`";
        
        db.setRs(query);
        if(!db.isRsEmpty(db.getRs()))
        {
            ResultSet rs = db.getRs();
            while(db.getRs().next())
            {
                Panitia p = new Panitia(rs.getString("Nama Panitia"),
                        rs.getString("Username"),
                        rs.getString("Password"));
                panitia.add(p);
            }
        }
        else
        {
            System.out.println("DATABASE KOSONG");
        }
        return panitia;
    }
}
