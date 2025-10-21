import java.util.Scanner;
public class SiakadWhile26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.println("masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, silakan masukkan nilai antara 0 hingga 100.");
                continue;
            }
            
            if (nilai > 80 && nilai <= 100) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade C+");
            } else if (nilai > 50 && nilai <=60) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade C");
            } else if (nilai > 39 && nilai <=50) {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade D");
            } else {
                System.out.println("nilai mahasiswa ke-" + (i + 1) + " Grade E");
            }
            i++;
        }

        sc.close();
    }
}
