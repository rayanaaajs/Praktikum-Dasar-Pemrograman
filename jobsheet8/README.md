**Nama:** Rayana Jaka Surya  
**Kelas:** TI/1C  
**Absen:** 26  
**NIM:** 254107020026

### 2.1 Percobaan 1: Review Perulangan 1

**Pertanyaan**

1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya?
   Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk
   outputnya jika input n = 5? Mengapa hasilnya berbeda?
3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya?
   Mengapa bisa demikian?
4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya?
   Mengapa bisa demikian?
5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola
   outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?

**Jawaban**

1. Perulangan akan terjadi n + 1 kali. Jika input n=5, maka akan tercetak 6 bintang (******). karena angka 0 tetap dihitung sebagai inisialisasi awal jadi i dimulai dari 0
2. Akan tercetak 4 bintang (****). Perulangan akan berhenti ketika i mencapai nilai 4, karena kondisi i harus dibawah 5
3. Perulangan (loop) tidak akan dieksekusi sama sekali. Program akan selesai tanpa mencetak bintang satu pun. karena ketika n diisi nilai positif maka 
4. sudah saya commit dan push ke github

### 2.2 Percobaan 2: Bintang Persegi

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

### 2.3 Percobaan 3: Bintang Segitiga

**Pertanyaan**

1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut! `if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {`
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!

**Jawaban**

1. Mahasiswa akan mendapat output "Gagal! Mahasiswa masih memiliki tanggungan kompen", Karena mahasiswa belum bebas kompen, maka program tidak perlu memeriksa jumlah bimbingan
2. default berfungsi menangani kondisi ketika case tidak ada yang terpenuhi atau tidak ada yang cocok
3. pertama program menanyakan apakah mahasiswa sudah bebas kompen, jika ya maka lanjut memeriksa jumlah bimbingan, jika tidak langsung menampilkan pesan gagal. selanjutnya program memeriksa jumlah bimbingan jika semua syarat terpenuhi mahasiswa boleh mendaftar ujian skripsi, jika tidak memenuhi semua syarat program lanjut ke pengecekan berikutnya Jika P1 < 8 dan P2 < 4 maka akan tampil "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali". Jika hanya P1 < 8 maka akan tampil "Gagal! Log bimbingan P1 belum mencapai 8 kali". dan jika hanya P2 < 4 maka akan tampil "Gagal! Log bimbingan P2 belum mencapai 4 kali". Terakhir hasil pengecekan disimpan dalam variabel pesan dan akan menghasilkan output.


2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

**Pertanyaan**

**Jawaban**