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
public class Kandidat {
    private String noUrut, namaKetua, namaWakil;
    private double hasilSuara;
    

    public Kandidat(String noUrut, String namaKetua, String namaWakil) {
        this.noUrut = noUrut;
        this.namaKetua = namaKetua;
        this.namaWakil = namaWakil;
    }
    public Kandidat(String namaKetua, String namaWakil, String noUrut, double hasilSuara) {
        this.namaKetua = namaKetua;
        this.namaWakil = namaWakil;
        this.noUrut = noUrut;
        this.hasilSuara = hasilSuara;
    }

    public String getNamaKetua() {
        return namaKetua;
    }
    

    public void setNamaKetua(String namaKetua) {
        this.namaKetua = namaKetua;

    }

    public String getNamaWakil() {
        return namaWakil;
    }
    public void setNamaWakil(String namaWakil) {
        this.namaWakil = namaWakil;
    }

    public String getNoUrut() {
        return noUrut;
    }


    public void setNoUrut(String noUrut) {
        this.noUrut = noUrut;
    }

//    public byte[] getImg() {
//        return img;
//    }
//
//    public void setImg(byte[] img) {
//        this.img = img;
//    }

    public void setHasilSuara() {
        this.hasilSuara++;
    }

    public double getHasilSuara() {

        return this.hasilSuara;
    }
    
    public void updatejumlahSuara(Kandidat k)//EROR
    {
        Database db = new Database();
        db.Connect();
        String query = "UPDATE `Kandidat` SET";
                        query += " `jumlahSuara` = '"+k.getHasilSuara()+"'";
                        query += "WHERE `no_Urut` = '"+k.getNoUrut()+"';";
        
        System.out.println(query);
        if (db.Manipulate(query))
        {
            System.out.println("UPDATE SUCCES");
        }
        else
        {
            System.out.println("FAILED");
        }
        db.Disconnect();
    }
    

    public void insertKandidat(Kandidat k)
    {
        String query = "INSERT INTO `Kandidat` VALUES('";
                        query +=  k.getNamaKetua() +"','";
                        query +=  k.getNamaWakil() +"','";
                        query +=  k.getNoUrut() +"','";
                        query +=  k.getHasilSuara()+"')";
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

    
    public List<Kandidat> getAllKandidat() throws SQLException
    {
        List<Kandidat> kandidat = new ArrayList();
        Database db = new Database();
        db.Connect();
        String query = "SELECT * FROM `Kandidat`";
        
        db.setRs(query);
        if(!db.isRsEmpty(db.getRs()))
        {
            ResultSet rs = db.getRs();
            while(db.getRs().next())
            {
                Kandidat k = new Kandidat(rs.getString("Ketua"),
                        rs.getString("Wakil"),
                        rs.getString("no_Urut"),
                        rs.getInt("jumlahSuara"));
                kandidat.add(k);
            }
        }
        else
        {
            System.out.println("DATABASE KOSONG");
        }
        return kandidat;
    }
    
}
