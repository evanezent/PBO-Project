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
public class ControllerLoginPemilih extends MouseAdapter implements ActionListener {
       
    private View.LoginPemilih gui = new View.LoginPemilih();;
    private ControllerPanitia CP = new ControllerPanitia();;

    public ControllerLoginPemilih() {
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
            if (CP.getPemilih().size() != 0){
                while (i<CP.getPemilih().size() && (!nik.equals(CP.getPemilih().get(i).getNoKtp())))
                {
                    i++;
                }
                if (nik.equals(CP.getPemilih().get(i).getNoKtp()))
                {
                    new ControllerPemilih();
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
            new ControllerLoginAdmin();
            gui.dispose();
        }
        else if (src.equals(gui.getL_Panitia()))
        {
            new ControllerLoginPanitia();
            gui.dispose();
        }
    }
    
    
}
