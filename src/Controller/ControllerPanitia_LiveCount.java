/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
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
    private List<Kandidat> kandidat = new ArrayList();// isi didapat dari panitia dan pemilih
    private List<Pemilih> pemilih = new ArrayList(); //dapet dr Panitia
    public ControllerPanitia_LiveCount() {
        view.setTitle("Live Count");
        view.ListenerLC(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        int nKandidat = kandidat.size()+1;
        int nPemilih = pemilih.size();
        double count;
        String hasil; 
        //no 1
        count = kandidat.get(0).getHasilSuara()/nKandidat*100;
        hasil = Double.toString(count);
        view.setNo1(hasil);
        //no 2
        count = kandidat.get(1).getHasilSuara()/nKandidat*100;
        hasil = Double.toString(count);
        view.setNo2(hasil);
    }
       
}
