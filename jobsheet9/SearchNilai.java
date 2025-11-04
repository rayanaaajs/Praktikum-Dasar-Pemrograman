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


        System.out.println();
        System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();

        sc.close();
    }
}
