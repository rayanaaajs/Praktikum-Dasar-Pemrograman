package jobsheet12;

// public class Kafe26 {
//     public static void main(String[] args) {

//             System.out.println("==== MENU RESTO KAFE ====");
//             System.out.println("1. Kopi Hitam - 15,000");
//             System.out.println("2. capucino - 20,000");
//             System.out.println("3. latte - 22,000");
//             System.out.println("4. teh tarik - 12,000");
//             System.out.println("5. roti bakar - 10,000");
//             System.out.println("6. mie goreng - 18,000");
//             System.out.println("=========================");
//             System.out.println("silahkan pilih menu yang anda inginkan");
//         }
//     }
//     //     public static void Menu() {
//     //         // System.out.println("==== MENU RESTO KAFE ====");
//     //         // System.out.println("1. Kopi Hitam - 15,000");
//     //         // System.out.println("2. capucino - 20,000");
//     //         // System.out.println("3. latte - 22,000");
//     //         // System.out.println("4. teh tarik - 12,000");
//     //         // System.out.println("5. roti bakar - 10,000");
//     //         // System.out.println("6. mie goreng - 18,000");
//     //         // System.out.println("=========================");
//     //         // System.out.println("silahkan pilih menu yang anda inginkan");
//     //     }
//     // }

// public class Kafe26 {

//     public static void main(String[] args) {
//         Menu("Andi", true, "DISKON40");
//     }

//     public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
//         System.out.println("selamat datang " + namaPelanggan + "!");

//         if (isMember) {
//             System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
//         }

//         if (kodePromo.equalsIgnoreCase("DISKON50") ) {
//             System.out.println("diskon 50%");
//         } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
//             System.out.println("Diskon 30%");
//         }else
//             System.out.println("kode invalid");
        


//             System.out.println("==== MENU RESTO KAFE ====");
//             System.out.println("1. Kopi Hitam - 15,000");
//             System.out.println("2. capucino - 20,000");
//             System.out.println("3. latte - 22,000");
//             System.out.println("4. teh tarik - 12,000");
//             System.out.println("5. roti bakar - 10,000");
//             System.out.println("6. mie goreng - 18,000");
//             System.out.println("=========================");
//             System.out.println("silahkan pilih menu yang anda inginkan");
        
//     }

// }
import java.util.Scanner;
public class Kafe26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nomor menu yang ingin anda pesan");
        int pilihanMenu = sc.nextInt();
        System.out.println("masukkan jumlah item");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.println("masukkan kode promo");
        String kodePromo = sc.nextLine();

        double[] total = HitungTotalHarga26(pilihanMenu, banyakItem, kodePromo);
        double totalHarga = total[0];
        double jumlahDiskon = total[1];


        System.out.println("Total Harga = " + totalHarga);
        System.out.println("jumlah diskon = " +jumlahDiskon );
        
        sc.close();
    }

    public static double[] HitungTotalHarga26 (int pilihanMenu, int banyakItem, String kodePromo ) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        double diskon = 0.0;
        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.3;
        }else{
            System.out.println("kode promo invalid");
        }
        

        double jumlahDiskon = hargaItems [pilihanMenu - 1] * banyakItem * diskon;

        double hargaTotal = hargaItems [pilihanMenu - 1] * banyakItem - jumlahDiskon;



        return new double[] {hargaTotal, jumlahDiskon};
        
            


    }
    
}
