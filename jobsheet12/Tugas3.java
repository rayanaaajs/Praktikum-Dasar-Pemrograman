package jobsheet12;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        
        int[][] data = input();
        output(data);
    }

    static void output(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println(x[i][j] +"\t");
            }
        }
    }

    static int [][] input(){
        int [][] hasil = new int[5][7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                hasil[i][j] = sc.nextInt();
            }
        }

        sc.close();
        
        return hasil;
        
    }
}
