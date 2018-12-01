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
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerPemilih_Menu extends MouseAdapter implements ActionListener {

    private Pemilih_Menu view = new Pemilih_Menu();
    private List<Kandidat> kandidat = new ArrayList(); // List sambungan isi dari Panitia

    public ControllerPemilih_Menu() {

        view.ListenerVoting(this);
        view.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(view.getPilihPemilih()))
        {
            char pilihan = view.getPilihan();
            if ( pilihan == '1')
            {
                kandidat.get(0).setHasilSuara();
                Kandidat k = kandidat.get(0);
                kandidat.get(0).updatejumlahSuara(k);
            }
            else if (pilihan == '2')
            {
                kandidat.get(1).setHasilSuara();
                Kandidat k = kandidat.get(1);
                kandidat.get(1).updatejumlahSuara(k);
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
    }

}
