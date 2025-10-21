import java.util.Scanner;
public class Tugas1Looping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalHarga, hargaTiket = 50000, totalTiketTerjual = 0;
        double totalPenjualan = 0;

        System.out.println("masukkan jumlah pelanggan hari ini: ");
        int jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan;) {
            System.out.println("masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            jumlahTiket = sc.nextInt();

           if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak boleh negatif! Silakan input ulang.");
                continue; 
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.1;
            } else if (jumlahTiket > 10 ){
                totalHarga -= totalHarga * 0.15;
            }
            
            totalPenjualan += totalHarga;
            totalTiketTerjual += jumlahTiket;

            System.out.println("Total yang harus dibayar pelanggan ke-" + i + ": Rp" + totalHarga);
            i++;
        }

        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}