/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ACER
 */
public class Controller_AdminLapor implements ActionListener {
    
    private AdminLapor admlapor;
    private String username;
    private Koneksi kn;
    private String id_peristiwa;
    private String jenis_bencana;
    private String jam;
    private String lokasi;
    private String keterangan_peristiwa;
    private String status_peristiwa;
    
    public Controller_AdminLapor(String username){
        admlapor = new AdminLapor();
        admlapor.addActionListener(this);
        admlapor.setVisible(true);
        kn = new Koneksi();        
        this.username = username;
        admlapor.setUsername(username); 
        loadTablePeristiwa();
        
    }
    
    public void loadTablePeristiwa(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID Peristiwa","Jenis Bencana", "Jam", "Lokasi", "Keterangan", "Status"}, 0);
        ArrayList<Peristiwa> peristiwa = kn.getPeristiwa();
        for (Peristiwa p : peristiwa) {
            model.addRow(new Object[]{p.getId_peristiwa(),p.getJenis_bencana(), p.getJam(), p.getLokasi(), p.getKeterangan_peristiwa()});
        }
        admlapor.setTbBantuan(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        admlapor.setUsername(username);
        Object source = e.getSource();
        if (source.equals(admlapor.getbtnEditStatus())){
            btnEditStatusActionPerformed();
        } else if(source.equals(admlapor.getbtnHome())){
            new Controller_HomeAfterLoginAdmin(username);
            admlapor.setVisible(false);
        } else if (source.equals(admlapor.getbtnLogOut())){
            admlapor.showMessage("Sampai Jumpa!", "Berhasil Keluar", 1);
            new Controller_Home();
            admlapor.setVisible(false);
        }else if (source.equals(admlapor.getbtnBantu())){
            new Controller_BantuSesamaAdmin(username);
            admlapor.setVisible(false);
        } else if(source.equals(admlapor.getbtnHapus())){
            btnHapusActionPerformed();
            loadTablePeristiwa();
        } else if(source.equals(admlapor.getbtnUpdate())){
            btnUpdateActionPerformed();
        }
    }
    
    public void btnEditStatusActionPerformed(){
        new Controller_HomeAfterLogin(username);
        admlapor.setVisible(false);
    }
    
    public void btnHapusActionPerformed(){
        String id_peristiwa = admlapor.getId_Peristiwa();
        kn.delPeristiwa(id_peristiwa);
        admlapor.resetPeristiwa();
        admlapor.showMessage("Data Berhasil Dihapus", "Success", 1);
    }

    private void btnUpdateActionPerformed() {
        String id_peristiwa = admlapor.getId_Peristiwa();
        String jenis_bencana = admlapor.getTfJenisBencana();
        String jam = admlapor.getTfJam();
        String lokasi = admlapor.getTfLokasi();
        String keterangan_peristiwa = admlapor.getTfKeterangan();
        String status_peristiwa = admlapor.getTfstatusPeristiwa();
        if (id_peristiwa.isEmpty() || jenis_bencana.isEmpty() || jam.isEmpty() || lokasi.isEmpty() || keterangan_peristiwa.isEmpty() || status_peristiwa.isEmpty()){
            admlapor.showMessage("Data Kosong", "Error!", 0);
        } else {
            
        }
    }
    
}
