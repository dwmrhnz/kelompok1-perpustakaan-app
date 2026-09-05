package model;

/**
 * Kelas Buku merepresentasikan entitas buku perpustakaan
 * yang terhubung dengan GenreBuku.
 */
public class Buku {
    // 1. Atribut Enkapsulasi (private)
    private String idBuku;
    private String judul;
    private GenreBuku genre;      // Relasi Asosiasi ke kelas GenreBuku
    private boolean isTersedia;

    // 2. Konstruktor
    public Buku(String idBuku, String judul, GenreBuku genre) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.genre = genre;
        this.isTersedia = true;   // Default selalu tersedia saat buku baru ditambahkan
    }

    // 3. Getter dan Setter
    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public GenreBuku getGenre() {
        return genre;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setTersedia(boolean isTersedia) {
        this.isTersedia = isTersedia;
    }

    // 4. Method Operasi Informasi
    public void tampilkanInfo() {
        String status = isTersedia ? "Tersedia" : "Sedang Dipinjam";
        System.out.println("[" + idBuku + "] " + judul + " | Genre: " + genre.getNamaGenre() + " | Status: " + status);
    }
}
