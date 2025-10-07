import java.util.Scanner;

public class ifCetakKrs26 {
  public static void main(String[] args) {
    
   {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("---Cetak KRS---");
    System.out.println("apakah ukt anda sudah lunas? (true/false)");
    boolean uktLunas = sc.nextBoolean();

    System.out.println(uktLunas ? "pembayaran ukt terverifikasi\nsilahkan cetak krs dan minta tanda tangan dpa" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
  
    sc.close();
    
  }   
}
}
