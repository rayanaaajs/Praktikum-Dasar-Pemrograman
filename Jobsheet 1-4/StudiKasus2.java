public class StudiKasus2 {
    public static void main(String[] args) {
     int lebarTanah = 50, panjangTanah = 100 , jumlahKolam = 2, sisiKolam = 2,  luasTanah, luasKolamPersegi;
     double diameterKolam = 2, luasKolamLingkaran ,luasSeluruhKolam , luasTanahTersisa;

     luasTanah = lebarTanah * panjangTanah;
     luasKolamLingkaran = 3.14 * diameterKolam * diameterKolam / 4 * jumlahKolam;
     luasKolamPersegi = sisiKolam * sisiKolam ;
     luasSeluruhKolam = luasKolamLingkaran + luasKolamPersegi;
     luasTanahTersisa = luasTanah - luasSeluruhKolam;

     System.out.println("luas tanah yang bisa ditanami rumput :" + luasTanahTersisa);


     
    
    }
}
