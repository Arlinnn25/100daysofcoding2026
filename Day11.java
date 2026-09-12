// Mengimpor library Scanner untuk membaca input dari pengguna
import java.util.Scanner;

public class PengenalanScanner {
    public static void main(String[] args) {
        // Membuat objek Scanner baru bernama 'input' untuk menerima masukan dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Menampilkan teks petunjuk untuk memasukkan nilai panjang
        System.out.print("Panjang : ");
        int panjang = input.nextInt();
        
        // Menampilkan teks petunjuk untuk memasukkan nilai lebar
        System.out.print("Lebar : ");
        int lebar = input.nextInt();
        
        // Menghitung luas persegi panjang dengan rumus: panjang dikali lebar
        int luas = panjang * lebar;
        
        // Menampilkan kembali nilai panjang dan lebar yang sudah dimasukkan serta menampilkan hasil perhitungan
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }
}

