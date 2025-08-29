package Praktikum;

public class Main {
    public static void main(String[] args) {
        // deklarasi dan inisialisasi variabel
        String nama1 = "Nakata Christian";
        final long nim1 = 2407112366L;

        // ip dalam array
        double[] ip1 = {3.62, 3.67};
        String alamat1 = "Jalan Riau Ujung";
        int umur = 20;
        char golongan_darah = 'O';

        // print biodata
        System.out.println("=== BIODATA NAKATA ===");
        System.out.println("Nama : " + nama1);
        System.out.println("NIM : " + nim1);
        System.out.println("IP Semester 1 : " + ip1[0]);
        System.out.println("IP Semester 2 : " + ip1[1]);
        
        // mengubah ip dari double ke byte
        byte ipByte1 = (byte) ip1[0];
        System.out.println("IP Semester 1 dalam byte : " + ipByte1);
        System.out.println("Alamat : " + alamat1);
        System.out.println("Umur : " + umur);
        System.out.println("Golongan Darah : " + golongan_darah);
    }
}