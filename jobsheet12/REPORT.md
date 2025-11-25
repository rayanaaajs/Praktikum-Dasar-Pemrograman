**Nama:** Rayana Jaka Surya  
**Kelas:** TI/1C  
**Absen:** 26  
**NIM:** 254107020026

### 2.1 Percobaan 1: Membuat Fungsi Tanpa Parameter

**Pertanyaan**

1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

**Jawaban**

1. Tidak . Fungsi tanpa parameter dapat memiliki tipe kembalian (return type) lain seperti int, String, double, dll. Tipe void hanya digunakan jika fungsi tersebut tidak mengembalikan nilai apa pun setelah dieksekusi.
2. bisa, sudah saya modifikasi dengan memasukkan kode ke dalam main
3. Kode lebih rapi, lebih mudah dibaca, dan jika ingin mengubah menu cukup ubah di satu tempat.
4. Program mulai → masuk ke main → main memanggil Menu() → masuk ke fungsi Menu() → menu ditampilkan → kembali ke main.

**Pertanyaan**

1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

**Jawaban**

1. untuk menerima dari luar fungsi
2. Agar menu bisa menampilkan nama pelanggan dan menentukan status member.
3. tidak, parameter adalah variabel khusus untuk menerima input dari fungsi.
4. Jika true tampilkan info member atau diskon; jika false tidak ada diskon.
5. Error, karena fungsi membutuhkan parameter wajib.
6. ![image] (image/Kafe26.java.png).

