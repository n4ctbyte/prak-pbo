public class PrakPbo6 {
    public static void main(String[] args) {
        Bank asm = new Bank("ASM", 54543987534L);
        Rekening asmael = new Rekening("Asma Elhasna Hamid", 1000);

        asm.getInfoBank();
        System.out.println();

        Bank asma = new Bank("ASMA", 893635698326L);
        asma.getInfoBank();
        System.out.println();
        asmael.getNamaSaldo();
        asmael.setNama("Asma Elhasna Hamid");
        System.out.println();
        asmael.getNamaSaldo();
    }
}

class Rekening {
    private String namaPemilik;
    private double saldo;

    public Rekening(String namaPemilik, double saldo) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void getNamaSaldo() {
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Saldo : Rp" + saldo);
    }

    public void setNama(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        System.out.println("Nama pemilik berubah menjadi " + namaPemilik);
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
