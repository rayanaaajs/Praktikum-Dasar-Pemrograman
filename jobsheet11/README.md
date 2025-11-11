**Nama:** Rayana Jaka Surya  
**Kelas:** TI/1C  
**Absen:** 26  
**NIM:** 254107020026

### 2.1 Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

**Pertanyaan**

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2. Mengapa terdapat null pada daftar nama penonton?
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut:
   `penonton[0][0] = "Amin"; penonton[0][1] = "Bena";penonton[1][0] = "Candra";penonton[1][1] = "Dela";penonton[2][0] = "Eka" penonton[2][1] = "Farhan";,penonton[3][0] = "Gisel"; penonton[3][1] = "Hana";`
4. Tambahkan kode program sebagai berikut:
   `System.out.println(penonton.length) ;System.out.println(penonton[0].length); System.out.println(penonton[1].length); System.out.println(penonton[2].length); System.out.println(penonton[3].length);`
   Jelaskan fungsi dari penonton.length dan penonton[0].length!
   Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris
   pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3
   menggunakan for loop. Compile, run, lalu amati hasilnya.
8. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3
   menggunakan for loop. Compile, run, lalu amati hasilnya.
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama
   penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for
    loop?
11. Berapa indeks baris maksimal untuk array penonton?
12. Berapa indeks kolom maksimal untuk array penonton?
13. Apa fungsi dari String.join()?

**Jawaban**

1. tidak, kita bisa mengisi elemen array pada indeks manapun selama masih dalam ukuran array
2. karena pada baris ketiga dan kolom ke 1 belum diisi dan karena array bertipe string jadi java menjadikan null(belum terdefinsi) sebagai default
3. sudah
4. penonton.length menunjukkan jumlah baris pada array, penonton[0].length menunjukkan jumlah kolom pada baris ke-0
   Ya, semuanya sama, karena setiap baris memiliki jumlah kolom yang sama
5. x 

### 2.2 Percobaan 2: Memanfaatkan Scanner dan Perulangan untuk Input dan Output pada Array 2 Dimensi

**Pertanyaan**

1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai
   dari indeks ke-0? Jelaskan!
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:

- Menu 1: Input data penonton
- Menu 2: Tampilkan daftar penonton
- Menu 3: Exit

3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang
   tidak tersedia
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang
   dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan
   baris dan kolom kembali
5. Pada menu 2, jika kursi kosong, ganti null dengan \*\*\*

**Jawaban**

### 2.3 Percobaan 3: Array 2 Dimensi dengan Length Baris Berbeda

**Pertanyaan**

1. Tambahkan kode program sebagai berikut
2. Apa fungsi dari Arrays.toString()?
3. Apa nilai default untuk elemen pada array dengan tipe data int?
4. Tambahkan kode program berikut
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang
   array dapat dimodifikasi setelah diinstansiasi?

**Jawaban**

### 2.4 Percobaan 4: Studi Kasus SIAKAD

**Pertanyaan**

1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi
   kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah
   yang dinamis.

**Jawaban**
