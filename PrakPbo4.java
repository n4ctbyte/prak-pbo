package Praktikum;

import java.util.Scanner; // mengimpor scanner

public class PrakPbo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // membuat scanner
        int pilihan;
        System.out.println("=== SELAMAT DATANG DI KALKULATOR LUAS BANGUN DATAR ===");

        // loop do while agar program dinamis
        do {
            // pilihan untuk user
            System.out.println("\n1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.println("Pilih salah satu bangun : ");
            pilihan = sc.nextInt();

            // switch case untuk menangani input user
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan panjang sisi persegi dalam cm : ");
                    double sisiPersegi = sc.nextDouble();
                    System.out.printf("Luas persegi yaitu %.1f cm\n", sisiPersegi*sisiPersegi);
                    break;
            
                case 2:
                    System.out.println("Masukkan panjang persegi panjang dalam cm : ");
                    double panjangPersegiPanjang = sc.nextDouble();
                    System.out.println("Masukkan lebar persegi panjang dalam cm : ");
                    double lebarPersegiPanjang = sc.nextDouble();
                    System.out.printf("Luas persegi panjang tersebut adalah %.1f cm\n", panjangPersegiPanjang*lebarPersegiPanjang);
                    break;
                
                case 3:
                    final double pi = 3.14;
                    System.out.println("Masukkan jari-jari lingkaran dalam cm : ");
                    double radius = sc.nextDouble();
                    System.out.printf("Luas lingkaran tersebut yaitu %.1f cm\n", pi*radius*radius);
                    break;

                case 4:
                    System.out.println("Masukkan panjang sisi alas segitiga dalam cm : ");
                    double alasSegitiga = sc.nextDouble();
                    System.out.println("Masukkan tinggi segitiga dalam cm : ");
                    double tinggiSegitita = sc.nextDouble();
                    System.out.printf("Luas segitiga tersebut yaitu %.1f cm\n", 0.5*alasSegitiga*tinggiSegitita);
                    break;
                
                case 5:
                    System.out.println("=== TERIMA KASIH TELAH MENGGUNAKAN KALKULATOR INI ===");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid. Tolong pilh antara 1-5");
            }
        } while (pilihan != 5); // kondisi yang jika terpenuhi maka program akan looping
    }
}