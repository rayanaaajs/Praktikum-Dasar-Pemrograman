**Nama:** Rayana Jaka Surya  
**Kelas:** TI/1C  
**Absen:** 26  
**NIM:** 254107020026

### 2.1 Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

**Pertanyaan**

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2. Mengapa terdapat null pada daftar nama penonton?
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut:
   penonton[0][0] = "Amin";
   penonton[0][1] = "Bena";
   penonton[1][0] = "Candra";
   penonton[1][1] = "Dela";
   penonton[2][0] = "Eka";
   penonton[2][1] = "Farhan";
   penonton[3][0] = "Gisel";
   penonton[3][1] = "Hana";
4. Tambahkan kode program sebagai berikut:
   System.out.println(penonton.length);
   System.out.println(penonton[0].length);
   System.out.println(penonton[1].length);
   System.out.println(penonton[2].length);
   System.out.println(penonton[3].length);

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

1. sudah saya modif
2. sudah dengan memanggil variable yang menerima input jumlah mahasiswa dari user dan memanggil nama variabel ke dalam array

### 2.4 Percobaan 4: Searching

**Pertanyaan**

1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut:

**Jawaban**

1. statement break berfungsi menghentikan proses perulangan setelah nilai yang dicari ditemukan dalam array
2. sudah dan saya commit dengan nama modifikasi search nilai
3.
