public class HasilPraktikum6 {
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 1200000, 5);
        Produk p2 = new Produk("HP", 3500000, 10);

        System.out.println("Nama Produk : " + p1.nama);
        System.out.println("Stok : " + p1.stok);
        // System.out.println(p1.harga); // error karena private        
        System.out.println("Harga Produk : " + p1.getHarga());

        p1.setHarga(9000000);
        System.out.println("Harga baru untuk produk : " + p1.getHarga());

        // p1.namaSupplier(); // error
        p1.namaSupplierFix();
        p1.tampilkanInfo();
        Produk.infoJumlahProduk();
    }
}

class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private String namaSupplier = "Chris";
    static int jumlahProduk = 0;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Harga : "+ harga);
        System.out.println("Stok : " + stok);
    }

    private void namaSupplier() {
        System.out.println("Nama suppliernya adalah " + namaSupplier);
    }

    public void namaSupplierFix() {
        namaSupplier();
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        }
        else if (hargaBaru == 0) {
            this.harga = hargaBaru;
            System.out.println("Produk ini gratisss!!!");
        }
        else {
            System.out.println("Harga produk tidak boleh negatif");
        }
    }

    public static void infoJumlahProduk() {
        System.out.println("Total produk yang telah dibuat : " + jumlahProduk);
    }

}
