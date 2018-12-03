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
public class ControllerKandidat_Edit extends MouseAdapter implements ActionListener {

    private Kandidat kandidat;
    private Database db = new Database();
    private Kandidat_Edit gui = new Kandidat_Edit();

    public ControllerKandidat_Edit(Kandidat kandidat) {
        this.kandidat = kandidat;
        gui.Listener(this);
        gui.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(gui.getBtnDone()))
        {
            String ktp = gui.getNo();
            String ketua = gui.getKetua();
            String wakil = gui.getWakil();
            Kandidat k = new Kandidat(ktp, ketua, wakil);
            db.updateKandidat(k, kandidat.getNoUrut());
            gui.dispose();
        }
        else
        {
            gui.dispose();
        }
        new ControllerPanitia_Menu();
    }
    
}
