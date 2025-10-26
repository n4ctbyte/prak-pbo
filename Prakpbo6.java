public class Prakpbo6 {
    public static void main(String[] args) {
        Bank nkt = new Bank("NKT", 25032005L);
        Rekening nakata = new Rekening("Nakata Christian", 1000);
        
        nkt.getInfoBank();
        System.out.println();

        Bank nact = new Bank("NACT", 314159265359L);
        nact.getInfoBank();
        System.out.println();
        nakata.getNamaSaldo();
        nakata.setNama("Farhan Kebab");
        System.out.println();
        nakata.getNamaSaldo();
    }
}

class Rekening {
    private String namaNasabah;
    private double saldo;

    public Rekening(String namaNasabah, double saldo) {
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    public void getNamaSaldo() {
        System.out.println("Nama Nasabah : " + namaNasabah);
        System.out.println("Saldo : Rp" + saldo);
    }

    public void setNama(String namaNasabah) {
        this.namaNasabah = namaNasabah;
        System.out.println("Nama nasabah berubah menjadi " + namaNasabah);
    }
}

class Bank {
    private String namaBank;
    private long idBank;
    static int jumlahBank = 0;

    public Bank(String namaBank, long idBank) {
        this.namaBank = namaBank;
        this.idBank = idBank;
        jumlahBank++;
    }

    public void getInfoBank() {
        System.out.println("Nama Bank : " + namaBank);
        System.out.println("ID Bank : " + idBank);
        System.out.println("Jumlah Bank : " + jumlahBank);
    }
}