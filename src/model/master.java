/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class master {
    public String id;
    public String nama;
    public String tempatLahir;
    public String tanggalLahir;
    public String jenisKelamin;
    public String agama;
    public String alamat;
    
    public master(){}

    public master(String id, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin, String agama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.alamat = alamat;
    }
}
