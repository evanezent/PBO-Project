/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author TamaBarbar
 */
public class Kandidat {
    private String no_urut,nama_ketua,nama_wakil;
    private int jumlahSuara;
    private byte[] img;

    public Kandidat(String nama_ketua, String nama_wakil, String no_urut) {
        this.nama_ketua = nama_ketua;
        this.nama_wakil = nama_wakil;
        this.no_urut = no_urut;
  
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

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public int getJumlahSuara() {
        return jumlahSuara;
    }

    public void setJumlahSuara() {
        this.jumlahSuara = this.jumlahSuara+1;
    }

    
}
