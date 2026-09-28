import java.util.Scanner;

public class IncrementDanDecrement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Mengambil input nilai awal
        System.out.print("Masukkan angka awal: ");
        int angka = input.nextInt();

        System.out.println("Nilai awal: " + angka);

        // 1. Increment (Penambahan 1)
        angka++;
        System.out.println("Setelah increment (angka++): " + angka);

        // 2. Decrement (Pengurangan 1)
        angka--;
        System.out.println("Setelah decrement (angka--): " + angka);

        input.close();
    }
}
