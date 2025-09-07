package com.mycompany.ppbo01;

import java.util.Scanner; //mengimpor library scanner untuk input user

public class PrakPbo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //deklarasi dari objek scanner agar input user masuk
        
        //tampilan awal program
        System.out.println("========================================================");
        System.out.println("        KALKULATOR BANGUN RUANG PRISMA TRAPESIUM        ");
        System.out.println("========================================================");
        
        //input nilai dari prisma trapesium
        System.out.print("Masukkan sisi sejajar 1 (cm): ");
        double sisisejajar1 = scanner.nextDouble();
        System.out.print("Masukkan sisi sejajar 2 (cm): ");
        double sisisejajar2 = scanner.nextDouble();
        System.out.print("Masukkan tinggi alas trapesium (cm): ");
        double tinggiAlasTrapesium = scanner.nextDouble();
        System.out.print("Masukkan tinggi prisma (cm): ");
        double tinggiPrisma = scanner.nextDouble();

        //hitung luas alas dari trapesium
        double luasAlas = ((sisisejajar1 + sisisejajar2) * tinggiAlasTrapesium) / 2;

        //hitung volume dari prisma trapesium
        double volume = luasAlas * tinggiPrisma;

        //output hasil luas alas dan volume prisma trapesium
        System.out.println("========================================================");
        System.out.println("Luas alas trapesium: " + luasAlas);
        System.out.println("Volume prisma trapesium adalah: " + volume);
        System.out.println("========================================================");

        scanner.close(); //scanner ditutup karena input sudah selesai
    }
}



