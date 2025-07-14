/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class karyawan extends master {
    public String nik;
    public String jenjangPendidikan;
    public String universitasAsal;
    public String programStudi;
    public String posisi;
    
    public karyawan(){}

    public karyawan(String id, String nik, String nama, String tempatLahir, String tanggalLahir,String jenisKelamin, String agama, String alamat, String jenjangPendidikan, String universitasAsal, String programStudi, String posisi) {
        super(id, nama, tempatLahir, tanggalLahir, jenisKelamin, agama, alamat);
        this.nik = nik;
        this.jenjangPendidikan = jenjangPendidikan;
        this.universitasAsal = universitasAsal;
        this.programStudi = programStudi;
        this.posisi = posisi;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }

    public String getUniversitasAsal() {
        return universitasAsal;
    }

    public void setUniversitasAsal(String universitasAsal) {
        this.universitasAsal = universitasAsal;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
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
