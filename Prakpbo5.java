public class Prakpbo5 {

    public static void main(String[] args) {
        // Objek 1
        Handphone Samsung = new Handphone("Samsung", "Galaxy S24", "Hitam", 6.8, 2023, 12, 256, 50, false);
        Samsung.tampilkanInfo();
        Samsung.isiDaya(50);
        Samsung.kirimPesan("0812-3456-7890", "Jadi pergi ga?");
        System.out.println();

        //Objek 2
        Handphone Apple = new Handphone("Apple", "iPhone 15 Pro", "Pink");
        Apple.tampilkanInfo();
        Apple.kirimPesan("0812-9876-5432", "Hari ini ada asistensi ga?");
        System.out.println();

        //Objek 3
        Handphone Huawei = new Handphone("Huawei", "Huawei Mate XT", 100);
        Huawei.tampilkanInfo();
        Huawei.isiDaya(100);
        Huawei.kirimPesan("0899-1122-3344", "Kayanya ada deh");
    }
}

    class Handphone {
        // Atribut 
        private String merek;
        private String model;
        private String warna;
        private double ukuranLayar;
        private int tahunLiris;
        private int kapasitasRam;
        private int kapasitasMemori;
        private int levelBaterai;
        private boolean isFull;

        // Constructor Overloading
        // Constructor 1 
        public Handphone(String merek, String model, int levelBaterai) {
            this.merek = merek;
            this.model = model;
            this.levelBaterai = levelBaterai;
        }

        // Constructor 2
        public Handphone(String merek, String model, String warna) {
            this.merek = merek;
            this.model = model;
            this.warna = warna;
        }

        // Constructor 3
        public Handphone(String merek, String model, String warna, double ukuranLayar, int tahunLiris, int kapasitasRam, int kapasitasMemori, int levelBaterai, boolean isFull) {
            this.merek = merek;
            this.model = model;
            this.warna = warna;
            this.ukuranLayar = ukuranLayar;
            this.tahunLiris = tahunLiris;
            this.kapasitasRam = kapasitasRam;
            this.kapasitasMemori = kapasitasMemori;
            this.levelBaterai = levelBaterai;
            this.isFull = isFull;
        }

        // Method Overloading 
        // Method 1
        public void tampilkanInfo() {
            System.out.println("======Informasi Handphone=====");
            System.out.println("Merek Handphone : " + merek);
            System.out.println("Model : " + model);
            System.out.println("Warna : " + warna);
            System.out.println("Ukuran Layar : " + ukuranLayar + " inci");
            System.out.println("Tahun diliris : " + tahunLiris);
            System.out.println("RAM : " + kapasitasRam + " GB");
            System.out.println("Kapasitas Memori : " + kapasitasMemori + " GB");
            System.out.println("Status Baterai : " + levelBaterai + "%");
        }

        // Method 2 
        public void isiDaya(int persentase) { 
            if (persentase >= 100) {
                this.isFull = true;
                this.levelBaterai = 100;
                System.out.println("Baterai sudah terisi penuh.");
            } else {
                this.isFull = false;
                this.levelBaterai = persentase;
                System.out.println("Baterai sedang mengisi daya " + persentase + "%.");
            }
        }
        
        // Method 3         
        public void kirimPesan(String nomorTujuan, String isiPesan) { 
            System.out.println("Mengirim pesan kepada " + nomorTujuan);
            System.out.println("Isi pesannya: '" + isiPesan + "'.");
        }
    }
