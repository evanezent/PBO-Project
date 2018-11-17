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
public class Admin implements MenuTambahan{
    private String username_admin = "a"; 
    private String password_admin = "a";
    private List<Panitia> panitia = new ArrayList();
    int idx;
    Scanner input = new Scanner(System.in);
    
    public void Login_admin()
    {
        while((!username_admin.equals("admin")) || (!password_admin.equals("12345"))){
            System.out.print("Username : ");
            username_admin = input.nextLine();
            System.out.print("Password : ");
            password_admin = input.nextLine();
        };
    }
    
    public void tambah()
    {
        String nama, user, pasw;
        System.out.print("Nama Panitia : ");
        nama = input.nextLine();
        System.out.print("Username     : ");
        user = input.nextLine();
        System.out.print("Password     : ");
        pasw = input.nextLine();
        
        panitia.add(new Panitia(nama,user,pasw));
        
    }
    
    public List<Panitia> getPanitia() {
        return panitia;
    }
    
    public void tampil()
    {
        for (Panitia p : panitia){          
            System.out.println(p.getNama_panitia());
            System.out.println(p.getUser_panitia());
            System.out.println(p.getUser_panitia());
        }
    }

    public void hapus() {
        String x;
        System.out.print("Masukan user yg Ingin di Hapus : ");
        x = input.nextLine();
        int i =0;
        while (i<=panitia.size() && !panitia.get(i).getUser_panitia().equals(x))
        {
            i++;
        }
        panitia.remove(i);
    }

 
}
