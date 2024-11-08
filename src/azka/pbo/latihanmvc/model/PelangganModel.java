/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azka.pbo.latihanmvc.model;

import azka.pbo.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 * Kelas model untuk data Pelanggan.
 * Kelas ini berfungsi sebagai penyimpanan data dan notifikasi perubahan data
 * ke listener yang terhubung (misalnya komponen view).
 * 
 * Kelas ini menerapkan konsep MVC (Model-View-Controller).
 * 
 * @author azkaz
 */
public class PelangganModel {
    
    // Atribut data dari pelanggan
    private String nama;
    private String email;
    private String telepon;
    private String alamat;
    
    // Listener untuk menangani event perubahan data
    private PelangganListener listener;

    /**
     * Mendapatkan listener yang terhubung.
     * 
     * @return listener PelangganListener saat ini
     */
    public PelangganListener getListener() {
        return listener;
    }

    /**
     * Mengatur listener untuk menangani perubahan data.
     * 
     * @param listener objek PelangganListener yang akan digunakan
     */
    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    /**
     * Mendapatkan nama pelanggan.
     * 
     * @return nama pelanggan
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama pelanggan dan memberi notifikasi perubahan.
     * 
     * @param nama nama pelanggan yang akan diset
     */
    public void setNama(String nama) {
        this.nama = nama;
        this.fireOnChange();
    }

    /**
     * Mendapatkan email pelanggan.
     * 
     * @return email pelanggan
     */
    public String getEmail() {
        return email;
    }

    /**
     * Mengatur email pelanggan dan memberi notifikasi perubahan.
     * 
     * @param email email pelanggan yang akan diset
     */
    public void setEmail(String email) {
        this.email = email;
        this.fireOnChange();
    }

    /**
     * Mendapatkan nomor telepon pelanggan.
     * 
     * @return telepon pelanggan
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * Mengatur nomor telepon pelanggan dan memberi notifikasi perubahan.
     * 
     * @param telepon nomor telepon pelanggan yang akan diset
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
        this.fireOnChange();
    }

    /**
     * Mendapatkan alamat pelanggan.
     * 
     * @return alamat pelanggan
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Mengatur alamat pelanggan dan memberi notifikasi perubahan.
     * 
     * @param alamat alamat pelanggan yang akan diset
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        this.fireOnChange();
    }

    /**
     * Memanggil listener untuk memberi tahu bahwa ada perubahan data.
     */
    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    /**
     * Menyimpan data pelanggan dan menampilkan pesan sukses.
     */
    public void simpanForm() {
        JOptionPane.showMessageDialog(null, "Data Pelanggan berhasil disimpan", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Mereset semua data pelanggan ke nilai default (kosong).
     */
    public void resetForm() {
        this.setNama("");
        this.setAlamat("");
        this.setEmail("");
        this.setTelepon("");
    }
}
