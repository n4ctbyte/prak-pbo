public class HasilPrakPbo07 {
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

interface HargaAkhir {
    double hitungHarga();
    
}

class Produk implements HargaAkhir{
    protected String nama;
    protected int harga;

    public Produk (String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + nama);
        System.out.println("Harga : " + harga);
    }

    public double hitungPajak() {
        return harga * 0.05;
    }

    @Override
    public double hitungHarga () {
        return harga * 1.05;
    }
}

class BarangElektronik extends Produk implements HargaAkhir{
    private int garansi;

    public BarangElektronik (String nama, int harga, int garansi) {
        super (nama, harga);
        this.garansi = garansi;
    }

    public void tampilkanGaransi () {
        System.out.println("Garansi : "+ garansi + " bulan");
    }

    @Override
    public double hitungPajak() {
        return harga * 0.01;
    }

    @Override
    public double hitungHarga () {
        return harga * 1.01;
    }
}