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
public class Controller_LC extends MouseAdapter implements ActionListener {

    private GuiMenuLiveCount view = new GuiMenuLiveCount();
    private List<Kandidat> kandidat = new ArrayList();// isi didapat dari panitia dan pemilih
    private List<Pemilih> pemilih = new ArrayList(); //dapet dr Panitia
    public Controller_LC() {
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
        if (nKandidat == 2)
        {
            //no 1
            count = kandidat.get(0).getJumlahSuara()/nKandidat*100;
            hasil = Double.toString(count);
            view.setNo1(hasil);
            //no 2
            count = kandidat.get(1).getJumlahSuara()/nKandidat*100;
            hasil = Double.toString(count);
            view.setNo2(hasil);
        }
        if (nKandidat == 3)
        {
            count = kandidat.get(2).getJumlahSuara()/nKandidat*100;
            hasil = Double.toString(count);
            view.setNo3(hasil);
        }
        if (nKandidat== 4)
        {
            count = kandidat.get(3).getJumlahSuara()/nKandidat*100;
            hasil = Double.toString(count);
            view.setNo4(hasil);
        }
    }
       
}
