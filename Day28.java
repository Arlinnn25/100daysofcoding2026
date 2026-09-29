import java.util.Scanner;

public class Day28{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Mengambil input dari keyboard
        System.out.print("Masukkan angka ke-1: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan angka ke-2: ");
        int b = input.nextInt();
        // Menampilkan hasil perbandingan langsung (true / false)
        System.out.println("\nApakah a sama dengan b (a == b)? " + (a == b));
        System.out.println("Apakah a tidak sama dengan b (a != b)? " + (a != b));

        input.close();
    }
}
