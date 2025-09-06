package Praktikum;
import java.util.Scanner; // mengimpor scanner

public class PrakPbo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // mendeklarasikan objek scanner untuk menerima input user

        // meminta data dari user
        System.out.println("=== SELAMAT DATANG DI KALKULATOR VOLUME PRISMA TRAPESIUM ===");
        System.out.println("Masukkan panjang sisi atas dari alas prisma trapesium dalam cm : ");
        double sisiAlas1 = sc.nextDouble();
        System.out.println("Masukkan panjang sisi bawah dari alas prisma trapesium dalam cm : ");
        double sisiAlas2 = sc.nextDouble();
        System.out.println("Masukkan tinggi alas prisma trapesium dalam cm : ");
        double tinggiAlas = sc.nextDouble();
        System.out.println("Masukkan tinggi prisma trapesium dalam cm : ");
        double tinggiPrisma = sc.nextDouble();

        // validasi input user
        if (sisiAlas1 <= 0 || sisiAlas2 <= 0 || tinggiAlas <= 0 || tinggiPrisma <= 0) {
                System.out.println("Input tidak boleh nol atau bilangan negatif.");
            }
        else {
                // menghitung volume prisma trapesium
                double volumePrisma = ((sisiAlas1 + sisiAlas2) * tinggiAlas / 2) * tinggiPrisma;

                // menggunakan print format untuk mencetak hasil ke console
                System.out.printf("Volume prisma trapesium dengan panjang sisi atas alas %.2f cm, panjang sisi bawah alas %.2f cm, tinggi alas %.2f cm, dan tinggi prisma %.2f cm  adalah %.2f cm^3 %n", sisiAlas1, sisiAlas2, tinggiAlas, tinggiPrisma, volumePrisma);
            }

        System.out.println("TERIMA KASIH SUDAH MEMAKAI KALKULATOR INI! :D");

        // menutup scanner untuk mencegah resource leak
        sc.close();
    }
}