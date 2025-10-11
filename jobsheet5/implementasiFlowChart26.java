import java.util.Scanner;

public class implementasiFlowChart26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nama pengguna (dosen/mahasiswa)");
        String namaPengguna = input.nextLine();

        if (namaPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");  
        } 
            else if (namaPengguna.equalsIgnoreCase("mahasiswa")) {
                System.out.println("masukkan jumlah SKS");
                int jumlahSKS = input.nextInt();

                if (jumlahSKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
                }
            }
        else {
            System.out.println("Akses ditolak");
        }

                
        input.close();
    }

 }
    
