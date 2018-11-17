/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.*;
/**
 *
 * @author TamaBarbar
 */
public class Kandidat {
    private String nama_ketua,nama_wakil;
    private int no_urut,jumlahSuara;
    Partai partai;

    public Kandidat(String nama_ketua, String nama_wakil, int no_urut, String partai) {
        this.nama_ketua = nama_ketua;
        this.nama_wakil = nama_wakil;
        this.no_urut = no_urut;
        this.partai = new Partai(partai);
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

    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
    }

    public Partai getPartai() {
        return partai;
    }

    public void setPartai(Partai partai) {
        this.partai = partai;
    }

}
