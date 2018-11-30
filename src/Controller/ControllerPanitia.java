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
    //private List<Panitia> panitia;
    private List<Pemilih> pemilih;
    private List<Kandidat> kandidat;
    private DefaultTableModel tabK;
    private DefaultTableModel tabP;
    //gabisa jalan
    public ControllerPanitia() {
        
        kandidat = new ArrayList();
        pemilih = new ArrayList();
        tabK = new DefaultTableModel(new String[]{"ketua","wakil","noUrut"},0);
        tabP = new DefaultTableModel(new String[] {"nama","noKtp","ttl","alamat"},0);
        guiPanitia.TabAdapter(this);
        guiPanitia.TabListener(this);
        guiPanitia.setVisible(true);
    }
    
    
    public void setDataKandidat(List<Kandidat> data)
    {
        for (Kandidat k : data)
        {
            tabK.addRow(new Object[]{k.getNama_ketua(),k.getNama_wakil(),k.getNo_urut()});
        }
        //guiPanitia.setVisible(true);
    }
    
    public void setDataPemilih(List<Pemilih> data)
    {
        
        for (Pemilih p : data )
        {
            tabP.addRow(new Object[]{p.getNama_pemilih(),p.getNoKtp(),p.getTanggal_lahir(),p.getAlamat()});
        }
        //guiPanitia.setVisible(true);
    }
    
    public void removeKandidat(DefaultTableModel tabK,int indeks)
    {
        tabK.removeRow(indeks);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(guiPanitia.getAddKandidat_btn()))
        {
            DefaultTableModel tabK = null;
            String ketua = guiPanitia.getTf_KandidatKetua();
            String wakil = guiPanitia.getTf_KandidatWakil();
            String numb = guiPanitia.getTf_KandidatNomor();
            Kandidat k = new Kandidat(ketua, wakil, numb);
            kandidat.add(k);
            guiPanitia.resetKandidat();
            setDataKandidat(kandidat);
            
            
        }
        else if (src.equals(guiPanitia.getDelKandidat_btn()))
        {
            int idx = guiPanitia.row_Kandidat();
            removeKandidat(tabK, idx);
        }
        else if(src.equals(guiPanitia.getAddPemilih_btn()))
        {
            String nama = guiPanitia.getTf_NamaPemilih();
            String no = guiPanitia.getTf_KTPPemilih();
            String ttl = guiPanitia.getTf_TTLPemilih();
            String alamat = guiPanitia.getTf_AlamatPemilih();
            Pemilih p = new Pemilih(nama, no, ttl, alamat);
            pemilih.add(p);
            guiPanitia.resetPemiilih();
            setDataPemilih(pemilih);
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
