import java.util.Scanner;

public class Day29{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Mengambil input dua angka bertipe data integer
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        // Menampilkan hasil perbandingan langsung yang menghasilkan true/false
        System.out.println("Apakah a < b? " + (a < b));
        System.out.println("Apakah a > b? " + (a > b));

        input.close();
    }
}
