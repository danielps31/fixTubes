/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HelpPenggunaan;
import View.PetunjukPenggunaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ACER
 */
public class Controller_HelpPenggunaan implements ActionListener{
    private HelpPenggunaan help;
    private String username;
    
    public Controller_HelpPenggunaan(String username){
        help = new HelpPenggunaan();
        help.addActionListener(this);
        help.setVisible(true);
        this.username = username;
        help.setUsername(username);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        help.setUsername(username);
        Object source = e.getSource();
        if (source.equals(help.getbtnLaporkan())){
            new Controller_UserLapor(username);
            help.setVisible(false);
        } else if (source.equals(help.getbtnBantu())){
            new Controller_BantuSesama(username);
            help.setVisible(false);
        }
        else if (source.equals(help.getbtnHome())){
            new Controller_HomeAfterLogin(username);
            help.setVisible(false);
        }
        else if (source.equals(help.getbtnPetunjukPenggunaan())){
            new Controller_PetunjukPenggunaan(username);
            help.setVisible(false);
        }
        else if (source.equals(help.getbtnAboutUs())){
            new Controller_AboutUs(username);
            help.setVisible(false);
        }else if (source.equals(help.getbtnLogOut())){
            help.showMessage("Sampai Jumpa!", "Berhasil Keluar", 1);   
            new Controller_Home(); 
            help.setVisible(false);
        }
    }
}
