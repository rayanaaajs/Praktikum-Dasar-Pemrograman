# Data Mahasiswa

- **Nama:** Rayana Jaka Surya  
- **Kelas:** TI/1C  
- **Absen:** 26  
- **NIM:** 254107020026


### Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS

**Pertanyaan**

1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE!
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”

**Jawaban**

1. Karena variabel yang dicek sudah bertipe boolean (true/false)
2. hasil outputnya kosong/tidak menampilkan apapun
3. sudah saya tambahkan else statement dan ketika user memilih false maka akan muncul tulisan yang berbeda dengan true
4. sudah saya commit dan push ke github

### Percobaan 2: SWITCH-CASE untuk Mencetak KRS

**Pertanyaan**

1. Apa fungsi dari sintaks break?
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”

**Jawaban**

1. break berfungsi untuk mengehentikan program saat case sudah terpenuhi
2. default berfungsi menangani kondisi ketika case tidak ada yang terpenuhi atau tidak ada yang cocok
3. sudah saya tambahkan else statement dan ketika user memilih false maka akan muncul tulisan yang berbeda dengan true
4. sudah saya commit dan push ke github

### Percobaan 3: Nested IF untuk Mengecek Syarat Ujian Skripsi

**Pertanyaan**

1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut! `if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {`
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!

**Jawaban**

1. Mahasiswa akan mendapat output "Gagal! Mahasiswa masih memiliki tanggungan kompen", Karena mahasiswa belum bebas kompen, maka program tidak perlu memeriksa jumlah bimbingan
2. default berfungsi menangani kondisi ketika case tidak ada yang terpenuhi atau tidak ada yang cocok
3. pertama program menanyakan apakah mahasiswa sudah bebas kompen, jika ya maka lanjut memeriksa jumlah bimbingan, jika tidak langsung menampilkan pesan gagal. selanjutnya program memeriksa jumlah bimbingan jika semua syarat terpenuhi mahasiswa boleh mendaftar ujian skripsi, jika tidak memenuhi semua syarat program lanjut ke pengecekan berikutnya Jika P1 < 8 dan P2 < 4 maka akan tampil "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali". Jika hanya P1 < 8 maka akan tampil "Gagal! Log bimbingan P1 belum mencapai 8 kali". dan jika hanya P2 < 4 maka akan tampil "Gagal! Log bimbingan P2 belum mencapai 4 kali". Terakhir hasil pengecekan disimpan dalam variabel pesan dan akan menghasilkan output.
