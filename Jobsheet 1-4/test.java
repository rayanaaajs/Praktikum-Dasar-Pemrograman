  import java.util.Scanner;

  public class test {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int jumlah_tabungan_awal, Lama_menabung ;
        double bunga, persentase_bunga = 0.05, jumlah_tabungan_akhir;

        System.out.print("Masukkan jumlah tabungan awal : ");
        jumlah_tabungan_awal = input.nextInt();
        System.out.print("Masukkan lama menabung : ");
        Lama_menabung = input.nextInt();

        bunga = jumlah_tabungan_awal * persentase_bunga * (Lama_menabung/12.0);
        jumlah_tabungan_akhir = jumlah_tabungan_awal + bunga;


        System.out.println("jumlah bunga : " + bunga);
        System.out.println("Jumlah tabungan akhir : " + jumlah_tabungan_akhir);
        input.close();
        }
    }