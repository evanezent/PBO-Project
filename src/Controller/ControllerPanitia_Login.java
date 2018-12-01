/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import Model.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerPanitia_Login extends MouseAdapter implements ActionListener {

    private Panitia_Login gui = new View.Panitia_Login();
    private ControllerAdmin_Menu admin; 
    private Panitia panitia;

    public ControllerPanitia_Login() {
        gui.ListenerLogPanitia(this);
        gui.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(gui.getLoginPanitia()))
        {
            try {
                String user = gui.getuPanitia();
                String pass = gui.getpPanitia();
                int i =0;
                while ((i<panitia.getAllPanitia().size()) && (!user.equals(panitia.getAllPanitia().get(i).getUser_panitia()) || !pass.equals(panitia.getAllPanitia().get(i).getUser_panitia())))
                {
                    i++;
                }
                if (user.equals(panitia.getAllPanitia().get(i).getUser_panitia()) || pass.equals(panitia.getAllPanitia().get(i).getUser_panitia()))
                {
                    new ControllerPanitia_Menu();
                    gui.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "USER TIDAK ADA");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControllerPanitia_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (src.equals(gui.getLAdmin()))
        {
            new ControllerAdmin_Login();
            gui.dispose();
        }
        else if (src.equals(gui.getLPemilih()))
        {
            new ControllerPemilih_Login();
            gui.setVisible(false);
        }
    }
    
}
