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
    

    

    public void tambah(String nama, String noKtp,String ttl, String alamat)
    {
        pemilih.add(new Pemilih(nama,noKtp,ttl,alamat));
    }
    
    public void hapus(String noKtp)
    {
        int i =0;
        while (i<= pemilih.size() && !pemilih.get(i).getNoKtp().equals(noKtp)) {
            ++i;
        }
        pemilih.remove(i);
    }
    
    public String tampilPanitia()
    {
        String s = "Nama : "+nama_panitia+"\n"
                + "Username : "+user_panitia+"\n"
                + "Password : "+pasw_panitia+"\n";
        return s;
    }
    //KANDIDAT
    public void addKandidat(String ketua,String wakil,String partai, int no_urut)
    {
        kandidat.add(new Kandidat(ketua,wakil,no_urut,partai));
    }
    
    public void hapusKandidat(int noUrut)
        {
            int i = 0;
            while (i<=kandidat.size() && kandidat.get(i).getNo_urut() != noUrut)
            {
                i++;
            }
            kandidat.remove(i);
        }
    
    public boolean login_peserta(int noKtp)
    {
        int i =0;
        while (i<pemilih.size() && !pemilih.get(i).getNoKtp().equals(noKtp));
        {
            i++;
        };
        if (pemilih.get(i).getNoKtp().equals(noKtp)) return true;
        else return false;
        
    }

}
