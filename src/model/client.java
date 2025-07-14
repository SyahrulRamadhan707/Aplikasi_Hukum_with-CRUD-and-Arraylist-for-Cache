/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class client extends master {
    public String nik;
    public String status;
    public String kasusPerkara;
    public String tanggalKasus;
    public String lokasiKejadianKasus;
    public String uraianKasus;
    
    public client(){}

    public client(String id, String nik, String nama, String tempatLahir, String tanggalLahir,String jenisKelamin, String agama, String alamat, String status, String kasusPerkara, String tanggalKasus, String lokasiKejadianKasus, String uraianKasus) {
        super(id, nama, tempatLahir, tanggalLahir, jenisKelamin, agama, alamat);
        this.nik = nik;
        this.status = status;
        this.kasusPerkara = kasusPerkara;
        this.tanggalKasus = tanggalKasus;
        this.lokasiKejadianKasus = lokasiKejadianKasus;
        this.uraianKasus = uraianKasus;
    }
    
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKasusPerkara() {
        return kasusPerkara;
    }

    public void setKasusPerkara(String kasusPerkara) {
        this.kasusPerkara = kasusPerkara;
    }

    public String getTanggalKasus() {
        return tanggalKasus;
    }

    public void setTanggalKasus(String tanggalKasus) {
        this.tanggalKasus = tanggalKasus;
    }

    public String getLokasiKejadianKasus() {
        return lokasiKejadianKasus;
    }

    public void setLokasiKejadianKasus(String lokasiKejadianKasus) {
        this.lokasiKejadianKasus = lokasiKejadianKasus;
    }

    public String getUraianKasus() {
        return uraianKasus;
    }

    public void setUraianKasus(String uraianKasus) {
        this.uraianKasus = uraianKasus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
