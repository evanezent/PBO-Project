/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author esber
 */
public class Panitia_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Panitia_Menu
     */
    public Panitia_Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_NamaPemilih = new javax.swing.JTextField();
        tf_TTLPemilih = new javax.swing.JTextField();
        tf_KTPPemilih = new javax.swing.JTextField();
        tf_AlamatPemilih = new javax.swing.JTextField();
        AddPemilih_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPemilih = new javax.swing.JTable();
        EditPemilih_btn = new javax.swing.JButton();
        DelPemilih_btn = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_KandidatKetua = new javax.swing.JTextField();
        tf_KandidatWakil = new javax.swing.JTextField();
        tf_KandidatNomor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelKandidat = new javax.swing.JTable();
        EditKandidat_btn = new javax.swing.JButton();
        AddKandidat_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tab.setBackground(new java.awt.Color(254, 254, 254));
        Tab.setForeground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(98, 10, 10));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("PEMILIH");

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Nama Pemilih");

        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Nomor KTP");

        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Tanggal Lahir");

        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Alamat");

        tf_AlamatPemilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AlamatPemilihActionPerformed(evt);
            }
        });

        AddPemilih_btn.setBackground(new java.awt.Color(1, 1, 1));
        AddPemilih_btn.setForeground(new java.awt.Color(254, 254, 254));
        AddPemilih_btn.setText("Tambah");

        TabelPemilih.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Pemilih", "Nomor KTP", "Tanggal Lahir", "Alamat"
            }
        ));
        jScrollPane2.setViewportView(TabelPemilih);

        EditPemilih_btn.setBackground(new java.awt.Color(1, 1, 1));
        EditPemilih_btn.setForeground(new java.awt.Color(254, 254, 254));
        EditPemilih_btn.setText("Edit");

        DelPemilih_btn.setBackground(new java.awt.Color(1, 1, 1));
        DelPemilih_btn.setForeground(new java.awt.Color(254, 254, 254));
        DelPemilih_btn.setText("Hapus");

        btnHome.setForeground(new java.awt.Color(254, 254, 254));
        btnHome.setText("Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NamaPemilih)
                            .addComponent(tf_KTPPemilih)
                            .addComponent(tf_TTLPemilih)
                            .addComponent(tf_AlamatPemilih, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(DelPemilih_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditPemilih_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AddPemilih_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_NamaPemilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_KTPPemilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_TTLPemilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tf_AlamatPemilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPemilih_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditPemilih_btn)
                    .addComponent(DelPemilih_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tab.addTab("Pemilih", jPanel1);

        jPanel2.setBackground(new java.awt.Color(98, 10, 10));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("KANDIDAT");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nama Ketua");

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Nama Wakil");

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Nomor Urut");

        tf_KandidatKetua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_KandidatKetuaActionPerformed(evt);
            }
        });

        TabelKandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Urut", "Nama Ketua", "Nama Wakil"
            }
        ));
        jScrollPane1.setViewportView(TabelKandidat);

        EditKandidat_btn.setForeground(new java.awt.Color(254, 254, 254));
        EditKandidat_btn.setText("Edit");

        AddKandidat_btn.setBackground(new java.awt.Color(1, 1, 1));
        AddKandidat_btn.setForeground(new java.awt.Color(254, 254, 254));
        AddKandidat_btn.setText("Tambah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_KandidatKetua)
                                    .addComponent(tf_KandidatWakil, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(tf_KandidatNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(AddKandidat_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EditKandidat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_KandidatKetua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_KandidatWakil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tf_KandidatNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddKandidat_btn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(EditKandidat_btn)
                .addContainerGap())
        );

        Tab.addTab("Kandidat", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_KandidatKetuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_KandidatKetuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_KandidatKetuaActionPerformed

    private void tf_AlamatPemilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AlamatPemilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_AlamatPemilihActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddKandidat_btn;
    private javax.swing.JButton AddPemilih_btn;
    private javax.swing.JButton DelPemilih_btn;
    private javax.swing.JButton EditKandidat_btn;
    private javax.swing.JButton EditPemilih_btn;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JTable TabelKandidat;
    private javax.swing.JTable TabelPemilih;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tf_AlamatPemilih;
    private javax.swing.JTextField tf_KTPPemilih;
    private javax.swing.JTextField tf_KandidatKetua;
    private javax.swing.JTextField tf_KandidatNomor;
    private javax.swing.JTextField tf_KandidatWakil;
    private javax.swing.JTextField tf_NamaPemilih;
    private javax.swing.JTextField tf_TTLPemilih;
    // End of variables declaration//GEN-END:variables

    //Get Button
    
    public JButton getAddPemilih_btn() {
        return AddPemilih_btn;
    }

    public JButton getAddKandidat_btn() {
        return AddKandidat_btn;
    }  
        

    public JButton getDelPemilih_btn() {
        return DelPemilih_btn;
    }

    public JButton getEditKandidat_btn() {
        return EditKandidat_btn;
    }

    public JButton getEditPemilih_btn() {
        return EditPemilih_btn;
    }

    public JButton getBtnHome() {
        return btnHome;
    }

    //Get Text
    
    //Pemilih
    
    public String getTf_AlamatPemilih() {
        return tf_AlamatPemilih.getText();
    }

    public String getTf_KTPPemilih() {
        return tf_KTPPemilih.getText();
    }

    public String getTf_NamaPemilih() {
        return tf_NamaPemilih.getText();
    }

    public String getTf_TTLPemilih() {
        return tf_TTLPemilih.getText();
    }
    
    //Kandidat
    
    public String getTf_KandidatKetua() {
        return tf_KandidatKetua.getText();
    }

    public String getTf_KandidatNomor() {
        return tf_KandidatNomor.getText();
    }

    public String getTf_KandidatWakil() {
        return tf_KandidatWakil.getText();
    }
    
    //Adapter n Listener
    public void TabAdapter(MouseAdapter ME)
    {
        TabelPemilih.addMouseListener(ME);
        TabelKandidat.addMouseListener(ME);
    }
    
    public void TabListener(ActionListener E)
    {
        //Pemilih
        AddPemilih_btn.addActionListener(E);
        DelPemilih_btn.addActionListener(E);
        EditPemilih_btn.addActionListener(E);
        
        //Kandidat
        AddKandidat_btn.addActionListener(E);
//        DelKandi_btn.addActionListener(E);
        EditKandidat_btn.addActionListener(E);
        
        //Balik Menu
        btnHome.addActionListener(E);
    }
    
    //Reset
    public void resetKandidat()
    {
        tf_KandidatKetua.setText("");
        tf_KandidatWakil.setText("");
        tf_KandidatNomor.setText("");
    }
    public void resetPemiilih()
    {
        tf_NamaPemilih.setText("");
        tf_AlamatPemilih.setText("");
        tf_KTPPemilih.setText("");
        tf_TTLPemilih.setText("");
    }
    
    //get Tabel
    
    public JTable getTabelKandidat() {
        return TabelKandidat;
    }

    public JTable getTabelPemilih() {
        return TabelPemilih;
    }

    
    //GET TABBED PANE
    
    public JTabbedPane getTab() {
        return Tab;
    }
    
    //Set Tabel
    public void setPemilih(DefaultTableModel tabel)
    {
        TabelPemilih.setModel(tabel);
    }
    
    public void setKandidat(DefaultTableModel table)
    {
        TabelKandidat.setModel(table);
    }
    
    
    public int getSelectedPemilih()
    {
        return TabelPemilih.getSelectedRow();
    }
    public int getSelectedKandidat()
    {
        return TabelKandidat.getSelectedRow();
    }

}
