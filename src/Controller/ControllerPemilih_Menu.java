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
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerPemilih_Menu extends MouseAdapter implements ActionListener {

    private Pemilih_Menu view = new Pemilih_Menu();
    private Database db = new Database();
    private List<Kandidat> kandidat; // List sambungan isi dari Panitia
    char pilihan;
    

    public ControllerPemilih_Menu() {

        kandidat = db.getDataKandidat();
        view.ListenerVoting(this);
        view.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(view.getPilihPemilih()))
        {
            pilihan = view.getPilihan();
            if ( pilihan == '1')
            {
                kandidat.get(0).setHasilSuara(1);
                Kandidat k = kandidat.get(0);
                db.updatejumlahSuara(k);
                
            }
            else if (pilihan == '2')
            {
                kandidat.get(1).setHasilSuara(1);
                Kandidat k = kandidat.get(1);
                db.updatejumlahSuara(k);
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            new ControllerPanitia_LiveCount();
        }
    }

}
