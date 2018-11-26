/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import Model.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerLoginPanitia extends MouseAdapter implements ActionListener {

    private View.LoginPanitia gui;
    private ControllerAdmin admin;

    public ControllerLoginPanitia() {
        gui = new View.LoginPanitia();
        admin = new ControllerAdmin();
        gui.ListenerLogPanitia(this);
        gui.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(gui.getLoginPanitia()))
        {
            String user = gui.getuPanitia();
            String pass = gui.getpPanitia();
            int i =0;
            while ((i<admin.getPanitia().size()) && (!user.equals(admin.getPanitia().get(i).getUser_panitia()) || !pass.equals(admin.getPanitia().get(i).getUser_panitia())))
            {
                i++;
            }
            if (user.equals(admin.getPanitia().get(i).getUser_panitia()) || pass.equals(admin.getPanitia().get(i).getUser_panitia()))
            {
                new ControllerPanitia();
                gui.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "USER TIDAK ADA");
            }
        }
        else if (src.equals(gui.getLAdmin()))
        {
            new ControllerLoginAdmin();
            gui.dispose();
        }
        else if (src.equals(gui.getLPemilih()))
        {
            new ControllerLoginPemilih();
            gui.setVisible(false);
        }
    }
    
}
