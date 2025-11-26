import java.util.Scanner;
public class BiayaBensin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarakTempuh;
        int hargaBensinPerLiter = 10000;
        double konsumsiBensinPerKm ;
        double totalBiayaBensin;    

        System.out.println("masukkan jarak tempuh : ");
        jarakTempuh = input.nextInt();

        konsumsiBensinPerKm = 1.0/2.0;
        totalBiayaBensin = (jarakTempuh * konsumsiBensinPerKm * hargaBensinPerLiter);
        System.out.println("total biaya bensin adalah : " + totalBiayaBensin);
        input.close();


    }
}
