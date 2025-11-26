import java.util.Scanner;
public class Bank26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jumlah_tabungan_akhir;

        System.out.println("masukkan jumlah tabungan awal anda");
        jumlah_tabungan_awal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = input.nextInt();  

        bunga = jumlah_tabungan_awal * prosentase_bunga * lama_menabung;
        jumlah_tabungan_akhir = jumlah_tabungan_awal + bunga;

        System.out.println("bunga anda adalah :"+ bunga);
        System.out.println("jumlah tabungan akhir anda adalah :"+ jumlah_tabungan_akhir);

        input.close();

    }
}