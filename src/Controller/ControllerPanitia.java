/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esber
 */
public class ControllerPanitia extends MouseAdapter implements ActionListener {
    private View.GuiMenuPanitia guiPanitia = new View.GuiMenuPanitia();
    private Pemilih pemilih;
    private Panitia panitia;
    //gabisa jalan
    public ControllerPanitia() {
        guiPanitia.TabAdapter(this);
        guiPanitia.TabListener(this);
        guiPanitia.setVisible(true);
    }
    
    
    
//    public void removeKandidat(DefaultTableModel tabK,int indeks)
//    {
//        tabK.removeRow(indeks);
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        try {
                loadPemilih();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerPanitia.class.getName()).log(Level.SEVERE, null, ex);
            }      
        
        if (src.equals(guiPanitia.getDelKandidat_btn()))
        {
            int idx = guiPanitia.row_Kandidat();
            //removeKandidat(tabK, idx);
        }
        else if(src.equals(guiPanitia.getAddPemilih_btn()))
        {
            String nama = guiPanitia.getTf_NamaPemilih();
            String no = guiPanitia.getTf_KTPPemilih();
            String ttl = guiPanitia.getTf_TTLPemilih();
            String alamat = guiPanitia.getTf_AlamatPemilih();
            Pemilih p = new Pemilih(nama, no, ttl, alamat);
            panitia.getPemilih().add(p);
            guiPanitia.resetPemiilih();
            
        }
        else if (src.equals(guiPanitia.getDelPemilih_btn()))
        {
            int idx = guiPanitia.row_Pemilih();
            panitia.getPemilih().remove(idx);
            //tabP.removeRow(idx);
        }else if (src.equals(guiPanitia.getEditPemilih_btn()))
        {
            
        }
    }

    public void loadPemilih() throws SQLException{
        DefaultTableModel dtp = new DefaultTableModel(new String[]{"nama_pemilih","noKtp","tanggal_lahir","alamat"},0);
        List<Pemilih> p = this.pemilih.getAllPemilih();
        for (Pemilih data : p){
            dtp.addRow(new Object[]{data.getNama_pemilih(),data.getNoKtp(),data.getTanggal_lahir(),data.getAlamat()});
        }
        this.guiPanitia.setPemilih(dtp);
    }  
}
