import java.util.Scanner;
public class Segitiga26 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  
    
    int alas, tinggi;
    double luas;

    System.out.println("masukkan alas :" );
    alas = scanner.nextInt();
    System.out.println("masukkan tinggi :" );
    tinggi = scanner.nextInt();


    luas =  alas * tinggi / 2;

    System.out.println( "luas segitiga adalah : " + luas);
    scanner.close();
 }
}