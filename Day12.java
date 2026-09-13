import java.util.Scanner; // Mengimpor class Scanner dari library Java untuk menerima input 
public class BiodataSederhana {
    public static void main(String[] args) {
        // Membuat objek Scanner baru bernama 'inputdata' untuk membaca input dari keyboard
        Scanner inputdata = new Scanner(System.in);
        // Mendeklarasikan variabel bertipe String untuk menyimpan data teks
        String nama, nim, kelas, jurusan;

        // Proses input data Nama Mahasiswa
        System.out.print("Nama Mahasiswa : ");
        nama = inputdata.nextLine();
        // Proses input data NIM
        System.out.print("Nim            : ");
        nim = inputdata.nextLine();
        // Proses input data Kelas
        System.out.print("Kelas          : ");
        kelas = inputdata.nextLine();
        // Proses input data Jurusan
        System.out.print("Jurusan        : ");
        jurusan = inputdata.nextLine(); // Membaca input teks dari dan menyimpannya ke variabel
        // Menampilkan baris kosong sebagai jarak/pembatas di console
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // Menampilkan header atau bingkai atas untuk tampilan Biodata
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%       Biodata Mahasiswa      %%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");      
        // Menampilkan hasil data yang sudah diinput sebelumnya
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nim            : " + nim);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Jurusan        : " + jurusan);
        // Menampilkan bingkai bawah dan ucapan penutup
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%          Terimakasih         %%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
