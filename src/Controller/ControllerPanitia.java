/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import View.*;
import com.sun.org.apache.xml.internal.security.Init;
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
    private View.GuiMenuPanitia guiPanitia;
    private Panitia modelPanitia;
    //private List<Panitia> panitia;
    private Pemilih pemilih;
//    private List<Kandidat> kandidat;
    //gabisa jalan
    public ControllerPanitia() {
        
        //guiPanitia.TabAdapter(this);
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
        
        if (src.equals(guiPanitia.getAddPemilih_btn()))
        {
            try {
                loadPemilih();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerPanitia.class.getName()).log(Level.SEVERE, null, ex);

            }      
        }
//        else if (src.equals(guiPanitia.getDelKandidat_btn()))
//        {
//            int idx = guiPanitia.row_Kandidat();
//            removeKandidat(tabK, idx);
//        }
//        else if(src.equals(guiPanitia.getAddKandidat_btn()))
//        {
//            String nama = guiPanitia.getTf_NamaPemilih();
//            String no = guiPanitia.getTf_KTPPemilih();
//            String ttl = guiPanitia.getTf_TTLPemilih();
//            String alamat = guiPanitia.getTf_AlamatPemilih();
//            Pemilih p = new Pemilih(nama, no, ttl, alamat);
//            pemilih.add(p);
//            guiPanitia.resetPemiilih();
//            
//        }
//        else if (src.equals(guiPanitia.getDelPemilih_btn()))
//        {
//            int idx = guiPanitia.row_Pemilih();
//            pemilih.remove(idx);
//            tabP.removeRow(idx);
//            
//        }
        
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
