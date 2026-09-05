package model;

/**
 * Kelas GenreBuku merepresentasikan kategori genre dari buku di perpustakaan.
 */
public class GenreBuku {
    // 1. Atribut Enkapsulasi (private)
    private String kodeGenre;
    private String namaGenre;

    // 2. Konstruktor untuk inisialisasi objek
    public GenreBuku(String kodeGenre, String namaGenre) {
        this.kodeGenre = kodeGenre;
        this.namaGenre = namaGenre;
    }

    // 3. Getter untuk membaca nilai atribut
    public String getKodeGenre() {
        return kodeGenre;
    }

    public String getNamaGenre() {
        return namaGenre;
    }

    // 4. Method pembantu untuk menampilkan deskripsi singkat genre
    public void tampilkanDetail() {
        System.out.println("Kode Genre : " + kodeGenre + " | Nama: " + namaGenre);
    }
}
