import java.util.Scanner;

public class KodePpt {
    public static void main(String[] args) {
        // OPERATOR
        // operator aritmatika
        int a = 10, b = 3;
        boolean c = true, d = false;
        System.out.println("a + b : " + (a + b));
        System.out.println("a - b : " + (a - b));
        System.out.println("a * b : " + (a * b));
        System.out.println("a / b : " + (a / b));
        System.out.println("a % b : " + (a % b));

        // increment dan decrement
        System.out.println("++a : " + (++a));
        System.out.println("b-- : " + (b--));

        // operator perbandingan
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // operator logika
        System.out.println("c && d : " + (c && d));
        System.out.println("c || d : " + (c || d));
        System.out.println("!c : " + (!c));

        // Short circuit evaluation

        // operator assignment
        a += 5;
        a -= 3;
        a *= 2;
        a /= 4;
        a %= 4;
        System.out.println("Hasil akhir : " + a);

        // operator ternary
        String grade = (a >= 8) ? "A" : (a >= 7) ? "B" : "C";
        System.out.println("Nilai : " + grade);

        // penggunaan untuk mencari nilai maksimum
        int max = (10 >= 5) ? 10 : 5;
        System.out.println("Maximum : " + max);

        // operator bitwise
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("-a : " + (-a));
        System.out.println("a << 2 : " + (a << 2));
        System.out.println("a >> 2 : " + (a >> 2));

        // INPUT OUTPUT
        // output
        System.out.println("Hello World!");
        System.out.println("Baris Kedua");
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        String nama = "Nakata";
        int umur = 20;
        double tinggi = 50.5;

        System.out.printf("Nama : %s, Umur : %d, Tinggi : %.1f cm%n", nama, umur, tinggi);

        // input
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama : ");
        String nama2 = sc.nextLine();

        System.out.println("Masukkan umur : ");
        int umur2 = sc.nextInt();

        System.out.println("Masukkan tinggi badan : ");
        double tinggi2 = sc.nextDouble();

        System.out.printf("Nama : %s, Umur : %d, Tinggi Badan : %.1f", nama2, umur2, tinggi2);

        // CLASS WRAPPER
        // autoboxing - primitif ke wrapper
        int primitiveInt = 100;
        Integer wrappedInt = primitiveInt;

        Integer wrappedInt2 = 200;
        int primitiveInt2 = wrappedInt2;

        // string ke wrapper dan sebaliknya
        String strNumber = "123";
        String strDouble = "45.67";
        String strBoolean = "true";

        int num = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDouble);
        boolean flag = Boolean.parseBoolean(strBoolean);

        System.out.println("Parsed int : " + num);
        System.out.println("Parsed double : " + decimal);
        System.out.println("Parsed boolean : " + flag);

        Integer wrappedNum = Integer.valueOf(strNumber);
        Double wrappedDecimal = Double.valueOf(strDouble);

        int value = 789;
        String strValue1 = Integer.toString(value);
        String strValue2 = String.valueOf(value);

        System.out.println("toString() : " + strValue1);        
        System.out.println("valueOf() : " + strValue2);

        // method ada wrapper class
        System.out.println("Max Integer : " + Integer.MAX_VALUE);
        System.out.println("Min Integer : " + Integer.MIN_VALUE);

        // konversi sistem bilangan
        int decimal2 = 255;
        System.out.println("Binary : " + Integer.toBinaryString(decimal2));
        System.out.println("Octal : " + Integer.toOctalString(decimal2));
        System.out.println("Hex : " + Integer.toHexString(decimal2));

        // ENUMERASI
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }

        Hari hariIni = Hari.SENIN;

        if(hariIni == Hari.SENIN) {
            System.out.println("Hari ini adalah Senin!");
            System.out.println("Besok adalah hari " + Hari.SELASA);
        }
    }
}