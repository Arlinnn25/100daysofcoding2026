import java.util.Scanner;

public class KonversiOtomatis {
    public static void main(String[] args) {
        //Membuat objek Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KONVERSI OTOMATIS ===");
        //Mengambil input bertipe byte (angka bulat terkecil)
        System.out.print("Masukkan angka bulat kecil (nilai -128 sampai 127): ");
        byte dataByte = input.nextByte();
        //Mengambil input bertipe char (karakter)
        System.out.print("Masukkan satu karakter teks: ");
        char dataChar = input.next().charAt(0);
        System.out.println("\n--- PROSES KONVERSI OTOMATIS ---");
        //Konversi otomatis dari byte ke short
        short dataShort = dataByte;
        System.out.println("1. byte ke short : " + dataShort);
        //Konversi otomatis dari char ke int (mengambil nilai ASCII)
        int charKeInt = dataChar;
        System.out.println("2. char ke int   : '" + dataChar + "' menjadi nilai ASCII -> " + charKeInt);
        //Konversi otomatis dari short ke int
        int dataInt = dataShort;
        System.out.println("3. short ke int  : " + dataInt);
        //Konversi otomatis dari int ke long
        long dataLong = dataInt;
        System.out.println("4. int ke long   : " + dataLong);
        //Konversi otomatis dari long ke float (berubah jadi desimal)
        float dataFloat = dataLong;
        System.out.println("5. long ke float : " + dataFloat);
        //Konversi otomatis dari float ke double (desimal presisi tinggi)
        double dataDouble = dataFloat;
        System.out.println("6. float ke double: " + dataDouble);
        //Menutup objek Scanner untuk menghemat memori
        input.close();
    }
}
