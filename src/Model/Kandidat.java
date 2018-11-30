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
    private String no_urut,nama_ketua,nama_wakil;
    private int jumlahSuara;
    //private byte[] img;

    public Kandidat(String nama_ketua, String nama_wakil, String no_urut, int nSuara) {
        this.nama_ketua = nama_ketua;
        this.nama_wakil = nama_wakil;
        this.no_urut = no_urut;
        this.jumlahSuara = nSuara;
    }

    public String getNama_ketua() {
        return nama_ketua;
    }

    public void setNama_ketua(String nama_ketua) {
        this.nama_ketua = nama_ketua;
    }

    public String getNama_wakil() {
        return nama_wakil;
    }

    public void setNama_wakil(String nama_wakil) {
        this.nama_wakil = nama_wakil;
    }

    public String getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(String no_urut) {
        this.no_urut = no_urut;
    }

//    public byte[] getImg() {
//        return img;
//    }
//
//    public void setImg(byte[] img) {
//        this.img = img;
//    }

    public String getJumlahSuara() {
        String s = Integer.toString(jumlahSuara);
        return s;
    }

    public void setJumlahSuara() {
        this.jumlahSuara = this.jumlahSuara+1;
    }

    public void updatejumlahSuara(Kandidat k)//EROR
    {
        Database db = new Database();
        db.Connect();
        String query = "UPDATE `Kandidat` SET";
                        query += "`Ketua`= '"+k.getNama_ketua()+"',";
                        query += "`Wakil`= '"+k.getNama_wakil()+"',";
                        query += "`no_Urut`= '"+k.getNo_urut()+"'";
                        query += " `jumlahSuara` = '"+k.getJumlahSuara()+"';";
        
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
                        query +=  k.getNama_ketua() +"','";
                        query +=  k.getNama_wakil() +"','";
                        query +=  k.getNo_urut() +"','";
                        query +=  k.getJumlahSuara()+"')";
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
