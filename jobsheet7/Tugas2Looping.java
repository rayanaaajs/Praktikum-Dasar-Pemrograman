import java.util.Scanner;
public class Tugas2Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan, durasiParkir, totalHarga = 0;

          do {
             System.out.print("Masukan jenis kendaraan (1.mobil 2. Motor 0. keluar): ");
             jenisKendaraan = sc.nextInt();
                if (jenisKendaraan==1||jenisKendaraan==2){
                System.out.print("Masukan Durasi parkir anda: ");
                durasiParkir = sc.nextInt();
                if (durasiParkir>=5){
                    totalHarga+=12500;
                }else if (jenisKendaraan==1){
                    totalHarga+=durasiParkir*3000;
                }else if (jenisKendaraan==2){
                    totalHarga+=durasiParkir*2000;
                }
                System.out.println("Harga parkir yang harus dibayarkan: "+totalHarga);
            } 
        } while(jenisKendaraan!=0);

        sc.close();
    }
}
