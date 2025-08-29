public class PrakPBO 
{
    public static void main(String[] args) {
        String nama = "Bulan Hijarati Asy-Syiddah";
        final long NIM = 2407134878L;
        double[] ip = {3.81, 3.70};
        String alamat = "Perum. dwi tunggal arifin";
        int umur = 19;
        char golonganDarah = 'O';
        byte ipByte = (byte) ip[0];

        System.out.println("=======================================");
        System.out.println("           BIODATA MAHASISWA           ");
        System.out.println("=======================================");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + NIM);
        System.out.println("IP Semester 1   : " + ip[0]);
        System.out.println("IP Semester 2   : " + ipByte);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Umur            : " + umur);
        System.out.println("Golongan Darah  : " + golonganDarah);
        System.out.println("=======================================");
    }
}