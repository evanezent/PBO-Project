/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Database.Database;
import Model.*;
import View.*;
import java.util.*;
import java.awt.event.*;
/**
 *
 * @author esber
 */
public class ControllerPanitia_LiveCount extends MouseAdapter implements ActionListener {

    private Panitia_LiveCount view = new Panitia_LiveCount();
    private ArrayList<Kandidat> kandidat;// isi didapat dari panitia dan pemilih
    private List<Pemilih> pemilih; //dapet dr Panitia
    private Database db = new Database();
    int nKandidat,nPemilih;
    String hasil1,hasil2; 
    double count;
    
    public ControllerPanitia_LiveCount() {

        kandidat = db.getDataKandidat();
        pemilih = db.getDataPemilih();
        nKandidat = kandidat.size();
        nPemilih = pemilih.size();
        System.out.println(kandidat.get(0).getHasilSuara());
        System.out.println(nKandidat);
        view.ListenerLC(this);
        view.setVisible(true);
        
        count = kandidat.get(0).getHasilSuara()/nPemilih*100;
        hasil1 = Double.toString(count);
        view.setNo1(hasil1);
        //no 2
        count = kandidat.get(1).getHasilSuara()/nPemilih*100;
        hasil2 = Double.toString(count);
        view.setNo2(hasil2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(view.getDoneBtn()))
        {
            view.dispose();
            new ControllerPemilih_Menu();
        }
    }
       
}
