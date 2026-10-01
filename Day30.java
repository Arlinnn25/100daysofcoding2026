import java.util.Scanner;

public class Day30{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int b = scanner.nextInt();
        // Langsung cetak hasil perbandingan
        System.out.println("Apakah " + a + " <= " + b + " ? " + (a <= b));
        System.out.println("Apakah " + a + " >= " + b + " ? " + (a >= b));

        scanner.close();
    }
}
