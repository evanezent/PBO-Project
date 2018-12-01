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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esber
 */
public class ControllerPanitia_Menu extends MouseAdapter implements ActionListener {
    private Panitia_Menu guiPanitia;
    private ArrayList<Pemilih> pemilih = new ArrayList();
    private ArrayList<Kandidat> kandidat = new ArrayList();
    private Database db;
    //gabisa jalan
    public ControllerPanitia_Menu() {
        db = new Database();
        guiPanitia = new Panitia_Menu();
        guiPanitia.TabAdapter(this);
        guiPanitia.TabListener(this);
        guiPanitia.setVisible(true);
        loadTablePemilih();
        loadTableKandidat();
    }
    
    
    
//    public void removeKandidat(DefaultTableModel tabK,int indeks)
//    {
//        tabK.removeRow(indeks);
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
   
        
        if(src.equals(guiPanitia.getAddPemilih_btn()))
        {
            String nama = guiPanitia.getTf_NamaPemilih();
            String no = guiPanitia.getTf_KTPPemilih();
            String ttl = guiPanitia.getTf_TTLPemilih();
            String alamat = guiPanitia.getTf_AlamatPemilih();
            Pemilih p = new Pemilih(nama, no, ttl, alamat);
            guiPanitia.resetPemiilih();
            db.insertPemilih(p);
            loadTablePemilih();

        }
        else if (src.equals(guiPanitia.getAddKandidat_btn()))
        {
            String no = guiPanitia.getTf_KandidatNomor();
            String ketua = guiPanitia.getTf_KandidatKetua();
            String wakil = guiPanitia.getTf_KandidatWakil();
            Kandidat k = new Kandidat(no, ketua, wakil);
            guiPanitia.resetKandidat();
            db.insertKandidat(k);
            loadTableKandidat();
        }
        else if (src.equals(guiPanitia.getDelPemilih_btn()))
        {
            int idx = guiPanitia.getSelectedPemilih();
            Pemilih p = pemilih.get(idx);
            db.delPemilih(p);
            guiPanitia.resetPemiilih();
   
        }
        else if (src.equals(guiPanitia.getDelKandidat_btn()))
        {
            int idx = guiPanitia.getSelectedKandidat();
            Kandidat k = kandidat.get(idx);
            db.delKandidat(k);
            guiPanitia.resetKandidat();
        }
        else if (src.equals(guiPanitia.getEditPemilih_btn()))
        {
            
        }
    }
    
    
    public void loadTablePemilih()
    {
        DefaultTableModel tabPemilih = new DefaultTableModel(new String[]{"Nama","No. KTP","Tanggal Lahir","Alamat"},0);
        pemilih = db.getDataPemilih();
        for (Pemilih p : pemilih)
        {
            tabPemilih.addRow(new Object[]{p.getNama_pemilih(),p.getNoKtp(),p.getTanggal_lahir(),p.getAlamat()});
        }
        guiPanitia.setPemilih(tabPemilih);
    }
    
    public void loadTableKandidat()
    {
        DefaultTableModel tabKandidat = new DefaultTableModel(new String[]{"Nomor Urut","Nama Ketua","Nama Wakil"},0);
        kandidat = db.getDataKandidat();
        for (Kandidat k : kandidat)
        {
            tabKandidat.addRow(new Object[]{k.getNoUrut(),k.getNamaKetua(),k.getNamaWakil()});
        }
        guiPanitia.setKandidat(tabKandidat);
    }
}
