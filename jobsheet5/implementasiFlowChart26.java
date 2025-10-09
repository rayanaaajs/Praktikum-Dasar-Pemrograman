import java.util.Scanner;
public class implementasiFlowChart26 {

public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    String bawaKTM, regisOnline;

    System.out.println("Apakah anda membawa KTM? (ya/tidak)");
    bawaKTM = input.nextLine();
    System.out.println("Apakah anda registrasi online? (ya/tidak)");
    regisOnline = input.nextLine();


    if (bawaKTM.equalsIgnoreCase("ya") || regisOnline.equalsIgnoreCase("ya")) {
        System.out.println("Boleh masuk");
    } else {
        System.out.println("Tidak boleh masuk");
    }
       
    input.close();
}
    
}