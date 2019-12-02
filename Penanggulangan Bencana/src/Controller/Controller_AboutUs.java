/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AboutUs;
import View.PetunjukPenggunaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ACER
 */
public class Controller_AboutUs implements ActionListener {
    private AboutUs aa;
    private String username;

    
    public Controller_AboutUs(String username){
        aa = new AboutUs();
        aa.addActionListener(this);
        aa.setVisible(true);
        this.username = username;
        aa.setUsername(username);
    }    
    
    @Override
  public void actionPerformed(ActionEvent e) {
        aa.setUsername(username);
        Object source = e.getSource();
        if (source.equals(aa.getbtnLaporkan())){
            new Controller_UserLapor(username);
            aa.setVisible(false);
        } else if (source.equals(aa.getbtnBantu())){
            new Controller_BantuSesama(username);
            aa.setVisible(false);
        }
        else if (source.equals(aa.getbtnHome())){
            new Controller_HomeAfterLogin(username);
            aa.setVisible(false);
        }
        else if (source.equals(aa.getbtnHelpPengguna())){
            new Controller_HelpPenggunaan(username);
            aa.setVisible(false);
        }
        else if (source.equals(aa.getbtnPetunjukPenggunaan())){
            new Controller_PetunjukPenggunaan(username);
            aa.setVisible(false);
        }
        else if (source.equals(aa.getbtnLogOut())){
            aa.showMessage("Sampai Jumpa!", "Berhasil Keluar", 1);   
            new Controller_Home(); 
            aa.setVisible(false);
        }
    }
}
