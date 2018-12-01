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
public class ControllerPanitia_Edit extends MouseAdapter implements ActionListener {
    
    private List<Model.Panitia> panitia;
    private View.Panitia_Edit gui;
    private int idx;

    public ControllerPanitia_Edit(int idx) {
        
        this.idx = idx;
        gui = new View.Panitia_Edit();
        panitia = new ArrayList();
        gui.AdapterEditPanitia(this);
        gui.ListenerEditPanitia(this);
        gui.setVisible(true);
    }
    
        //Get List Panitia
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(gui.getBtnDone()))
        {
            String nama = gui.getTxNama();
            String user = gui.getTxUser();
            String pass = gui.getTxPass();
            Panitia p = new Panitia(user,nama,pass);
            panitia.add(p);
            gui.dispose();
        }
        else
        {
            gui.dispose();
        }
    }

    //simpen ke ArrayList<Panitita>
    
    //get ArrayList<Panitia>//

    public Panitia getPanitia() {
        return panitia.get(idx);
    }
}
