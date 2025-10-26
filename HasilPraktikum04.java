import java.util.Scanner;

public class HasilPraktikum04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- IF - ELSE ---");
        System.out.print("Masukkan nilai : ");
        int nilai1 = input.nextInt();

        if (nilai1 > 75) {
            System.out.println("Anda lulus ujian");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }

        System.out.println("--- IF - ELSE IF - ELSE ---");
        System.out.print("Masukkan nilai: ");
        int nilai2 = input.nextInt();

        if (nilai2 > 75) {
            System.out.println("Anda lulus ujian");
        } else if (nilai2 > 65) {
            System.out.println("Nilai anda berada di ambang batas kelulusan");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }

        input.nextLine();
        System.out.println("--- SWITCH CASE ---");
        System.out.print("Masukkan warna (RGB): ");
        String warna = input.nextLine();

        switch (warna) {
            case "R":
                System.out.println("Anda memilih warna Merah");
                break;
            case "G":
                System.out.println("Anda memilih warna Hijau");
                break;
            case "B":
                System.out.println("Anda memilih warna Biru");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        }

        System.out.println("--- NESTED IF ---");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.print("Bilangan bernilai positif ");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        } else if (angka == 0) {
            System.out.println("Bilangan bernilai netral");
        } else {
            System.out.print("Bilangan bernilai negatif ");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        }

        System.out.println("--- FOR LOOP ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        System.out.println(); 

        String[] mahasiswa = {"Andi", "Budi", "Citra", "Dewi", "Eko"};
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + mahasiswa[i]);
        }

        System.out.println("--- WHILE LOOP (Contoh 1) ---");
        int a = 1;
        while (a <= 5) {
            System.out.println("While Loop ke-" + a);
            a++;
        }

        System.out.println("--- WHILE LOOP (Contoh 2) ---");
        input.nextLine(); 
        String password = "";
        while (!password.equals("java123")) {
            System.out.print("Masukkan password: ");
            password = input.nextLine();
        }
        System.out.println("Login berhasil!");

        System.out.println("--- DO WHILE LOOP ---");
        int x = 6;
        do {
            System.out.println("Do While Loop ke-" + x);
            x++;
        } while (x <= 5);

        System.out.println("--- NESTED LOOP ---");
        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(kursi + "" + j + " ");
            }
            System.out.println();
            kursi++;
        }

        System.out.println("--- BREAK ---");
        for (int d = 1; d <= 10; d++) {
            System.out.println("Angka: " + d);
            if (d == 5) {
                break;
            }
        }

        System.out.println("--- CONTINUE ---");
        for (int e = 1; e <= 10; e++) {
            if (e % 2 == 0) {
                continue;
            }
            System.out.println("Bilangan ganjil : " + e);
        }
    }

}