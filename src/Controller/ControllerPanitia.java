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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esber
 */
public class ControllerPanitia extends MouseAdapter implements ActionListener {
    private View.GuiMenuPanitia guiPanitia;
    private Panitia modelPanitia;
    private List<Panitia> panitia = new ArrayList();
    private List<Pemilih> pemilih = new ArrayList();
    private List<Kandidat> kandidat = new ArrayList();
    private DefaultTableModel tabK = (DefaultTableModel)guiPanitia.getTabelKandidat().getModel();
    private DefaultTableModel tabP = (DefaultTableModel)guiPanitia.getTabelPemilih().getModel();
    
    //gabisa jalan
    public ControllerPanitia() {
        
        guiPanitia.TabAdapter(this);
        guiPanitia.TabListener(this);
        guiPanitia.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(guiPanitia.getAddKandidat_btn()))
        {
            String ketua = guiPanitia.getTf_KandidatKetua();
            String wakil = guiPanitia.getTf_KandidatWakil();
            String numb = guiPanitia.getTf_KandidatNomor();
            Kandidat k = new Kandidat(ketua, wakil, numb);
            kandidat.add(k);
            tabK.addRow(new Object[]{numb,ketua,wakil});
            guiPanitia.resetKandidat();
            
        }
        else if (src.equals(guiPanitia.getDelKandidat_btn()))
        {
            int idx = guiPanitia.row_Kandidat();
            kandidat.remove(idx);
            tabK.removeRow(idx);
        }
        else if(src.equals(guiPanitia.getAddPemilih_btn()))
        {
            String nama = guiPanitia.getTf_NamaPemilih();
            String no = guiPanitia.getTf_KTPPemilih();
            String ttl = guiPanitia.getTf_TTLPemilih();
            String alamat = guiPanitia.getTf_AlamatPemilih();
            Pemilih p = new Pemilih(nama, no, ttl, alamat);
            pemilih.add(p);
            tabP.addRow(new Object[]{nama,no,ttl,alamat});
            guiPanitia.resetPemiilih();
        }
        else if (src.equals(guiPanitia.getDelPemilih_btn()))
        {
            int idx = guiPanitia.row_Pemilih();
            pemilih.remove(idx);
            tabP.removeRow(idx);
            
        }
        
    }

    public List<Pemilih> getPemilih() {
        return pemilih;
    }
    
    
}
