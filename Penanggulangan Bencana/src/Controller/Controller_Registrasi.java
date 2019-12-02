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
 * @author fikri
 */
public class Controller_Registrasi implements ActionListener {

    private Registrasi view;
    private Koneksi kn;
    private int id_user;
    private String username;
    private String password;

    public Controller_Registrasi() {
        kn = new Koneksi();
        view = new Registrasi();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getbtnDaftar())) {
            btnDaftarActionPerformed();
        } else if (source.equals(view.getbtnLoginUser())){
            new Controller_loginUser();
            view.setVisible(false);
        }  
    }

    public void btnDaftarActionPerformed() {

        String nama = view.getTfNama();
        String email = view.getTfEmail();
        String no_telp = view.getTfNo_telp();
        String username = view.getTfUsername();
        String password = view.getTfPassword();
        if (nama.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || no_telp.isEmpty()) {
            view.showMessage("Ada Bagian kosong!!!", "Error", 0);
        } else {
            if (kn.cekDuplikasiUsername(username)) {
                view.showMessage("Username Sudah Ada", "Error", 0);
            } else {
                if (kn.addUser(new User(null, no_telp,username,nama,email,password))) {
                    view.showMessage("data berhasil ditambah", "Succes", 1);
                 new Controller_HomeAfterLogin(username);
                view.setVisible(false);
                }else{
                    view.showMessage("data gagal ditambah", "Error", 0);
                }

            }
        }
    }
}
