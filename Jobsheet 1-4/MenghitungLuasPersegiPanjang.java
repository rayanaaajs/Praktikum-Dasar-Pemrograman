import java.util.Scanner;
public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.println("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar : ");
        lebar = input.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah : " + luas);

        input.close();
    }
}

