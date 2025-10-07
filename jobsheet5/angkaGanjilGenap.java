import java.util.Scanner;

public class angkaGanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
        sc.close();
    }
    
}