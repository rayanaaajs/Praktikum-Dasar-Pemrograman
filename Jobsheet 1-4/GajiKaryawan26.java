import java.util.Scanner;
public class GajiKaryawan26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok;
        double bonus ;
        int totGaji;
        int tunjTransp = 600000;
        int tunjMakan = 400000;

        gajiPokok = input.nextInt();
        bonus   = 0.05 * gajiPokok;
         
        totGaji = (int)(gajiPokok + bonus + tunjTransp + tunjMakan - 0.1 * gajiPokok);
        System.out.println("bonus bulanan anda adalah : " + bonus);
        System.out.println("gaji yang anda terima adalah : " + totGaji);
        input.close();

    }
}
