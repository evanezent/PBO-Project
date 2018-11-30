/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author TamaBarbar
 */
public class Pemilih {
    private String nama_pemilih,noKtp,tanggal_lahir,alamat;

    public Pemilih(String nama_pemilih, String noKtp, String tanggal_lahir, String alamat) {
        this.nama_pemilih = nama_pemilih;
        this.noKtp = noKtp;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
    }

    public String getNama_pemilih() {
        return nama_pemilih;
    }

    public void setNama_pemilih(String nama_pemilih) {
        this.nama_pemilih = nama_pemilih;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
        public void insertPemilih(Pemilih p)
    {
        String query = "INSERT INTO `Pemilih` VALUES('";
                        query +=  p.getNama_pemilih() +"','";
                        query +=  p.getNoKtp() +"','";
                        query +=  p.getTanggal_lahir() +"','";
                        query +=  p.getAlamat()+"')";
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
    
    public List<Pemilih> getAllPemilih() throws SQLException
    {
        List<Pemilih> pemilih = new ArrayList();
        Database db = new Database();
        db.Connect();
        String query = "SELECT * FROM `Pemilih`";
        
        db.setRs(query);
        if(!db.isRsEmpty(db.getRs()))
        {
            ResultSet rs = db.getRs();
            while(db.getRs().next())
            {
                Pemilih p = new Pemilih(rs.getString("Nama Pemilih"),
                        rs.getString("No_KTP"),
                        rs.getString("tgl_lahir"),
                        rs.getString("alamat"));
                pemilih.add(p);
            }
        }
        else
        {
            System.out.println("DATABASE KOSONG");
        }
        return pemilih;
    }
}
