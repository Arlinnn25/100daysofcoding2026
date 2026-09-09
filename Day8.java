public class DeklarasiInisialisasiUpdateVariabel {
    public static void main(String[] args) {
        
        // 1. DEKLARASI: Membuat tempat di memori (tipe data + nama)
        int skor; 
        
        // 2. INISIALISASI: Memberikan nilai pertama kali
        skor = 57; 
        System.out.println("Skor awal: " + skor); // Output: 57

        // *Bisa juga deklarasi & inisialisasi langsung dalam 1 baris:
        String player = "Arlinnn"; 
        
        // 3. UPDATE: Mengubah nilai yang sudah ada dengan nilai baru
        skor = 89;       // Nilai diganti menjadi 89
        skor = skor + 5; // Nilai ditambah 5 dari nilai sebelumnya (89 + 5)
        
        System.out.println("Player: " + player);
        System.out.println("Skor terbaru: " + skor); // Output: 94
    }
}
