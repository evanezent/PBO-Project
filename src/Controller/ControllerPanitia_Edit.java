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
public class ControllerPanitia_Edit extends MouseAdapter implements ActionListener {
    
    private Panitia panitia;
    private View.Panitia_Edit gui;
    private int idx;
    private Database db = new Database();

    public ControllerPanitia_Edit(Panitia p) {
        
        gui = new View.Panitia_Edit();
        panitia = p;
        gui.AdapterEditPanitia(this);
        gui.ListenerEditPanitia(this);
        gui.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(gui.getBtnDone()))
        {
            String nama = gui.getTxNama();
            String user = gui.getTxUser();
            String pass = gui.getTxPass();
            Panitia update = new Panitia(nama,user,pass);
            db.updatePanitia(update, panitia);
            gui.dispose();
            new ControllerAdmin_Menu();
        }
        else
        {
            gui.dispose();
        }
    }

    //simpen ke ArrayList<Panitia>
    //get ArrayList<Panitia>//
    public Panitia getPanitia() {
        return panitia;
    }
}
