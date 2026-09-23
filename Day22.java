import java.util.Scanner;

public class MenukarNilaiDuaVariabel {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai pertama
        System.out.print("Masukkan nilai variabel pertama (A): ");
        int a = scanner.nextInt();
        // Meminta input nilai kedua
        System.out.print("Masukkan nilai variabel kedua (B): ");
        int b = scanner.nextInt();

        // Menampilkan nilai sebelum ditukar
        System.out.println("\n--- Sebelum Ditukar ---");
        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);

        // Proses penukaran nilai menggunakan variabel sementara (temp)
        int temp = a; // Simpan nilai A sementara
        a = b;        // Ubah nilai A menjadi nilai B
        b = temp;     // Ubah nilai B menjadi nilai A yang tersimpan di temp
 
        // Menampilkan nilai setelah ditukar
        System.out.println("\n--- Setelah Ditukar ---");
        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);
        // Menutup scanner
        scanner.close();
    }
}
