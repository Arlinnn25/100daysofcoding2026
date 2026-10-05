import java.util.Scanner;

public class Day34{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Mahasiswa: ");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Nilai D");
        }

        input.close();
    }
}
