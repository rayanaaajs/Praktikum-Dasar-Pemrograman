import java.util.Scanner;
public class CicilanMotor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hargaMotor;
        int uangMuka;
        double bunga = 0.01 ;
        double jmlBunga;
        int lamaCicilan;
        int sisaHarga;
        int cicilanPerBulan;

        System.out.println("masukkan harga motor : ");
        hargaMotor = input.nextInt();
        System.out.println("masukkan uang muka : ");
        uangMuka = input.nextInt();
        System.out.println("masukkan lama cicilan : ");
        lamaCicilan = input.nextInt();

        sisaHarga = hargaMotor - uangMuka;
        jmlBunga = bunga * sisaHarga ;
        cicilanPerBulan = ((int) (sisaHarga + jmlBunga) / lamaCicilan);


        System.out.println("jumlah cicila perbulan adalah : " + cicilanPerBulan);
        input.close();
       
       


    
    }
    
}
