package jobsheet9;
import java.util.Scanner;

public class SearchNilai {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("masukkan banyaknya nilai yang akan diinput:");
    int n = sc.nextInt();
    
    int [] arrNilai = new int[n];
    int hasil = 0;
    
    for (int i = 0; i < arrNilai.length; i++) {
        System.out.print("masukkan nilai ke-"+ i +": ");
        arrNilai[i] = sc.nextInt();
    }
        System.out.print("masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();
        
    for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }


    if (hasil != 0) {
        System.out.println("nilai " + key + " ketemu ,merupakan nilai mahasiswa ke-" + hasil);
    } else {
        System.out.println("nilai yang dicari tidak ditemukan");
    }

        sc.close();
    }
}
