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
public class ControllerEditPanitia extends MouseAdapter implements ActionListener {
    
    private Panitia panitia;
    private Panitia_Edit gui;
    private int idx;

    public ControllerEditPanitia(Panitia p) {
        
        this.panitia = p;
        gui = new Panitia_Edit();
        gui.AdapterEditPanitia(this);
        gui.ListenerEditPanitia(this);
        gui.setVisible(true);
    }
    
        //Get List Panitia
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
//        if (src.equals(gui.getBtnDone()))
//        {
//            String nama = gui.getTxNama();
//            String user = gui.getTxUser();
//            String pass = gui.getTxPass();
//            Panitia update = new Panitia(user,nama,pass);
//            panitia.updatePanitia(update, panitia);
//            gui.dispose();
//        }
//        else
//        {
//            gui.dispose();
//        }
    }

    //simpen ke ArrayList<Panitita>
    
    //get ArrayList<Panitia>//

    public Panitia getPanitia() {
        return panitia;
    }
}
