/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Shamgar
 */
public class Bantuan {
    private String id_bantuan;
    private String jenis_bantuan;
    private String tanggal_bantuan;
    private String keterangan_bantuan;
    private String nama_pengirim;
    private String lokasi_pengirim;

    public Bantuan(String id_bantuan, String jenis_bantuan, String tanggal_bantuan, String keterangan_bantuan, String nama_pengirim, String lokasi_pengirim) {
        this.id_bantuan = id_bantuan;
        this.jenis_bantuan = jenis_bantuan;
        this.tanggal_bantuan = tanggal_bantuan;
        this.keterangan_bantuan = keterangan_bantuan;
        this.nama_pengirim = nama_pengirim;
        this.lokasi_pengirim = lokasi_pengirim;
    }

    public String getId_bantuan() {
        return id_bantuan;
    }

    public void setId_bantuan(String id_bantuan) {
        this.id_bantuan = id_bantuan;
    }

    public String getJenis_bantuan() {
        return jenis_bantuan;
    }

    public void setJenis_bantuan(String jenis_bantuan) {
        this.jenis_bantuan = jenis_bantuan;
    }

    public String getTanggal_bantuan() {
        return tanggal_bantuan;
    }

    public void setTanggal_bantuan(String tanggal_bantuan) {
        this.tanggal_bantuan = tanggal_bantuan;
    }

    public String getKeterangan_bantuan() {
        return keterangan_bantuan;
    }

    public void setKeterangan_bantuan(String keterangan_bantuan) {
        this.keterangan_bantuan = keterangan_bantuan;
    }

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
    }

    public String getLokasi_pengirim() {
        return lokasi_pengirim;
    }

    public void setLokasi_pengirim(String lokasi_pengirim) {
        this.lokasi_pengirim = lokasi_pengirim;
    }
    
}