/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azka.pbo.latihanmvc.controller;

import azka.pbo.latihanmvc.model.PelangganModel;
import azka.pbo.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * Controller untuk  menghandle Pelanggan
 * @author azkaz
 * @param Controller a specimen of object
 * @return mengembalikan Pelanggan Baru
 */
public class PelangganController {
    
    private PelangganModel model;

    public PelangganModel getMode() {
        return model;
    }

     /**
     * Mengatur objek model pelanggan.
     * 
     * @param model model pelanggan yang akan digunakan
     */

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
     /**
     * Menyimpan data dari form PelangganView ke dalam model.
     * 
     * @param view objek PelangganView yang berisi data input dari pengguna
     */
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelepon().getText();
        String alamat = view.getTxtAlamat().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Nama tidak boleh kososng");
        } else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Email tidak boleh kososng");
        } else if(telepon.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Telepon tidak boleh kososng");
        } else if(alamat.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Alamat tidak boleh kososng");
        } else{
            model.setNama(nama);
            model.setEmail(email);
            model.setTelepon(telepon);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            
            model.simpanForm();
        }
        
        
    }
    
    /**
     * Reset semua field di form PelangganView.
     * 
     * @param view objek PelangganView yang berisi data input dari pengguna
     */
    public void resetForm(PelangganView view){
         String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telepon = view.getTxtTelepon().getText();
        String alamat = view.getTxtAlamat().getText();
        
        //Validasi
        
        if(email.equals("") && nama.equals("") && telepon.equals("") && alamat.equals("")){
        JOptionPane.showMessageDialog(view, "Form pelanggan masih kosong");
    } else {
            model.resetFOrm();
        }

    
    }
    
    
    //method dilamad controller
    
}
