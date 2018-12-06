
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import View.*;
import Database.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerAdmin_Menu extends MouseAdapter implements ActionListener {
    
    
    private Admin_Menu guiAdmin = new Admin_Menu();
    private Admin modelAdmin = new Admin();
    private Panitia panitia = new Panitia("", "", "");
    private Database db = new Database();

    //Coment
    public ControllerAdmin_Menu() {

        try {
            guiAdmin.AdminAdapter(this);
            guiAdmin.AdminListener(this);
            guiAdmin.setVisible(true);
            guiAdmin.ResetShowAdmin();
            guiAdmin.setListPanitia(getDataPanitia());
        } catch (SQLException ex) {
            Logger.getLogger(ControllerAdmin_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Get List Panitia
    public String[] getDataPanitia() throws SQLException
    {
        String[] data = new String[panitia.getAllPanitia().size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = panitia.getAllPanitia().get(i).getNama_panitia();
        }
        return data;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src.equals(guiAdmin.getAddPanitia()))
        {
            
            try {
                String nama = guiAdmin.getTFNama();
                String user = guiAdmin.getTFUser();
                String pass = guiAdmin.getTFPw();
                Panitia p = new Panitia(nama, user, pass);
                panitia.insertPanitia(p);
                guiAdmin.ResetShowAdmin();
                guiAdmin.setListPanitia(getDataPanitia());
            } catch (SQLException ex) {
                Logger.getLogger(ControllerAdmin_Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (src.equals(guiAdmin.getDeletePanitia())) 
        {
            try {
                int idx = guiAdmin.getSelectedPanitia();
                Panitia p = panitia.getAllPanitia().get(idx);
                panitia.getAllPanitia().get(idx).deletePanitia(p);
                guiAdmin.dispose();
                new ControllerAdmin_Menu();
            }catch (SQLException ex) {
                Logger.getLogger(ControllerAdmin_Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (src.equals(guiAdmin.getEditPanitia()))
        {   
            try {
                int idx = guiAdmin.getSelectedPanitia();
                Panitia p = panitia.getAllPanitia().get(idx);
                ControllerPanitia_Edit CEP = new ControllerPanitia_Edit(p);
                guiAdmin.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerAdmin_Menu.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
            
        
        else if (src.equals(guiAdmin.getBtnHome()))
        {
            new Controller_HOME();
            guiAdmin.dispose();
        }
        
    }
    
    
    @Override
    public void mousePressed(MouseEvent e) {
        Object o = e.getSource();
        if (o.equals(guiAdmin.getListPanitia()))
        {
            try {
                int idx = guiAdmin.getSelectedPanitia();
                Panitia p = panitia.getAllPanitia().get(idx);
                guiAdmin.setTextPanitia(p.tampilPanitia());
            } catch (SQLException ex) {
                Logger.getLogger(ControllerAdmin_Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    
}
