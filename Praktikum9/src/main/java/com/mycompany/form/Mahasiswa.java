package com.mycompany.form;

import java.util.*;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String prodi;
    private String jenisKelamin;
    private boolean isActive;

    public Mahasiswa(String nama, String nim, String prodi, String jenisKelamin, boolean isActive) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        this.isActive = isActive;
    }

    public static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}