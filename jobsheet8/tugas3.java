import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grandTotalPelanggan = 0;
        int grandTotalItem = 0;

    
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        System.out.println("== Input Penjualan Per Cabang ==");

      
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("Cabang " + i);


            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0; 

            
            for (int j = 1; j <= jumlahPelanggan; j++) {
               
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }

            
            System.out.println("Cabang " + i + ":");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItemCabang);
            System.out.println();

          
            grandTotalPelanggan += jumlahPelanggan;
            grandTotalItem += totalItemCabang;
        }

        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + grandTotalPelanggan + " orang");
        System.out.println("Item terjual: " + grandTotalItem + " item");
        
        sc.close();
    }
}