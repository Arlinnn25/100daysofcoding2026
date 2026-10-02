import java.util.Scanner;

public class Day31{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = input.nextInt();

        System.out.println("\n--- HASIL ---");
        
        //Operator AND(&&): True jika angka antara 1 dan 10
        System.out.println("Apakah 1 <= a <= 10 (AND)? " + ((a >= 1) && (a <= 10)));

        //Operator OR(||): True jika angka di bawah 0 atau di atas 100
        System.out.println("Apakah a < 0 atau x > 100 (OR)? " + ((a < 0) || (a > 100)));

        //Operator NOT(!): Membalikkan kondisi (True jika angka TIDAK sama dengan 9)
        System.out.println("Apakah a BUKAN 5 (NOT)? " + (!(a == 9)));

        input.close();
    }
}
