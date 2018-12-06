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
import java.sql.Connection;
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

    private Panitia_Menu guiPanitia = new Panitia_Menu();
    private ArrayList<Pemilih> pemilih = new ArrayList();
    private ArrayList<Kandidat> kandidat = new ArrayList();
    private Database db = new Database();
    private int selectedIdx ;
    public ControllerPanitia_Menu() {

        guiPanitia.TabAdapter(this);
        guiPanitia.TabListener(this);
        guiPanitia.setVisible(true);
        pemilih = db.getDataPemilih();
        kandidat = db.getDataKandidat();
        loadTablePemilih();
        loadTableKandidat();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        Object source = me.getSource();
        if (source.equals(guiPanitia.getTabelPemilih())) 
        {
            selectedIdx =guiPanitia.getSelectedPemilih();
            System.out.println(selectedIdx);
        }
        else if (source.equals(guiPanitia.getTabelKandidat()))
        {
            selectedIdx = guiPanitia.getSelectedKandidat();
            System.out.println(selectedIdx);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src.equals(guiPanitia.getAddPemilih_btn())) {
            String nama = guiPanitia.getTf_NamaPemilih();
            String no = guiPanitia.getTf_KTPPemilih();
            String ttl = guiPanitia.getTf_TTLPemilih();
            String alamat = guiPanitia.getTf_AlamatPemilih();
            Pemilih p = new Pemilih(nama, no, ttl, alamat, false);
            db.insertPemilih(p);
            guiPanitia.resetPemiilih();
            loadTablePemilih();

        } 
        else if (src.equals(guiPanitia.getAddKandidat_btn())) {
            String no = guiPanitia.getTf_KandidatNomor();
            String ketua = guiPanitia.getTf_KandidatKetua();
            String wakil = guiPanitia.getTf_KandidatWakil();
            Kandidat k = new Kandidat(no, ketua, wakil);
            guiPanitia.resetKandidat();
            db.insertKandidat(k);
            guiPanitia.resetKandidat();
            loadTableKandidat();
        } 
        else if (src.equals(guiPanitia.getDelPemilih_btn())) {

            Pemilih p = pemilih.get(selectedIdx);
            System.out.println(p.getNoKtp());
            db.delPemilih(p.getNoKtp());
            guiPanitia.resetPemiilih();
           
        } 
        else if (src.equals(guiPanitia.getEditPemilih_btn())) {
            
            Pemilih p = pemilih.get(selectedIdx);
            ControllerPemilih_Edit view = new ControllerPemilih_Edit(p);
            guiPanitia.dispose();
            guiPanitia.resetPemiilih();
        }
        else if (src.equals(guiPanitia.getEditKandidat_btn()))
        {
            Kandidat k = kandidat.get(selectedIdx);
            ControllerKandidat_Edit view = new ControllerKandidat_Edit(k);
            guiPanitia.dispose();
            guiPanitia.resetKandidat();
        }
        else if (src.equals(guiPanitia.getBtnHome()))
        {
            guiPanitia.dispose();
            new Controller_HOME();
        }
        
    }

    public void loadTablePemilih() {
        DefaultTableModel tabPemilih = new DefaultTableModel(new String[]{"Nama Pemilih", "Nomor KTP", "Tanggal Lahir", "Alamat"}, 0);
        ArrayList<Pemilih> list = db.getDataPemilih();
        for (Pemilih p : list) {
            tabPemilih.addRow(new Object[]{p.getNama_pemilih(), p.getNoKtp(), p.getTanggal_lahir(), p.getAlamat()});
        }
        guiPanitia.setPemilih(tabPemilih);

    }

    public void loadTableKandidat() {
        DefaultTableModel tabKandidat = new DefaultTableModel(new String[]{"Nomor Urut", "Nama Ketua", "Nama Wakil"}, 0);
        ArrayList<Kandidat> list = db.getDataKandidat();
        for (Kandidat k : list) {
            tabKandidat.addRow(new Object[]{k.getNoUrut(), k.getNamaKetua(), k.getNamaWakil()});
        }
        guiPanitia.setKandidat(tabKandidat);
    }
}
