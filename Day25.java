import java.util.Scanner;

public class MenghitungLuasLingkaran {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double r, luas;
        final double PHI = 3.14159; // Menggunakan konstanta untuk nilai pi

        System.out.println("--- Program Hitung Luas Lingkaran ---");
        
        // untuk memasukkan nilai jari-jari
        System.out.print("Masukkan panjang jari-jari lingkaran (r): ");
        r = input.nextDouble();
        // Rumus luas lingkaran: L = pi * r * r
        luas = PHI * r * r;
        // Menampilkan hasil pemrosesan
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah: " + luas);
        // Menutup scanner untuk menghemat memori
        input.close();
    }
}
