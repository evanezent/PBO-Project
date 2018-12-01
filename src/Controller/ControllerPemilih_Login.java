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
public class ControllerPemilih_Login extends MouseAdapter implements ActionListener {
       
    private View.Pemilih_Login gui = new View.Pemilih_Login();
    private Panitia panitia;

    public ControllerPemilih_Login() {
        gui.ListenerLogPemilih(this);
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src.equals(gui.getL_Pemilih()))
        {
            String nik = gui.getTfNIK();
            int i =0;
            if (!panitia.getPemilih().isEmpty()){
                while (i<panitia.getPemilih().size() && (!nik.equals(panitia.getPemilih().get(i).getNoKtp())))
                {
                    i++;
                }
                if (nik.equals(panitia.getPemilih().get(i).getNoKtp()))
                {
                    new ControllerPemilih_Menu();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "USER TIDAK ADA");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "USER KOSONG");
            }
        }
        else if (src.equals(gui.getL_Admin()))
        {
            new ControllerAdmin_Login();
            gui.dispose();
        }
        else if (src.equals(gui.getL_Panitia()))
        {
            new ControllerPanitia_Login();
            gui.dispose();
        }
    }
}
