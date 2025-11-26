package jobsheet12;

public class Pengunjungkafe26 {
    public static void main(String[] args) {
        daftarPengunjung("samsul", "budi", "amba");
        daftarPengunjung("andi");
        daftarPengunjung("wagito", "goji", "dapit");
        daftarPengunjung("");
    }
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("daftar nama Pengunjung:");
        for (String n : namaPengunjung) {
            System.out.println("-" + n);
        }
    }
}
