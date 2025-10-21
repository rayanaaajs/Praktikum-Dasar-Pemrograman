import java.util.Scanner;
public class KafeDoWhile26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelangan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("masukkan nama pelanggan (ketik 'batal'untuk keluar)");
            namaPelangan = sc.nextLine();
            if (namaPelangan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;

            }
            System.out.println("jumlah kopi");
            kopi = sc.nextInt();
            System.out.println("jumlah teh");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar : Rp" + totalHarga);
            sc.nextLine(); // membersihkan buffer
        } while (true);

        sc.close();
    }
}
