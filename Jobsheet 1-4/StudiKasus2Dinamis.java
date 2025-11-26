import java.util.Scanner;
public class StudiKasus2Dinamis {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int lebarTanah, panjangTanah, jumlahKolam = 2, sisiKolam,  luasTanah, luasKolamPersegi;
    double diameterKolam, luasKolamLingkaran ,luasSeluruhKolam , luasTanahTersisa;
    
    System.out.println("masukkan lebar tanah :" );
    lebarTanah = input.nextInt();
    System.out.println("masukkan panjang tanah :");
    panjangTanah = input.nextInt();
    System.out.println("masukkan sisi kolam persegi :");
    sisiKolam = input.nextInt();
    System.out.println("masukkan diameter kolam lingkaran :");
    diameterKolam = input.nextInt();

    luasTanah = lebarTanah * panjangTanah;
    luasKolamLingkaran = 3.14 * diameterKolam * diameterKolam / 4 * jumlahKolam;
    luasKolamPersegi = sisiKolam * sisiKolam ;
    luasSeluruhKolam = luasKolamLingkaran + luasKolamPersegi;
    luasTanahTersisa = luasTanah - luasSeluruhKolam;

    System.out.println("luas tanah yang bisa ditanami rumput :" + luasTanahTersisa);


    input.close();

    }
    
}
