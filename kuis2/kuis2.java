package kuis2;
import java.util.Scanner;

public class kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("masukkan jumlah wilayah");
        int jumlahWilayah = sc.nextInt();

        double[][] dataAir = new double[jumlahWilayah][hari.length];
        double[] totalPerWilayah = new double[jumlahWilayah];
        double[] totalPerHari = new double[hari.length];

// Input data konsumsi air
        for (int i = 0; i < jumlahWilayah; i++) {
            System.out.println("Data untuk Wilayah ke-" + (i + 1) + ":");
            
            for (int j = 0; j < hari.length; j++) {
                System.out.print("Hari " + hari[j] + ": ");
                dataAir[i][j] = sc.nextDouble();    
                
                totalPerWilayah[i] += dataAir[i][j];
                totalPerHari[j] += dataAir[i][j];
            }
        }

//mencari wilayah dan hari dengan konsumsi tertinggi
        int wilayahTertinggi = 0;
        double maxKonsumsiWilayah = totalPerWilayah[0];
        
        for (int i = 1; i < jumlahWilayah; i++) {
            if (totalPerWilayah[i] > maxKonsumsiWilayah) {
                maxKonsumsiWilayah = totalPerWilayah[i];
                wilayahTertinggi = i;
            }
        }
        
        int indexHariTertinggi = 0;
        double maxKonsumsiHari = totalPerHari[0];
        
        for (int j = 1; j < 7; j++) {
            if (totalPerHari[j] > maxKonsumsiHari) {
                maxKonsumsiHari = totalPerHari[j];
                indexHariTertinggi = j;
            }
        }

        System.out.println("=========================================================");
        System.out.println("       laporan pemantauan konsumsi air bersih      ");
        System.out.println("=========================================================");

        System.out.println("Total Konsumsi Per Wilayah:");
        double Total = 0;
        for (int i = 0; i < jumlahWilayah; i++) {
            System.out.println("Wilayah " + (i + 1) + ": " + totalPerWilayah[i] + " M3");
            Total += totalPerWilayah[i];
        }

        double rataRataHarian = Total / 7; 
        System.out.println("Rata rata konsumsi air harian: " + rataRataHarian + " M3");
        System.out.println("Wilayah dengan konsumsi tertinggi : Wilayah " + (wilayahTertinggi + 1));
        System.out.println("Hari dengan konsumsi paling tingi   : " + hari[indexHariTertinggi]);

        sc.close();

    }
}
