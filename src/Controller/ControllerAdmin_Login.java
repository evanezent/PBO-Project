/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import Model.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author esber
 */
public class ControllerAdmin_Login extends MouseAdapter implements ActionListener {
    View.Admin_Login gui = new View.Admin_Login();;
    Model.Admin admin = new Model.Admin();

    public ControllerAdmin_Login() {

        gui.listenerLoginAdmin(this);
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(gui.getBtnLoginAdmin()))
        {
            String user = gui.getTf_uAdmin();
            String pass = gui.getTf_pAdmin();
            if (user.equals(admin.getUsername_admin()) && pass.equals(admin.getPassword_admin()))
            {
                new ControllerAdmin_Menu();
                gui.dispose();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Wrong Username / Password");
            }
        }
        else if(src.equals(gui.getL_asPanitia())){
            new ControllerPanitia_Login();
            gui.dispose();
        }
        else if (src.equals(gui.getL_asPemilih()))
        {
            new ControllerPemilih_Login();
            gui.dispose();
        }
    }  
}
