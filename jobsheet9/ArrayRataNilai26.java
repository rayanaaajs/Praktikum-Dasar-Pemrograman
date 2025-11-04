package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiMhsw = new int [10];
        double total = 0;
        double rata2;
        
        for (int i = 0; i < nilaiMhsw.length; i++){
            System.out.println("masukkan nilai mahasiswa ke-"+ (i+1)+":");
            nilaiMhsw[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhsw.length; i++){
            total += nilaiMhsw[i];
        }

        rata2 = total / nilaiMhsw.length;
        System.out.println("rata-rata nilai ="+ rata2);

        sc.close();
    }
}
