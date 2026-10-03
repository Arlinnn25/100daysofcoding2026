import java.util.Scanner;

public class Day32{
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan nilai Pertama: ");
      int a = input.nextInt();

      System.out.print("Masukkan nilai Kedua: ");
      int b = input.nextInt();

      // Kombinasi beberapa operator
      boolean hasil1 = (a >= 75) && (b >= 75);
      boolean hasil2 = (a > b) || (a == b);
      boolean hasil3 = (a != b) && !(a < 60);
      
      System.out.println("\n=== HASIL ===");
      System.out.println(" a >= 75 AND b >= 75 : " + hasil1);
      System.out.println(" a > b OR a == b : " + hasil2);
      System.out.println(" a != b AND NOT a < 60 : " + hasil3);

      input.close();
    }
}
