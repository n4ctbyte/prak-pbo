/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class HasilPbo07 {
    public static void main(String[] args) {
        Produk p1 = new Produk ("Buku", 150000);
        BarangElektronik p2 = new BarangElektronik("Mouse", 150000, 12);

        p1.tampilkanInfo();
        System.out.println("Pajak Produk Umum: " + p1.hitungPajak());
        System.out.println("Harga akhir produk: "+ p1.hitungHarga());
        System.out.println("--------------------");

        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak Barang Elektronik: " + p2.hitungPajak());
        System.out.println("Harga akhir produk: "+ p2.hitungHarga());
    }
}