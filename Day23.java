import java.util.Scanner;

public class MenghitungLuasPersegi {
    public static void main(String[] args) {
        // Membuat variabel untuk sisi dan luas
        int sisi, luas;
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        // Meminta pengguna memasukkan nilai sisi
        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = input.nextInt();
        // Menghitung luas persegi (sisi x sisi)
        luas = sisi * sisi;
        // Menampilkan hasil perhitungan
        System.out.println("Luas persegi adalah: " + luas);
    }
}
