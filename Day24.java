import java.util.Scanner;

public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        // Membuat variabel
        int panjang, lebar, luas;
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Luas Persegi Panjang ===");
        // Meminta input panjang
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        // Meminta input lebar
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();
        // Menghitung luas (rumus: panjang x lebar)
        luas = panjang * lebar;
        // Menampilkan hasil
        System.out.println("Luas Persegi Panjang adalah: " + luas);
    }
}
