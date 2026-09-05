public class TipeDataNumerikBilanganBulat {
    public static void main(String[] args) {
        // 1. Tipe Data byte (Rentang kecil, hemat memori)
        byte umur = 19;
        System.out.println("Umur: " + umur);

        // 2. Tipe Data short (Rentang sedang)
        short tahunKelahiran = 2006;
        System.out.println("Tahun Kelahiran: " + tahunKelahiran);

        // 3. Tipe Data int (Paling sering digunakan untuk bilangan bulat)
        int hargaBarang = 1500000;
        System.out.println("Harga Barang: Rp" + hargaBarang);

        // 4. Tipe Data long (Untuk angka yang sangat besar, akhiri dengan huruf L)
        long pendudukDunia = 8271026104L; 
        System.out.println("Perkiraan Penduduk Dunia: " + pendudukDunia);
        
        // Contoh error jika melebihi batas (Overflow)
        // byte angkaSalah = 130; // Ini akan error karena batas maks byte adalah 127
    }
}
