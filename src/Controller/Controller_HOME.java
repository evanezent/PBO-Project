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
/**
 *
 * @author esber
 */
public class Controller_HOME extends MouseAdapter implements ActionListener{
    
    
    private HOME gui = new HOME();

    public Controller_HOME() {
        gui.Listener(this);
        gui.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if(src.equals(gui.getAsAdmin()))
        {
            new ControllerAdmin_Login();
        }
        else if (src.equals(gui.getAsPanitia()))
        {
            new ControllerPanitia_Login();
        }
        else if (src.equals(gui.getAsPemilih()))
        {
            new ControllerPemilih_Login();
        }
        else
        {
            new ControllerPanitia_LiveCount();
        }
        gui.dispose();
    }
    
}
