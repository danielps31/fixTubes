/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.PetunjukPenggunaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ACER
 */
public class Controller_PetunjukPenggunaan implements ActionListener {
    private PetunjukPenggunaan petunjuk;
    private String username;
    
    public Controller_PetunjukPenggunaan(String username){
        petunjuk = new PetunjukPenggunaan();
        petunjuk.addActionListener(this);
        petunjuk.setVisible(true);
        this.username = username;
        petunjuk.setUsername(username);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        petunjuk.setUsername(username);
        Object source = e.getSource();
        if (source.equals(petunjuk.getbtnLaporkan())){
            new Controller_UserLapor(username);
            petunjuk.setVisible(false);
        } else if (source.equals(petunjuk.getbtnBantu())){
            new Controller_BantuSesama(username);
            petunjuk.setVisible(false);
        }
        else if (source.equals(petunjuk.getbtnHome())){
            new Controller_HomeAfterLogin(username);
            petunjuk.setVisible(false);
        }
        else if (source.equals(petunjuk.getbtnHelpPengguna())){
            new Controller_HelpPenggunaan(username);
            petunjuk.setVisible(false);
        }
        else if (source.equals(petunjuk.getbtnAboutUs())){
            new Controller_AboutUs(username);
            petunjuk.setVisible(false);
        }else if (source.equals(petunjuk.getbtnLogOut())){
            petunjuk.showMessage("Sampai Jumpa!", "Berhasil Keluar", 1);   
            new Controller_Home(); 
            petunjuk.setVisible(false);
        }
    }

}
