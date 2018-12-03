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
import Model.*;
import java.util.*;

/**
 *
 * @author esber
 */

public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Kandidat> kandidat = new ArrayList();
    private ArrayList<Pemilih> pemilih = new ArrayList();
    private Panitia panitia;

    public Database() {
        loadKandidat();
        loadPemilih();
    }
    

    
    
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
    
    public void loadKandidat()
    {
        Connect();
        String query = "SELECT * FROM Kandidat";
        try {
            
            rs = stmt.executeQuery(query);
            while (rs.next())
            {
                kandidat.add(new Kandidat(rs.getString("Ketua"),rs.getString("Wakil"),rs.getString("no_Urut"),rs.getDouble("jumlahSuara")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public void loadPemilih()
    {
        
        Connect();
        String query = "SELECT * FROM Pemilih";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next())
            {
                pemilih.add(new Pemilih(rs.getString("Nama Pemilih"),rs.getString("No_KTP"),rs.getString("tgl_lahir"),rs.getString("alamat")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public void insertPemilih(Pemilih p)
    {
        Connect();
        String query = "INSERT INTO `Pemilih` VALUES('";
                        query +=  p.getNama_pemilih() +"','";
                        query +=  p.getNoKtp() +"','";
                        query +=  p.getTanggal_lahir() +"','";
                        query +=  p.getAlamat()+"')";
        
        System.out.println(query);
        if (Manipulate(query))
        {
            pemilih.add(p);
        }
        else
        {
            System.out.println("FAILED");
        }
        Disconnect();
    }
    
    public void delPemilih(String selected) {
        Connect();
        String query = "DELETE FROM `Pemilih` WHERE `No_KTP`='" + selected + "'";
        if (Manipulate(query)){
            for (Pemilih find : pemilih) {
                if (find.getNoKtp().equals(selected)){
                    pemilih.remove(find);
                    break;
                }
            }
        }
        Disconnect();
    }
    
    public void updatePemilih(Pemilih p, String ktp) {
        Connect();
        String query = "UPDATE `Pemilih` SET";
        query += " `Nama Pemilih`='" + p.getNama_pemilih() + "',";
        query += " `No_KTP`='" + p.getNoKtp() + "'";
        query += " WHERE `No_KTP`='" + ktp + "'";
        if (Manipulate(query)){
            for (Pemilih find : pemilih) {
                if (find.getNoKtp().equals(ktp)){
                    find.setNama_pemilih(p.getNama_pemilih());
                    find.setNoKtp(p.getNoKtp());
                    break;
                }
            }
        }
        Disconnect();
    }
    
    public void updateKandidat(Kandidat k, String urutan) {
        Connect();
        String query = "UPDATE `Kandidat` SET";
        query += " `Ketua`='" + k.getNamaKetua() + "',";
        query += " `Wakil`='" + k.getNamaWakil() + "',";
        query += " `no_Urut`='" + k.getNoUrut() + "'";
        query += " WHERE `no_Urut`='" + urutan + "'";
        if (Manipulate(query)){
            for (Kandidat find : kandidat) {
                if (find.getNoUrut().equals(urutan)){
                    find.setNamaKetua(k.getNamaKetua());
                    find.setNamaWakil(k.getNamaWakil());
                    find.setNoUrut(k.getNoUrut());
                    break;
                }
            }
        }
        Disconnect();
    }
        public void updatejumlahSuara(Kandidat k)//EROR
    {
        Database db = new Database();
        db.Connect();
        String query = "UPDATE `Kandidat` SET";
                        query += " `jumlahSuara` = '"+k.getHasilSuara()+"'";
                        query += "WHERE `no_Urut` = '"+k.getNoUrut()+"';";
        
        if (db.Manipulate(query)){
            for (Kandidat find : kandidat) {
                if (find.getNoUrut().equals(k.getNoUrut())){
                    find.setHasilSuara(k.getHasilSuara());
                    break;
                }
            }
        }
        db.Disconnect();
    }
    
    
    public void updatePanitia(Panitia p,Panitia update)
    {
        Connect();
        String query = "UPDATE `Panitia` SET ";
               query += "`Nama Panitia` = '" + p.getNama_panitia()+"',";
               query += "`Username` = '" + p.getUser_panitia()+"',";
               query += "`Password` = '" + p.getPasw_panitia()+"'";
               query += " WHERE `Username` = '" + update.getUser_panitia()+"';";
               System.out.println(query);
               if (Manipulate(query))
               {
                   System.out.println("Data berhasil di Update");
               }
               else
               {
                   System.out.println("Data gagal di Update");
               }
               Disconnect();
    }
    
    public void deletePanitia(Panitia p)
    {
        Connect();
        String query = "DELETE FROM `Panitia` WHERE Username = '"+p.getUser_panitia()+"';";
        if (Manipulate(query))
        {
            System.out.println("TERHAPUS");
        }
        else
        {
            System.out.println("GAGAL");
    
        }
        Disconnect();
    }
    public void insertKandidat(Kandidat k)
    {
        Connect();
        String query = "INSERT INTO `Kandidat` VALUES('";
                        query +=  k.getNamaKetua() +"','";
                        query +=  k.getNamaWakil() +"','";
                        query +=  k.getNoUrut() +"','";
                        query +=  k.getHasilSuara()+"')";
        
        System.out.println(query);
        if (Manipulate(query))
        {
            kandidat.add(k);
        }
        else
        {
            System.out.println("FAILED");
        }
          Disconnect();
    }
    
     public void delKandidat(Kandidat k) {
        Connect();
        String query = "DELETE FROM `Kandidat` WHERE `no_Urut`='" + k.getNoUrut() + "'";
        if (Manipulate(query)){
            for (Kandidat find : kandidat) {
                if (find.getNoUrut().equals(k.getNoUrut())){
                    kandidat.remove(find);
                    break;
                }
            }
        }
        Disconnect();
    }
     
     
    public boolean LoginPemilih(String ktp){
        boolean cek = false;
        Connect();
        for (Pemilih find : pemilih) {
            if (find.getNoKtp().equals(ktp)){
                cek = true;
                break;
            }
        }
        Disconnect();
        return cek;
    }
     
    public ArrayList<Pemilih> getDataPemilih()
    {
        return pemilih;
    }
    
    public ArrayList<Kandidat> getDataKandidat()
    {
        return kandidat;
    }
}

