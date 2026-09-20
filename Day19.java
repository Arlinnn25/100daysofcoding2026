import java.util.Scanner;

public class KonversiManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Mengambil input dari tipe data terbesar
        System.out.print("Masukkan angka desimal besar (double): ");
        double angkaDouble = input.nextDouble();
        // 2. Melakukan konversi manual / paksa secara langsung
        float angkaFloat = (float) angkaDouble;
        long angkaLong   = (long) angkaDouble;
        int angkaInt     = (int) angkaDouble;
        short angkaShort = (short) angkaDouble;
        byte angkaByte   = (byte) angkaDouble;
        char angkaChar   = (char) angkaDouble;
        // 3. Menampilkan semua hasil konversi paksa
        System.out.println("=====HASIL KONVERSI PAKSA=====");
        System.out.println("Asli (double):" + angkaDouble);
        System.out.println("Ke float     :" + angkaFloat);
        System.out.println("Ke long      :" + angkaLong);
        System.out.println("Ke int       :" + angkaInt);
        System.out.println("Ke short     :" + angkaShort);
        System.out.println("Ke byte      :" + angkaByte);
        System.out.println("Ke char      :" + angkaChar + " (Karakter ASCII)");

        input.close();
    }
}
