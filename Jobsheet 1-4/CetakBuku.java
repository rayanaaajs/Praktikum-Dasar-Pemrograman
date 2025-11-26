import java.util.Scanner;
public class CetakBuku {
 public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int biayaCetakPerHalaman = 200, biayaJilid = 20000, beratKertas = 3, beratSampul = 250, beratKemasan = 300, biayaPengirimanPerKg = 15000;
    int jumlahHalaman, totalBiayaCetak, beratTotal, biayaTotal;

    System.out.println("Masukkan jumlah halaman buku: ");
    jumlahHalaman = scanner.nextInt();

    totalBiayaCetak = jumlahHalaman * biayaCetakPerHalaman + biayaJilid;
    beratTotal = (jumlahHalaman/2)* beratKertas + beratSampul + beratKemasan;
    biayaTotal = totalBiayaCetak + (beratTotal * biayaPengirimanPerKg/1000);
    System.out.println("Total biaya cetak buku adalah: " + biayaTotal);
    scanner.close();


 }
    
}