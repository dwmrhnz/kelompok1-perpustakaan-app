# Sistem Informasi Perpustakaan (Kelompok 1)

Repositori ini memuat tugas pemodelan dan implementasi Pemrograman Berorientasi Objek (PBO) berbasis Java yang memodelkan relasi antara **GenreBuku**, **Buku**, dan **Member** pada sistem informasi perpustakaan.

---

## 👥 Anggota Kelompok

| No | Nama Anggota | Pembagian Tugas / Modul |
| :---: | :--- | :--- |
| 1 | **Dawam Raihan Zufar** | (`Main.java`) |
| 2 | **Vezilatun Nisa** | (`GenreBuku.java`) |
| 3 | **Muhammad Faqih Husnan** | (`Buku.java`) |
| 4 | **Muhammad Ramdhan Maulana** |  (`Member.java`) |
| 5 | **Ludmilla Riza Maharuni** dan **Cinta Asih Salaamina**| Perancangan UML Class Diagram, Penulis Laporan Utama, Dokumentasi Output Terminal |


---

## 📂 Struktur Direktori

```text
kelompok1-perpustakaan-app/
├── bin/                       # Direktori hasil kompilasi bytecode (.class)
├── docs/                      # Berkas UML Class Diagram dan Laporan PDF
│   └── laporan.pdf
├── lib/                       # Eksternal library (jika ada)
├── src/                       # Kode sumber (Source code Java)
│   ├── Main.java              # Entry-point eksekusi program
│   └── model/                 # Package model entitas
│       ├── Buku.java
│       ├── GenreBuku.java
│       └── Member.java
├── .gitignore
└── README.md
```

## 🔗 Analisis Relasi Antar-Kelas

1. **GenreBuku — Buku (Asosiasi Satu ke Banyak / 1 ke 0..*)**
   * Setiap objek `GenreBuku` dapat mengelompokkan nol atau banyak objek `Buku`.
   * Objek `Buku` menyimpan satu referensi objek genre melalui atribut `private GenreBuku genre`.

2. **Member — Buku (Asosiasi Banyak ke Banyak / 0.. ke 0..)**
   * Seorang `Member` dapat meminjam lebih dari satu objek `Buku` yang ditampung secara dinamis ke dalam koleksi `List<Buku>`.
   * Kelas `Member` mengelola ketersediaan koleksi dengan mengubah status ketersediaan `isTersedia` pada kelas `Buku` secara langsung melalui transaksi `pinjamBuku()` dan `kembalikanBuku()`.

---

## 🛠️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK 17+) sudah terpasang pada komputer lokal Anda.

1. **Clone repositori**:
   ```bash
   git clone [https://github.com/dwmrhnz/kelompok1-perpustakaan-app.git](https://github.com/dwmrhnz/kelompok1-perpustakaan-app.git)
   cd kelompok1-perpustakaan-app
   ```
2. **Kompilasi kode program**:
    ```bash
    javac -d bin src/model/*.java src/Main.java
    ```
3. **Jalankan Aplikasi**
    ```bash
    java -cp bin Main
    ```