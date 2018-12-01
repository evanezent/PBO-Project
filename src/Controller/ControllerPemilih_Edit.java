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
public class ControllerPemilih_Edit extends MouseAdapter implements ActionListener {

    private Pemilih pemilih;
    private Database db = new Database();
    private Pemilih_Edit gui = new Pemilih_Edit();

    public ControllerPemilih_Edit(Pemilih p) {
        this.pemilih = p;
        gui.Listener(this);
        gui.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src.equals(gui.getDoneBtn()))
        {
            String nama = gui.getTfNama();
            String ktp = gui.getTfNIK();
            Pemilih q = new Pemilih(nama, ktp);
            db.updatePemilih(q,pemilih.getNoKtp());
            gui.dispose();
        }
        else
        {
            gui.dispose();
        }
    }
    
}
