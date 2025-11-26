import java.util.Scanner;
public class MenghitungTotalBayar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double harga;
        double jumlah_bayar;
        double potongan;
        double diskon = 0.15;
    
        harga = sc.nextDouble();
        potongan = diskon * harga;
        jumlah_bayar = harga - potongan;

        System.out.println("Jumlah bayar = " + jumlah_bayar);
    
        sc.close();
    }
}
