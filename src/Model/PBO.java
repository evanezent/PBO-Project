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
public class PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Panitia> panitia = new ArrayList() ;
        Scanner input= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            
        String nama, user, pasw;
        System.out.print("Nama Panitia : ");
        nama = input.nextLine();
        System.out.print("Username     : ");
        user = input.nextLine();
        System.out.print("Password     : ");
        pasw = input.nextLine();
        
        panitia.add(new Panitia(nama,user,pasw));
        }
        
        for (Panitia p : panitia){          
            System.out.println(p.getNama_panitia());
            System.out.println(p.getUser_panitia());
            System.out.println(p.getUser_panitia());
        }
    }
    
}
