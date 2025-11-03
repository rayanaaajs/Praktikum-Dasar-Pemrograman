import java.util.Scanner;
public class NilaiKelompok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j = 1, nilai, TertinggiKelompok=0;
        float totalNilai = 0, rataNilai = 0, tertinggiRata = 0;

        while (i <=  6) {
            System.out.println("Kelompok " + i);
        
            for (j = 1; j <= 5; j++) {
                System.out.print("nilai dari kelompok penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

        rataNilai = totalNilai / 5;
         System.out.println("kelompok " + i + " nilai rata-rata: " + rataNilai);
         if (rataNilai > tertinggiRata){
                tertinggiRata = rataNilai;
                TertinggiKelompok = i;

        }
        i++;
    }
            System.out.println("kelompok dengan nilai rata-rata tertinggi adalah kelompok " + TertinggiKelompok + " dengan nilai rata-rata " + tertinggiRata);
        

        sc.close();
    }
}
