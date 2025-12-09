package jobsheet13;
import java.util.Scanner;
public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.println("pangkat: ");
        int pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));

        sc.close();
    }

    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
}
