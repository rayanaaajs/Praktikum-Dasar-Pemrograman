import java.util.Scanner;//untuk mengimpor scanner dari library java
public class KuisPertama {//mendeklarasikan class bernama kuisPertama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//memanggil scannner untuk membaca input dari user

        int lamaLatian, beratBadan;//mendeklarasikan variabel dengan tipe data integer
        double koefisienBerlari = 0.05, koefisienBerenang = 0.04, koefisienBersepeda = 0.03;//mendeklarasikan variabel dengan tipe data double dan memasukan nilainya
        double kaloriBerlari, kaloriBersepeda,kaloriBerenang, kecepatanRataRata, ketinggianLokasi, totalKalori, rataRataKaloriPerMenit, persentaseTercapaiKaloriHarian;//mendeklarasikan variabel dengan tipe data double
        //berfungsi menerima inputan dari user
        System.out.print("Masukkan lama latihan (dalam menit) : ");
        lamaLatian = input.nextInt();
        System.out.print("Masukkan berat badan (dalam kg) : ");
        beratBadan = input.nextInt();
        System.out.print("Masukkan kecepatan rata-rata (dalam km/jam) : ");
        kecepatanRataRata = input.nextInt();
        System.out.print("Masukkan ketinggian lokasi (dalam meter) : ");
        ketinggianLokasi = input.nextInt();
        //rumus untuk menghitung kalori terbakar disetiap olahraga
        kaloriBerlari =  (lamaLatian * koefisienBerlari * beratBadan) + (kecepatanRataRata * 0.5) + (ketinggianLokasi * 0.01);
        kaloriBerenang = (lamaLatian * koefisienBerenang * beratBadan) + (kecepatanRataRata * 0.5) + (ketinggianLokasi * 0.01);
        kaloriBersepeda = (lamaLatian * koefisienBersepeda * beratBadan) + (kecepatanRataRata * 0.5) + (ketinggianLokasi * 0.01);
        //rumus untuk menghitung total kalori yang terbakar
        totalKalori = (kaloriBerlari + kaloriBerenang + kaloriBersepeda);//menjumlahkan semua kalori yang terbakar dari setiap olahraga
        //rumus untuk menghitung rata-rata kalori yang terbakar
        rataRataKaloriPerMenit = totalKalori / lamaLatian;//dibagi dengan lama latihan karena mencari rata2 kalori per menit
        //rumus untuk menghitung persentase tercapai kalori harian
         persentaseTercapaiKaloriHarian = (totalKalori / 2000) * 100;//2000 adalah target kalori harian dan dikali 100 untuk mengubah ke persen
        //menampilkan semua hasil perhitungan ke terminal
        System.out.println("Kalori yang terbakar saat berlari : " + kaloriBerlari);
        System.out.println("Kalori yang terbakar saat berenang : " + kaloriBerenang);
        System.out.println("Kalori yang terbakar saat bersepeda : " + kaloriBersepeda);
        System.out.println("Total kalori yang terbakar : " + totalKalori);
        System.out.println("Rata-rata kalori yang terbakar per menit : " + rataRataKaloriPerMenit);
        System.out.println("Persentase ketercapaian kalori harian : " + persentaseTercapaiKaloriHarian + "%");
        input.close();//menutup scannerq
    }
}
