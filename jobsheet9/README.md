**Nama:** Rayana Jaka Surya  
**Kelas:** TI/1C  
**Absen:** 26  
**NIM:** 254107020026

### 2.1 Percobaan 1: Mengisi Elemen Array

**Pertanyaan**

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut: `for (int i=0; i<4; i++) { System.out.println(bil[i]);}`
   Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

**Jawaban**

1. program akan error atau tidak bisa dijalankan, karena ada angka yang tidak sesuai dengan variable array tersebut menggunakan int sedangkan angka yang saya ubah bertipe float/double
2. sudah hasilnya seperti ini : `int bil [] = {5, 13, -7, 17};`
3. outputnya sama for pada program diatas menunjukkan perulangan pada variabel array agar menampikan perulangan sebanyak 3 kali pada array.
4. program akan error saat mencari array indeks ke 4 karena panjang array hanya sampai 3.

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Meminta Inputan

**Pertanyaan**

1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: ```for (int i=0; i < nilaiAkhir.length; i++) { System.out.print("Masukkan nilai akhir ke-"+i+" : "); nilaiAkhir[i] = sc.nextInt();}`
   Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
2. Apa yang dimaksud dengan kondisi: `i < nilaiAkhir.length?`
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): `for (int i=0; i < nilaiAkhir.length; i++){if (nilaiAkhir[i] > 70) {System.outprintln("Mahasiswa ke-"+i+" lulus!");}}`
   Jalankan program dan jelaskan alur program!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

**Jawaban**

1. tidak berubah, hasil outputnya tetap sama, karena kedua program tersebut akan tetap meminta input sebanyak 10 kali
2. i < nilaiAkhir.length yaitu kondisi ketika nilai i masih kurang dari jumlah elemen array nilaiAkhir, akan terus mengulangi perintah dalam loop
3. perulangan pada program diatas memeriksa setiap nilai dalam array, jika nilai lebih dari 70 maka akan dianggap lulus
4. sudah dengan menambahkan else pada if statment.

### 2.3 Percobaan 3: Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Aritmatika terhadap Elemen Array

**Pertanyaan**

1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (> 70).
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:

**Jawaban**

### 2.4 Percobaan 4: Searching

**Pertanyaan**

1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut:

**Jawaban**
