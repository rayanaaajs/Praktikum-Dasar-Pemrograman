**Nama:** Rayana Jaka Surya  
**Kelas:** TI/1C  
**Absen:** 26  
**NIM:** 254107020026

## percobaan 2.1

Soal:

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
   Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
   terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!

```
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
```

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
   mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
   Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
   dan terendah!
5. Commit dan push kode program ke Github

Jawab:

1.  inisialisasi (Initialization): int i = 1.
    kondisi (Condition): i <= 10.
    Update/Increment: i++.
2.  Variabel tertinggi dimulai dari 0 dan terendah dari 100 agar nilai pertama dari mahasiswa dan yang berikutnya bisa mengganti nilai awal itu, sehingga menjadi patokan tertinggi dan terendah sesuai dengan data nilai yang tersedia. Jika dibalik (tertinggi = 100, terendah = 0), maka program mungkin hanya menunjukkan tertinggi = 100 dan terendah = 0 meski tidak ada nilai mahasiswa yang mencapai angka itu, karena batas maksimum tertinggi dan minimum terendah sudah mencapai nilai ekstrem, jadi perlu dibalik supaya nilai tertinggi dan terendah mahasiswa bisa disesuaikan ulang dengan data yang ada.
3.  Kode tersebut berguna untuk memperbarui nilai tertinggi atau terendah. Jadi, bila ada nilai baru yang dimasukkan dan lebih besar dari tertinggi sekarang, maka tertinggi akan diganti dengan nilai itu. Begitu juga jika ada nilai baru yang lebih kecil dari terendah saat ini, maka terendah akan diperbarui dengan nilai terbaru.
4.  sudah dan sesuai dengan apa yang saya commit dengan menambahkan code:

```
if (nilai > 60){
    lulus+=1;
}else {
    tidaklulus+=1;
}
```

5. sudah

## Percobaan 2.2

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:

```
 if (nilai < 0 || nilai > 100){
    System.out.println("Nilai Tidak Valid. Masukan nilai yang valid!");
    continue;
}
```

a. nilai < 0 || nilai > 100
b. continue 2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE? 3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan? 4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"! 5. Commit dan push kode program ke Github

jawab:

1. Maksud Sintaks:

- nilai < 0 || nilai > 100: Ini merupakan kondisi IF untuk memvalidasi input nilai. Program memeriksa apakah nilai yang dimasukkan pengguna berada di luar rentang yang sah (kurang dari 0 ATAU lebih dari 100).
- continue: Instruksi ini menghentikan eksekusi kode saat ini dan memaksa loop untuk langsung kembali ke awal (ke pengecekan kondisi while selanjutnya). Hal ini membuat kode sisanya (seperti pengecekan huruf nilai dan i++) dilewati.

2. i++ ditempatkan di akhir agar penghitung mahasiswa hanya bertambah setelah nilai yang dimasukkan terbukti valid. Jika diletakkan di awal, i akan langsung naik ke 1 (melewati "mahasiswa ke-1"), dan jika input tidak valid, continue akan melompat ke mahasiswa berikutnya (misalnya dari ke-2 ke ke-3) tanpa mengulangi input untuk mahasiswa ke-2 yang invalid.
3. Jumlah Perulangan jika jml = 19 maka Perulangan akan tetap berjalan sebanyak 19 kali. Ini karena i dimulai dari 0 dan kondisi while (i < 19) akan benar untuk i = 0, 1, 2, ..., 18 (total 19 kali, termasuk 0).
4. sudah dengan menambahkan code

```
System.out.println("Bagus, pertahankan nilai nya!");
```

setelah code

```
if (nilai > 80 && nilai <= 100) {
    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
```

5. sudah

## Percobaan 2.3

pertanyaan:

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
   adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
   inisialisasi dan update?

jawab:

1. Perulangan akan dilakukan sekali karena do-while mengeksekusi blok kode terlebih dahulu (terlepas dari benar atau salah) sebelum memeriksa kondisi. Karena "batal" membuat kondisi true, while terpenuhi dan program berhenti.
2. Saat nama pelanggan diisi "batal", ini membuat if menjadi true dan menjalankan break, sehingga perulangan langsung berhenti.
3. Fungsinya untuk membuat loop tak terbatas (infinite loop). Ini menyebabkan perulangan terus berlangsung hingga kondisi penghentian manual (yaitu break) di dalam blok do tercapai.
4. Perulangan tetap berjalan karena kondisi while selalu true (tidak pernah false), yang mengakibatkan loop berjalan tanpa henti (infinite loop) dan tidak bergantung pada penghitung seperti i++ yang berhenti saat kondisi terpenuhi.
