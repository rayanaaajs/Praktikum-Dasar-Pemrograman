import java.util.Scanner;
public class StudiKasus1Dinamis {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int gajiPokok, tunjanganPerAnak, jumlahAnak;
        double danaPensiun = 0.05 ;
     
        System.out.print("Masukkan gaji pokok : ");
        gajiPokok = input.nextInt();
        System.out.print("Masukkan tunjangan per anak : ");
        tunjanganPerAnak = input.nextInt();
        System.out.print("Masukkan jumlah anak : ");
        jumlahAnak = input.nextInt();


        int tunjangan = tunjanganPerAnak * jumlahAnak;
        int gajiKotor = gajiPokok + tunjangan;
        double potonganPensiun = gajiPokok * danaPensiun;
        double gajiBersih = gajiKotor - potonganPensiun;

        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Gaji Kotor : " + gajiKotor);
        System.out.println("Potongan Dana Pensiun : " + potonganPensiun);
        System.out.println("Gaji Bersih : " + gajiBersih);

        input.close();
        
      
    }
}
