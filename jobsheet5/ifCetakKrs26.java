import java.util.Scanner;

public class ifCetakKrs26 {
  public static void main(String[] args) {
    
  } {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("---Cetak KRS---");
    System.out.println("apakah ukt anda sudah lunas? (true/false)");
    boolean uktLunas = sc.nextBoolean();

    if (uktLunas) {
      System.out.println("pembayaran ukt terverifikasi");
    } else {
      System.out.println("silahkan cetak krs dan minta tanda tangan dpa");

      
    }
    sc.close();
    
  }   
}
