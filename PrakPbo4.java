package com.mycompany.ppbo;

import java.util.Scanner; //mengimpor scanner

public class Prakpbo4 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        // Mendeklarasikan variabel pilihan untuk menyimpan menu yang dipilih
        int pilihan = 0;

        // Menampilkan judul program
        System.out.println("============================================================");
        System.out.println("        Selamat Datang di Kalkulator Luas Bangun Datar      ");
        System.out.println("============================================================");

        // Memulai perulangan yang akan terus berjalan selama pilihan tidak sama dengan 5
        while (pilihan != 5) {
            // Menampilkan daftar menu pilihan
            System.out.println("Berikut menu-menu yang dapat digunakan:");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung luas Persegi Panjang");
            System.out.println("3. Menghitung Luas Lingkaran");
            System.out.println("4. Menghitung Luas Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih menu berikut : ");

            // Menerima input pilihan dari pengguna
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan sisa baris dari input sebelumnya

            // Percabangan untuk memproses pilihan pengguna
            if (pilihan == 1) {
                // Menghitung luas persegi
                System.out.print("Masukkan sisi persegi (cm): ");
                double sisi1 = input.nextDouble();
                double luasPersegi = sisi1 * sisi1;
                System.out.println("Luas persegi tersebut adalah " + luasPersegi + " cm");
            } 
            else if (pilihan == 2) {
                // Menghitung luas persegi panjang
                System.out.print("Masukkan panjang persegi panjang (cm): ");
                double sisiPanjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang (cm): ");
                double sisiLebar = input.nextDouble();
                double luasPersegiPanjang = sisiPanjang * sisiLebar;
                System.out.println("Luas persegi panjang tersebut adalah " + luasPersegiPanjang + " cm");
            } 
            else if (pilihan == 3) {
                // Menghitung luas lingkaran
                System.out.print("Masukkan jari-jari lingkaran (cm): ");
                double jariJari = input.nextDouble();
                double luasLingkaran = 3.14 * jariJari * jariJari;
                System.out.println("Luas lingkaran tersebut adalah " + luasLingkaran + " cm");
            } 
            else if (pilihan == 4) {
                // Menghitung luas segitiga
                System.out.print("Masukkan alas segitiga (cm): ");
                double sisiAlas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga (cm): ");
                double sisiTinggi = input.nextDouble();
                double luasSegitiga = 0.5 * sisiAlas * sisiTinggi;
                System.out.println("Luas segitiga tersebut adalah " + luasSegitiga + " cm");
            } 
            else if (pilihan == 5) {
                // Pilihan keluar dari program
                System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                break; // Menghentikan perulangan
            } 
            else {
                // Untuk input pilihan yang tidak valid
                System.out.println("Pilihan anda tidak tersedia, silahkan pilih nomor 1-5");
            }
        }
    }
}
