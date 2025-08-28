package Praktikum;

public class Main {
    public static void main(String[] args) {
        // membuat objek mahasiswa
        Mahasiswa nakata = new Mahasiswa("Nakata Christian", 2407112366L, new double[] {3.62, 3.67}, "Jalan Riau Ujung", 20, 'O');
    }
}

// template agar tidak usah mendeklarasikan variabel berulang ulang untuk setiap mahasiswa
class Mahasiswa {
    String nama;
    long nim;
    double[] ip;
    String alamat;
    int umur;
    char golongan_darah;

    // constructor untuk mengisi data saat membuat objek
    public Mahasiswa(String nama, long nim, double[] ip, String alamat, int umur, char golongan_darah) {
        this.nama = nama;
        this.nim = nim;
        this.ip = ip;
        this.alamat = alamat;
        this.umur = umur;
        this.golongan_darah = golongan_darah;
    }
}