package Model;
import java.util.*;
/**
 *
 * @author TamaBarbar
 */
public class Admin{
    private String username_admin = "admin"; 
    private String password_admin = "12345";
    private List<Panitia> panitia = new ArrayList();
    int idx;
    Scanner input = new Scanner(System.in);
    
//    public void Login_admin()
//    {
//        while((!username_admin.equals("admin")) || (!password_admin.equals("12345"))){
//            System.out.print("Username : ");
//            username_admin = input.nextLine();
//            System.out.print("Password : ");
//            password_admin = input.nextLine();
//        };
//    }
    
    //Get USer n Password

    public String getUsername_admin() {
        return username_admin;
    }

    public String getPassword_admin() {
        return password_admin;
    }
    
    
    public void tambah(String nama,String user,String pasw)
    {
        panitia.add(new Panitia(nama,user,pasw));
        
    }
    
    public String Tampil(int idx){
        String s = "Nama : "+panitia.get(idx).getNama_panitia()+"\n"
                 +"Username : "+panitia.get(idx).getUser_panitia()+"\n"
                 +"Password : "+panitia.get(idx).getPasw_panitia();
        return s;
    }
    

    public void hapus(int i) {
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
