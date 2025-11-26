import java.util.Scanner;


public class test2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan lama parkir");
        int lama_parkir = scanner.nextInt();
        
        System.err.println(lama_parkir);

        if ( lama_parkir <= 2 ) {
            System.out.println("Biaya parkir : 2000");
        } else {
            System.out.println("Biaya parkirs : " + (2000 + (lama_parkir - 2) * 1000));
        }
        scanner.close();    

    }
}
