package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Member merepresentasikan anggota perpustakaan yang dapat meminjam buku.
 */
public class Member {
    // 1. Atribut Enkapsulasi (private)
    private String idMember;
    private String nama;
    private List<Buku> daftarPinjaman; // Relasi Asosiasi (Satu Member dapat meminjam Banyak Buku)

    // 2. Konstruktor
    public Member(String idMember, String nama) {
        this.idMember = idMember;
        this.nama = nama;
        this.daftarPinjaman = new ArrayList<>(); // Inisialisasi list kosong
    }

    // 3. Method Operasi Transaksi Peminjaman
    public void pinjamBuku(Buku buku) {
        if (buku.isTersedia()) {
            daftarPinjaman.add(buku);
            buku.setTersedia(false); // Mengubah status buku menjadi tidak tersedia
            System.out.println(nama + " berhasil meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Gagal meminjam! Buku '" + buku.getJudul() + "' sedang dipinjam orang lain.");
        }
    }

    // 4. Method Operasi Transaksi Pengembalian
    public void kembalikanBuku(Buku buku) {
        if (daftarPinjaman.contains(buku)) {
            daftarPinjaman.remove(buku);
            buku.setTersedia(true); // Mengembalikan status buku menjadi tersedia
            System.out.println(nama + " berhasil mengembalikan buku: " + buku.getJudul());
        } else {
            System.out.println(nama + " tidak sedang meminjam buku '" + buku.getJudul() + "'.");
        }
    }

    // 5. Method Menampilkan Daftar Pinjaman
    public void tampilkanBukuPinjaman() {
        System.out.println("Daftar Buku Pinjaman - " + nama + " (" + idMember + "):");
        if (daftarPinjaman.isEmpty()) {
            System.out.println("  (Tidak ada buku yang sedang dipinjam)");
        } else {
            for (Buku b : daftarPinjaman) {
                System.out.println("  - " + b.getJudul() + " [" + b.getGenre().getNamaGenre() + "]");
            }
        }
        System.out.println();
    }

    // 6. Getter
    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }
}

