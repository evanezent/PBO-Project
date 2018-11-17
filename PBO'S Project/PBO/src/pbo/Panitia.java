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
public class Panitia extends Keperluan {
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
    
    
    //PEMILIH 
    public void tambah()
    {
        String nama, noKtp, ttl, alamat;
        System.out.print("Nama Pemilih : ");
        nama = input.nextLine();
        System.out.println("Nomor KTP    : ");
        noKtp = input.nextLine();
        System.out.println("TTL          : ");
        ttl = input.nextLine();
        System.out.println("Alamat       : ");
        alamat = input.nextLine();
        
        pemilih.add(new Pemilih(nama,noKtp,ttl,alamat));
    }
    
    public void hapus()
    {
        System.out.print("Hapus Pemilih, Nomor KTP : ");
        String x = input.nextLine();
        int i =0;
        while (i<= pemilih.size() && !pemilih.get(i).getNoKtp().equals(x)) {
            ++i;
        }
        pemilih.remove(i);
    }
    
    public void tampil()
    {
        for (Pemilih p : pemilih){          
            System.out.println(p.getNama_pemilih());
            System.out.println(p.getNoKtp());
            System.out.println(p.getTanggal_lahir());
            System.out.println(p.getAlamat());
        }
    }
    //KANDIDAT
    public void addKandidat()
    {
        String ketua, wakil, partai;
        int no_urut;
        System.out.print("Nama Ketua : ");
        ketua = input.nextLine();
        System.out.print("Nama Wakil : ");
        wakil = input.nextLine();
        System.out.print("Nomor Urut : ");
        no_urut = input.nextInt();
        System.out.print("Partai     : ");
        partai = input.nextLine();
        
        kandidat.add(new Kandidat(ketua,wakil,no_urut,partai));
    }
    
    public void hapusKandidat()
        {
            System.out.print("Hapus Kandidat No Urut : ");
            int x = input.nextInt();
            int i = 0;
            while (i<=kandidat.size() && kandidat.get(i).getNo_urut() != x)
            {
                i++;
            }
            kandidat.remove(i);
        }
}
