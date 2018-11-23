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
public class ControllerAdmin extends MouseAdapter implements ActionListener {
    private View.GuiAdmin guiAdmin;
    private Model.Admin modelAdmin;
    private List<Model.Panitia> panitia;

    public ControllerAdmin() {
        guiAdmin = new View.GuiAdmin();
        modelAdmin = new Model.Admin();
        panitia = new ArrayList();
        guiAdmin.AdminAdapter(this);
        guiAdmin.AdminListener(this);
        guiAdmin.setVisible(true);
    }
    
    //Get List Panitia
    public String[] getDataPanitia()
    {
        String[] data = new String[panitia.size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = panitia.get(i).getNama_panitia();
        }
        return data;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src.equals(guiAdmin.getAddPanitia()))
        {
            String nama = guiAdmin.getTFNama();
            String user = guiAdmin.getTFUser();
            String pw = guiAdmin.getTFPw();
            Panitia p= new Panitia(nama, user, pw);
            panitia.add(p);
            guiAdmin.ResetShowAdmin();
            guiAdmin.setListPanitia(getDataPanitia());
        }
        else if (src.equals(guiAdmin.getDeletePanitia()))
        {
            int idx = guiAdmin.getSelectedPanitia();
            Panitia p = panitia.get(idx);
            panitia.remove(idx);
            guiAdmin.ResetShowAdmin();
            guiAdmin.setListPanitia(getDataPanitia());
            
        }
        else if (src.equals(guiAdmin.getEditPanitia()))
        {
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object o = e.getSource();
        if (o.equals(guiAdmin.getListPanitia()))
        {
            int idx = guiAdmin.getSelectedPanitia();
            Panitia p = panitia.get(idx);
            guiAdmin.setTextPanitia(p.tampilPanitia());
        }
    }
    
    
}
