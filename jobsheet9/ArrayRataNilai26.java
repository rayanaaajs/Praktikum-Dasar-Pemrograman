package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int jmlMhsw = sc.nextInt();

        int [] nilaiMhsw = new int [jmlMhsw];
        double total = 0;
        double rata2;
        
        for (int i = 0; i < nilaiMhsw.length; i++){
            System.out.println("masukkan nilai mahasiswa ke-"+ i +":");
            nilaiMhsw[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhsw.length; i++){
            total = total + nilaiMhsw[i];
        }

        for (int i = 0; i < nilaiMhsw.length; i++){
             if (nilaiMhsw[i] > 70)
                System.out.println("nilai mahasiswa ke-"+ i + " lulus");
        }
        
        rata2 = total / nilaiMhsw.length;
        System.out.println("rata-rata nilai = "+ rata2);

        sc.close();
    }
}
