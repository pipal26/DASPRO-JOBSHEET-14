1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case”
dan “recursion call”!
Base Case (Kondisi Berhenti): Adalah blok kode di dalam if yang menghentikan rekursi saat tahun bernilai 0.
Recursion Call (Pemanggilan Rekursif): Adalah blok kode di dalam else di mana fungsi memanggil dirinya sendiri dengan parameter tahun yang dikurangi 1.
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika
diberikan nilai hitungLaba(100000,3)
Fase Ekspansi
1. hitungLaba(100000, 3)
   - Cek: tahun (3) != 0
   - Stack: Menunggu hasil dari 1.11 * hitungLaba(100000, 2)

2. hitungLaba(100000, 2)
   - Cek: tahun (2) != 0
   - Stack: Menunggu hasil dari 1.11 * hitungLaba(100000, 1)

3. hitungLaba(100000, 1)
   - Cek: tahun (1) != 0
   - Stack: Menunggu hasil dari 1.11 * hitungLaba(100000, 0)

4. hitungLaba(100000, 0)
   - Cek: tahun (0) == 0 (Base Case Terpenuhi)
   - Aksi: Mengembalikan nilai saldo (100000).

Fase Subtitusi
1. Kembali ke tahun = 1
   - Menerima nilai 100000 dari base case.
   - Hitung: 1.11 * 100000
   - Hasil sementara: 111000

2. Kembali ke tahun = 2
   - Menerima nilai 111000.
   - Hitung: 1.11 * 111000
   - Hasil sementara: 123210

3. Kembali ke tahun = 3 (Pemanggil Awal)
   - Menerima nilai 123210.
   - Hitung: 1.11 * 123210
   - Hasil Akhir: 136763.1