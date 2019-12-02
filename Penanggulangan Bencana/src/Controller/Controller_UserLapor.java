/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Peristiwa;
import View.UserLapor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Shamgar
 */
public class Controller_UserLapor implements ActionListener{

    private UserLapor lapor;
    private Koneksi kn;    
    private String username;
    private String jenis_bencana;
    private String jam;
    private String lokasi_bencana;
    private String keterangan_bencana;
    private String status_peristiwa;

    public Controller_UserLapor(String username) {
        lapor = new UserLapor();
        kn = new Koneksi();
        lapor.addActionListener(this);
        lapor.setVisible(true);
        this.username = username;
        lapor.setUsername(username);        
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        lapor.setUsername(username);        
        Object source = e.getSource();
        if (source.equals(lapor.getbtnHome())){
             btnHomeActionPerformed();
        } else if(source.equals(lapor.getbtnSubmit())){
            btnSubmitActionPerformed();
        }else if(source.equals(lapor.getbtnBantu())){
            btnBantuActionPerformed();
        } else if(source.equals(lapor.getbtnPetunjukPenggunaan())){
            new Controller_PetunjukPenggunaan(username);
            lapor.setVisible(false);
        } else if(source.equals(lapor.getbtnHelpPengguna())){
            new Controller_HelpPenggunaan(username);
            lapor.setVisible(false);
        } else if(source.equals(lapor.getbtnAboutUs())){
            new Controller_AboutUs(username);
            lapor.setVisible(false);
        } else if(source.equals(lapor.getbtnKeluar())){
            lapor.showMessage("Sampai Jumpa!", "Berhasil Keluar", 1);            
            new Controller_Home();
            lapor.setVisible(false);
        } 
    }

    public void btnHomeActionPerformed(){
        new Controller_HomeAfterLogin(username);
        lapor.setVisible(false);
}
    public void btnBantuActionPerformed(){
        new Controller_BantuSesama(username);
        lapor.setVisible(false);
    }
    public void btnSubmitActionPerformed(){
       String jenis_bencana = lapor.getTfJenisBencana();
       String jam = lapor.getTfJam();
       String lokasi_bencana = lapor.getTfLokasi();
       String keterangan_bencana = lapor.getTfKeterangan();
       String status_peristiwa = lapor.getTfKeterangan();
       
       if(jenis_bencana.isEmpty() || jam.isEmpty() || lokasi_bencana.isEmpty() || keterangan_bencana.isEmpty()){     
       lapor.showMessage("Masih Ada Field Kosong", "Error", 0);
        } else{
              if(kn.addPeristiwa(new Peristiwa(null,jenis_bencana,jam,lokasi_bencana,keterangan_bencana,status_peristiwa)))
                     lapor.showMessage("Data Telah Berhasil Ditambahkan!", "Sukses", 1);
                     new Controller_BantuSesama(username);
                     lapor.setVisible(false);
                  }
        }   
}
