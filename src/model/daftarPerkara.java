/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class daftarPerkara extends master {
    private String nikClient;
    private String penanggungJawab;
    private String perkara;
    private String status;
    private String tindakanHukum;
    private String hasilTindakan;
    
    public daftarPerkara(){}

    public daftarPerkara(String id, String nikClient, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin, String agama, String alamat, String penanggungJawab, String perkara, String status, String tindakanHukum, String hasilTindakan) {
        super(id, nama, tempatLahir, tanggalLahir, jenisKelamin, agama, alamat);
        this.nikClient = nikClient;
        this.penanggungJawab = penanggungJawab;
        this.perkara = perkara;
        this.status = status;
        this.tindakanHukum = tindakanHukum;
        this.hasilTindakan = hasilTindakan;
    }

    public String getNikClient() {
        return nikClient;
    }

    public void setNikClient(String nikClient) {
        this.nikClient = nikClient;
    }

    public String getPenanggungJawab() {
        return penanggungJawab;
    }

    public void setPenanggungJawab(String penanggungJawab) {
        this.penanggungJawab = penanggungJawab;
    }

    public String getPerkara() {
        return perkara;
    }

    public void setPerkara(String perkara) {
        this.perkara = perkara;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTindakanHukum() {
        return tindakanHukum;
    }

    public void setTindakanHukum(String tindakanHukum) {
        this.tindakanHukum = tindakanHukum;
    }

    public String getHasilTindakan() {
        return hasilTindakan;
    }

    public void setHasilTindakan(String hasilTindakan) {
        this.hasilTindakan = hasilTindakan;
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
