package jobsheet13;
import java.util.Scanner;
public class percobaan3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("jumlah saldo awal :");
       double saldoAwal = sc.nextDouble();
       System.out.println("lamanya Investasi(tahun)");
       int tahun = sc.nextInt(); 

       System.out.println("jumlah saldo setelah" + tahun + "tahun");
       System.out.println(hitungLaba(saldoAwal, tahun));
        sc.close();
    }

    static double hitungLaba(double saldo, int tahun ) {
        if (tahun == 0 ) {
            return(saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1) );
        }
    }
}
