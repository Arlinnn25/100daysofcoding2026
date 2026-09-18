import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        // Mengambil input nilai awal dari pengguna
        System.out.print("Masukkan nilai awal (angka): ");
        int nilai = input.nextInt();
        System.out.println("Nilai awal Anda = " + nilai);
        System.out.println("---------------------------------");

        // 1. Operator Penugasan Dasar (=)
        // Sudah digunakan saat memasukkan nilai ke variabel 'nilai' di atas

        // 2. Operator Penugasan Penjumlahan (+=)
        System.out.print("Masukkan angka untuk ditambahkan (+=): ");
        int tambah = input.nextInt();
        nilai += tambah; // Sama dengan: nilai = nilai + tambah
        System.out.println("Hasil setelah (+=) : " + nilai);

        // 3. Operator Penugasan Pengurangan (-=)
        System.out.print("Masukkan angka untuk dikurangi (-=): ");
        int kurang = input.nextInt();
        nilai -= kurang; // Sama dengan: nilai = nilai - kurang
        System.out.println("Hasil setelah (-=) : " + nilai);

        // 4. Operator Penugasan Perkalian (*=)
        System.out.print("Masukkan angka untuk dikali (*=): ");
        int kali = input.nextInt();
        nilai *= kali; // Sama dengan: nilai = nilai * kali
        System.out.println("Hasil setelah (*=) : " + nilai);

        // 5. Operator Penugasan Pembagian (/=)
        System.out.print("Masukkan angka untuk dibagi (/=): ");
        int bagi = input.nextInt();
        if (bagi != 0) {
            nilai /= bagi; // Sama dengan: nilai = nilai / bagi
            System.out.println("Hasil setelah (/=) : " + nilai);
        } else {
            System.out.println("Pembagian dengan nol tidak bsa dilakukan.");
        }

        // 6. Operator Penugasan Sisa Bagi / Modulo (%=)
        System.out.print("Masukkan angka untuk sisa bagi (%=): ");
        int modulo = input.nextInt();
        if (modulo != 0) {
            nilai %= modulo; // Sama dengan: nilai = nilai % modulo
            System.out.println("Hasil akhir setelah (%=): " + nilai);
        } else {
            System.out.println("Modulo dengan nol tidak bisa dilakukan.");
        }

        // Menutup scanner
        input.close();
        System.out.println("---------------------------------");
        System.out.println("Program Selesai.");
    }
}
