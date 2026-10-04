import java.util.Scanner;

public class Day33{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        // Kondisi pengecekan KTP
        if (umur >= 17) {
            System.out.println("Sudah memiliki KTP");
        } else {
            System.out.println("Belum memiliki KTP");
        }

        // Menutup objek scanner
        input.close();
    }
  }
