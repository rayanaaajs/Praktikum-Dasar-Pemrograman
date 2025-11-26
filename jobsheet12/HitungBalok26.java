package jobsheet12;
import java.util.Scanner;

public class HitungBalok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, Luas, volume;
        
        System.out.println("masaukkan panjang");
        p = sc.nextInt();
        System.out.println("masaukkan lebar");
        l = sc.nextInt();
        System.out.println("masaukkan tinggi");
        t = sc.nextInt();

        Luas = hitungLuas(p, l);
        System.out.println("luas persegi panjang yaitu = " + Luas);
        volume = hitungVolume(p, l, t);
        System.out.println("Volume balok yaitu ="+ volume);

        sc.close();
    }

    static int hitungLuas (int panjang, int lebar){
        int L = panjang * lebar;
        return L;
    }

    static int hitungVolume (int panjang, int lebar, int tinggi){
        int V = panjang * lebar * tinggi;
        return V; 
    }
}   
