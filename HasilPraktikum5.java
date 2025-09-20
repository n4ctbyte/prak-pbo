public class HasilPraktikum5 {
    public static void main(String[] args) {
        // object instantiation
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();

        // constructor overloading
        Mobil Mobil1 = new Mobil();
        Mobil Mobil2 = new Mobil("Toyota");

        // method overloading
        Kalkulator calc = new Kalkulator();
        System.out.println(calc.tambah(5, 3));
        System.out.println(calc.tambah(5.5, 3.2));
        System.out.println(calc.tambah("Hello", "World"));
    }
}

// class
class Mobil {
    private String merek;
    private String warna;
    private int tahun;
    private double harga;

    // method
    public void nyalakanMsin() {
        System.out.println("Mesin dinyalakan");
    }

    public void matikanMesin() {
        System.out.println("Mesin dimatikan");
    }

    // default constructor
    // public Mobil() {
    //     this.merek = "Unknown";
    //     this.warna = "Unknown";
    // }

    // constructor dengan parameter
    public Mobil(String merek, String warna, int tahun) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
    }

    // overloading constructor
    // constructor default
    public Mobil() {
        this.merek = "Unknown";
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }

    // constructor dengan merek saja
    public Mobil(String merek) {
        this.merek = merek;
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }
}

class Kalkulator {
    // method dengan 2 parameter
    public int tambah(int a, int b) {
        System.out.println("Menambah integer");
        return a + b;
    }

    // method dengan 3 parameter
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // method dengan 4 parameter
    public int tambah(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // method untuk double
    public double tambah(double a, double b) {
        System.out.println("Menambah double");
        return a + b;
    }

    // method untuk string (concatenation)
    public String tambah(String a, String b) {
        System.out.println("Menggabungkan string");
        return a + b;
    }
}

// abstract class
abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }
    
    // method abstract (wajib diimplementasikan oleh subclass)
    abstract void suara();

    // method biasa
    void info() {
        System.out.println("Nama hewan : " + nama);
    }
}
