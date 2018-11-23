package Model;
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
    
    public void tambah(String nama,String user,String pasw)
    {
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

    public void hapus(String user) {
        int i =0;
        while (i<=panitia.size() && !panitia.get(i).getUser_panitia().equals(user))
        {
            i++;
        }
        panitia.remove(i);
    }
    
    public boolean login_panitia(String u,String p)
    {
        int i=0;
            do
            {
                i++;
            }while (i<=panitia.size() && !panitia.get(i).getUser_panitia().equals(u) || !panitia.get(i).getPasw_panitia().equals(p));
            if (panitia.get(i).getUser_panitia().equals(u) && panitia.get(i).getPasw_panitia().equals(p)) return true;
            else return false;
    }
    
    
 
}
