/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class BantuSesamaUser extends javax.swing.JFrame {

    /**
     * Creates new form Bantuan
     */
    public BantuSesamaUser() {
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

        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfTanggalPengiriman = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfKeteranganBantuan = new javax.swing.JTextArea();
        Submit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBantuan = new javax.swing.JTable();
        tfJenisBantuan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfNamaPengirim = new javax.swing.JTextField();
        tfLokasiPengirim = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnHelpPengguna = new javax.swing.JButton();
        btnAboutUs = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPetunjukPenggunaan = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        Username = new javax.swing.JLabel();
        btnLaporkan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(95, 126, 193));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Salurkan Bantuan Anda");

        tfTanggalPengiriman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfTanggalPengiriman.setText("Tanggal Pengiriman");
        tfTanggalPengiriman.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTanggalPengirimanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTanggalPengirimanFocusLost(evt);
            }
        });
        tfTanggalPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalPengirimanActionPerformed(evt);
            }
        });

        tfKeteranganBantuan.setColumns(20);
        tfKeteranganBantuan.setRows(5);
        tfKeteranganBantuan.setText("TAMBAHKAN KETERANGAN DISINI.....");
        tfKeteranganBantuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfKeteranganBantuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfKeteranganBantuanFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tfKeteranganBantuan);

        Submit.setBackground(new java.awt.Color(38, 57, 98));
        Submit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit");

        tbBantuan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbBantuan);

        tfJenisBantuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfJenisBantuan.setText("Jenis Bantuan");
        tfJenisBantuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfJenisBantuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfJenisBantuanFocusLost(evt);
            }
        });
        tfJenisBantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJenisBantuanActionPerformed(evt);
            }
        });

        jLabel1.setText("Donasikan Bantuan anda melalui admin dan konfirmasi ke halaman ini");

        tfNamaPengirim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNamaPengirim.setText("Nama Pengirim");
        tfNamaPengirim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNamaPengirimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNamaPengirimFocusLost(evt);
            }
        });
        tfNamaPengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaPengirimActionPerformed(evt);
            }
        });

        tfLokasiPengirim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfLokasiPengirim.setText("Lokasi Pengirim");
        tfLokasiPengirim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLokasiPengirimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLokasiPengirimFocusLost(evt);
            }
        });
        tfLokasiPengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLokasiPengirimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(tfTanggalPengiriman, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfNamaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tfLokasiPengirim)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfJenisBantuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Submit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNamaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLokasiPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(tfJenisBantuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTanggalPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(38, 57, 98));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\newTubes\\TubesPBO\\Penanggulangan Bencana\\src\\Image\\logonext.png")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(231, 130, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 130, 0));
        jLabel5.setText("BADAN NASIONAL");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(231, 130, 0));
        jLabel9.setText("PENANGGULANGAN BENCANA ALAM");

        btnHelpPengguna.setBackground(new java.awt.Color(95, 126, 193));
        btnHelpPengguna.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHelpPengguna.setForeground(new java.awt.Color(255, 255, 255));
        btnHelpPengguna.setText("Help");
        btnHelpPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpPenggunaActionPerformed(evt);
            }
        });

        btnAboutUs.setBackground(new java.awt.Color(95, 126, 193));
        btnAboutUs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        btnAboutUs.setText("About Us");
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(7, 87, 91));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bantu Sesama");

        Username1.setBackground(new java.awt.Color(38, 57, 98));
        Username1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Username1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\newTubes\\TubesPBO\\Penanggulangan Bencana\\src\\Image\\fotouser.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selamat Datang,");

        btnPetunjukPenggunaan.setBackground(new java.awt.Color(95, 126, 193));
        btnPetunjukPenggunaan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPetunjukPenggunaan.setForeground(new java.awt.Color(255, 255, 255));
        btnPetunjukPenggunaan.setText("Petunjuk Penggunaan");
        btnPetunjukPenggunaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetunjukPenggunaanActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(95, 126, 193));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(95, 126, 193));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        Username.setBackground(new java.awt.Color(7, 87, 91));
        Username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("asd");

        btnLaporkan.setBackground(new java.awt.Color(95, 126, 193));
        btnLaporkan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLaporkan.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporkan.setText("Laporkan");
        btnLaporkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnHelpPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPetunjukPenggunaan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLaporkan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaporkan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPetunjukPenggunaan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHelpPengguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAboutUs)
                .addGap(52, 52, 52)
                .addComponent(btnLogOut)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(59, 89, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaporkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporkanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaporkanActionPerformed

    private void tfKeteranganBantuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKeteranganBantuanFocusLost
        // TODO add your handling code here:
        if(tfKeteranganBantuan.getText().equals("")){
            tfKeteranganBantuan.setText("TAMBAHKAN KETERANGAN DISINI.....");
        }
    }//GEN-LAST:event_tfKeteranganBantuanFocusLost

    private void tfKeteranganBantuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKeteranganBantuanFocusGained
        // TODO add your handling code here:
        if(tfKeteranganBantuan.getText().equals("TAMBAHKAN KETERANGAN DISINI.....")){
            tfKeteranganBantuan.setText("");
        }
    }//GEN-LAST:event_tfKeteranganBantuanFocusGained

    private void tfTanggalPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalPengirimanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTanggalPengirimanActionPerformed

    private void tfTanggalPengirimanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTanggalPengirimanFocusLost
        // TODO add your handling code here:
        if(tfTanggalPengiriman.getText().equals("")){
            tfTanggalPengiriman.setText("Tanggal Pengiriman");
        }
    }//GEN-LAST:event_tfTanggalPengirimanFocusLost

    private void tfTanggalPengirimanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTanggalPengirimanFocusGained
        // TODO add your handling code here:
        if(tfTanggalPengiriman.getText().equals("Tanggal Pengiriman")){
            tfTanggalPengiriman.setText("");
        }
    }//GEN-LAST:event_tfTanggalPengirimanFocusGained

    private void tfJenisBantuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJenisBantuanFocusGained
        // TODO add your handling code here:
                if(tfJenisBantuan.getText().equals("Jenis Bantuan")){
            tfJenisBantuan.setText("");
        }
    }//GEN-LAST:event_tfJenisBantuanFocusGained

    private void tfJenisBantuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJenisBantuanFocusLost
        // TODO add your handling code here:
                        if(tfJenisBantuan.getText().equals("")){
            tfJenisBantuan.setText("Jenis Bantuan");
        }
    }//GEN-LAST:event_tfJenisBantuanFocusLost

    private void tfJenisBantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJenisBantuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJenisBantuanActionPerformed

    private void btnHelpPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelpPenggunaActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void btnPetunjukPenggunaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetunjukPenggunaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPetunjukPenggunaanActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void tfNamaPengirimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNamaPengirimFocusGained
        // TODO add your handling code here:
    if(tfNamaPengirim.getText().equals("Nama Pengirim")){
         tfNamaPengirim.setText("");
       }        
    }//GEN-LAST:event_tfNamaPengirimFocusGained

    private void tfNamaPengirimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNamaPengirimFocusLost
        // TODO add your handling code here:
        if(tfNamaPengirim.getText().equals("")){
         tfNamaPengirim.setText("Nama Pengirim");
       }       
    }//GEN-LAST:event_tfNamaPengirimFocusLost

    private void tfNamaPengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaPengirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaPengirimActionPerformed

    private void tfLokasiPengirimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLokasiPengirimFocusGained
        // TODO add your handling code here:
    if(tfLokasiPengirim.getText().equals("Lokasi Pengirim")){
         tfLokasiPengirim.setText("");
       } 
    }//GEN-LAST:event_tfLokasiPengirimFocusGained

    private void tfLokasiPengirimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLokasiPengirimFocusLost
        // TODO add your handling code here:
                if(tfLokasiPengirim.getText().equals("")){
         tfLokasiPengirim.setText("Lokasi Pengirim");
       } 
    }//GEN-LAST:event_tfLokasiPengirimFocusLost

    private void tfLokasiPengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLokasiPengirimActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfLokasiPengirimActionPerformed
    public void settfNamaPengirim(String tfNamaPengirim) {
        this.tfNamaPengirim.setText(tfNamaPengirim);
    }

    public String gettfLokasiPengirim() {
        return tfLokasiPengirim.getText();
    }
    public void settfLokasiPengirim(String tfLokasiPengirim) {
        this.tfLokasiPengirim.setText(tfLokasiPengirim);
    }

    public String gettfNamaPengirim() {
        return tfNamaPengirim.getText();
    }    
    public void setTfJenisBantuan(String tfJenisBantuan) {
        this.tfJenisBantuan.setText(tfJenisBantuan);
    }

    public String getTfJenisBantuan() {
        return tfJenisBantuan.getText();
    }
    
    public void setTfTanggalPengiriman(String tfTanggalPengiriman) {
        this.tfTanggalPengiriman.setText(tfTanggalPengiriman);
    }

    public String getTfTanggalPengiriman() {
        return tfTanggalPengiriman.getText();
    }    
    
    public void setTfKeteranganBantuan(String tfKeteranganBantuan) {
        this.tfKeteranganBantuan.setText(tfKeteranganBantuan);
    }

    public String getTfKeteranganBantuan() {
        return tfKeteranganBantuan.getText();
    }    
    
    
    public JButton getbtnLaporkan() {
        return btnLaporkan;
    }
    public JButton getbtnHome() {
        return btnHome;
    }

    public JButton getbtnSubmit(){
        return Submit;
    }  
            public JButton getbtnPetunjukPenggunaan(){
        return btnPetunjukPenggunaan;
        }
        public JButton getbtnHelpPengguna(){
        return btnHelpPengguna;
        }
                public JButton getbtnAboutUs(){
        return btnAboutUs;
        }
    public void setUsername(String Username) {
        this.Username.setText(Username);
    }
        public JButton getbtnLogOut() {
        return btnLogOut;
    } 
    public void addActionListener(ActionListener x){
        btnHome.addActionListener(x);
        btnLaporkan.addActionListener(x);
        Submit.addActionListener(x);
              btnPetunjukPenggunaan.addActionListener(x);
        btnHelpPengguna.addActionListener(x);
        btnAboutUs.addActionListener(x);
        btnLogOut.addActionListener(x);
    }
    public JTable getTbBantuan() {
        return tbBantuan;
    }
    
    public int getSelecctedTbBantuan(){
        return tbBantuan.getSelectedRow();
    }
    
    public void setTbBantuan(DefaultTableModel x){
        tbBantuan.setModel(x);
    }
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BantuSesamaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BantuSesamaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BantuSesamaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BantuSesamaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BantuSesamaUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Username1;
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnHelpPengguna;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLaporkan;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPetunjukPenggunaan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbBantuan;
    private javax.swing.JTextField tfJenisBantuan;
    private javax.swing.JTextArea tfKeteranganBantuan;
    private javax.swing.JTextField tfLokasiPengirim;
    private javax.swing.JTextField tfNamaPengirim;
    private javax.swing.JTextField tfTanggalPengiriman;
    // End of variables declaration//GEN-END:variables
}
