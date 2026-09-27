import java.util.Scanner;

public class soal3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Membaca dua input bilangan bulat
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Proses penukaran nilai tanpa variabel tambahan (menggunakan operator aritmatika)
        a = a + b;
        b = a - b;
        a = a - b;
        // Menampilkan hasil output yang telah ditukar
        System.out.println(a);
        System.out.println(b);

        scanner.close();
    }
}
