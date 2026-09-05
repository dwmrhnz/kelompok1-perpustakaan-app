import model.GenreBuku;
import model.Buku;
import model.Member;

/**
 * Kelas Main berfungsi sebagai runner program untuk menguji
 * seluruh fungsionalitas dan relasi antar-kelas pada aplikasi perpustakaan.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("    SISTEM INFORMASI PERPUSTAKAAN (SI-PERPUS)    ");
        System.out.println("=================================================\n");

        // 1. Inisialisasi Objek Kategori Genre (Modul Veren)
        GenreBuku g1 = new GenreBuku("G01", "Teknologi & Komputer");
        GenreBuku g2 = new GenreBuku("G02", "Sains Fiksi");

        // 2. Inisialisasi Objek Buku yang berelasi dengan Genre (Modul Faqih)
        Buku b1 = new Buku("BK01", "Pemrograman Berorientasi Objek dengan Java", g1);
        Buku b2 = new Buku("BK02", "Struktur Data & Algoritma", g1);
        Buku b3 = new Buku("BK03", "Dune: Bagian Pertama", g2);

        // Menampilkan data katalog buku awal
        System.out.println("--- DAFTAR KATALOG BUKU PERPUSTAKAAN ---");
        b1.tampilkanInfo();
        b2.tampilkanInfo();
        b3.tampilkanInfo();
        System.out.println();

        // 3. Inisialisasi Objek Member Perpustakaan (Modul Ramdhan)
        Member m1 = new Member("M01", "Dawam Raihan");
        Member m2 = new Member("M02", "Siti Aminah");

        // 4. Simulasi Transaksi Peminjaman Buku
        System.out.println("--- SIMULASI PEMINJAMAN BUKU ---");
        m1.pinjamBuku(b1); // Berhasil dipinjam oleh Dawam
        m1.pinjamBuku(b2); // Berhasil dipinjam oleh Dawam
        m2.pinjamBuku(b1); // Gagal: Buku BK01 sedang dipinjam oleh Dawam
        System.out.println();

        // 5. Menampilkan Buku yang Sedang Dipinjam per Member
        System.out.println("--- DAFTAR PINJAMAN AKTIF SETIAP MEMBER ---");
        m1.tampilkanBukuPinjaman();
        m2.tampilkanBukuPinjaman();

        // 6. Simulasi Pengembalian Buku & Peminjaman Ulang
        System.out.println("--- SIMULASI PENGEMBALIAN & PINJAM ULANG ---");
        m1.kembalikanBuku(b1); // Dawam mengembalikan buku BK01
        m2.pinjamBuku(b1);     // Sekarang Siti bisa meminjam buku BK01
        System.out.println();

        // 7. Status Akhir Buku Pinjaman
        System.out.println("--- STATUS AKHIR PINJAMAN MEMBER ---");
        m1.tampilkanBukuPinjaman();
        m2.tampilkanBukuPinjaman();

        // 8. Status Akhir Katalog Buku
        System.out.println("--- STATUS AKHIR KATALOG BUKU ---");
        b1.tampilkanInfo();
        b2.tampilkanInfo();
        b3.tampilkanInfo();
    }
}