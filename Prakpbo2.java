package com.mycompany.ppbo;

public class Prakpbo2 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        String nama = "Asma Elhasna Hamid";
        final long NIM = 2407111783L;
        String alamat = "Jl. Rawa Bening No.30";
        int umur = 19;
        char golonganDarah = 'B';
        double[] ip = {3.98, 3.77};
        
        byte ipByte = (byte) ip[0]; //Mengkonversi double ke byte

        //Menampilkan Biodata Mahasiswa
        System.out.println("=======================================");
        System.out.println("           BIODATA MAHASISWA           ");
        System.out.println("=======================================");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + NIM);
        System.out.println("IP Semester 1   : " + ip[0]);
        System.out.println("IP Semester 2   : " + ip[1]);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Umur            : " + umur);
        System.out.println("Golongan Darah  : " + golonganDarah);
        System.out.println("=======================================");
        
        //Menampilkan IP dalam byte
        System.out.println("IP Semester 1 dalam byte : " + ipByte);
    }
}
