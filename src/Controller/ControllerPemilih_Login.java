/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import View.*;
import Model.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author esber
 */
public class ControllerPemilih_Login extends MouseAdapter implements ActionListener {
       
    private View.Pemilih_Login gui = new View.Pemilih_Login();
    private Database db = new Database();

    public ControllerPemilih_Login() {
        gui.ListenerLogPemilih(this);
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(gui.getL_Pemilih()))
        {
            String ktp = gui.getTfNIK();
            if (db.LoginPemilih(ktp))
            {
                db.updateStatus(ktp);
                new ControllerPemilih_Menu();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "USER TIDAK ADA");
            }
        }
        else if (src.equals(gui.getL_Panitia()))
        {
            new ControllerPanitia_Login();
            gui.dispose();
        }
        else if (src.equals(gui.getL_Admin()))
        {
            new ControllerAdmin_Login();
            gui.dispose();
        }
    }
}
