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

/**
 *
 * @author esber
 */
public class ControllerPanitia extends MouseAdapter implements ActionListener {
    private View.GuiMenuPanitia guiPanitia;
    private Model.Panitia modelPanitia;
    private List<Model.Panitia> panitia;
    private List<Model.Pemilih> pemilih = new ArrayList();

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Pemilih> getPemilih() {
        return pemilih;
    }
    
    
}
