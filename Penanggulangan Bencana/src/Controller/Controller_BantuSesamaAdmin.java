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
public class Controller_BantuSesamaAdmin implements ActionListener{
    private BantuSesamaAdmin bntadm;
    private String username;
    private Koneksi kn;
    
    
    
    public Controller_BantuSesamaAdmin(String username) {
        bntadm = new BantuSesamaAdmin();
        bntadm.addActionListener(this);
        bntadm.setVisible(true);
        kn = new Koneksi();        
        this.username = username;
        bntadm.setUsername(username); 
        loadTableBantuan();
    }
    
    public void loadTableBantuan(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nama Pengirim","Lokasi Pengirim"," Jenis Bantuan ", "Tanggal Pengiriman", "Keterangan"}, 0);
        ArrayList<Bantuan> bantuan = kn.getBantuan();
        for (Bantuan b : bantuan) {
            System.out.println("1.");
            model.addRow(new Object[]{b.getNama_pengirim(),b.getLokasi_pengirim(), b.getJenis_bantuan(), b.getTanggal_bantuan(), b.getKeterangan_bantuan()});
        }
//        System.out.println("sampesini");
        bntadm.setTbBantuan1(model);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        bntadm.setUsername(username);        
        Object source = e.getSource();
        if (source.equals(bntadm.getbtnHome())){
             btnHomeActionPerformed();
        } else if(source.equals(bntadm.getbtnLaporkan())){
            btnLaporkanActionPerformed();
        } else if(source.equals(bntadm.getbtnLogOut())){
            bntadm.showMessage("Sampai Jumpa!", "Berhasil Keluar", 1);
            new Controller_Home();
            bntadm.setVisible(false);
        }
    }

    public void btnHomeActionPerformed(){
        new Controller_HomeAfterLoginAdmin(username);
        bntadm.setVisible(false);
}
    public void btnLaporkanActionPerformed(){
        new Controller_AdminLapor(username);
        bntadm.setVisible(false);
    }
    

    
}
