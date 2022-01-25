/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSiUser
 */
public class Barang {
    public String kode_barang;
    public String nama_barang;
    public String jumlah;
    public String satuan;
    
    public Barang(String kode, String nama, String inputSatuan, String inputJumlah){
        kode_barang = kode;
        nama_barang = nama;
        jumlah = inputJumlah;
        satuan = inputSatuan;
    }
    
}
