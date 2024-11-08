/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azka.pbo.latihanmvc.event;

import azka.pbo.latihanmvc.model.PelangganModel;
 /**
     * Dipanggil ketika terjadi perubahan pada model {@link PelangganModel}.
     * Method ini memungkinkan view atau komponen lain untuk memperbarui tampilannya
     * sesuai dengan perubahan data yang terjadi pada model.
     * 
     * @param pelanggan objek {@link PelangganModel} yang mengalami perubahan
     */
public interface PelangganListener {
    public void onChange(PelangganModel pelanggan);
}
