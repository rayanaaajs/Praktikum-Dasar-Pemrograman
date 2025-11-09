import java.util.Scanner;

public class cm1_new {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();
        
 
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble();
 
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();
        
        System.out.println("\n--- input nilai kehadiran dan etika---");
        System.out.print("Nilai Kehadiran : ");
        double kehadiran = input.nextDouble();
        System.out.print("Nilai Etika    : ");
        double etika = input.nextDouble();
 
        double nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        double nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        
 
        String nilaiHuruf1;

        if (nilaiAkhir1 > 80) {
            nilaiHuruf1 = "A";
        }else if (nilaiAkhir1 > 73) {
            nilaiHuruf1 = "B+";
        }else if (nilaiAkhir1 > 65) {
            nilaiHuruf1 = "B";
        }else if (nilaiAkhir1 > 60) {
            nilaiHuruf1 = "C+";
        }else if (nilaiAkhir1 > 50) {
            nilaiHuruf1 = "C+";
        }else if (nilaiAkhir1 > 39) {
            nilaiHuruf1 = "D";
        }
         else {
            nilaiHuruf1 = "E";
        }
        
        String nilaiHuruf2;

        if (nilaiAkhir2 > 80) {
            nilaiHuruf2 = "A";
        }else if (nilaiAkhir2 > 73) {
            nilaiHuruf2 = "B+";
        }else if (nilaiAkhir2 > 65) {
            nilaiHuruf2 = "B";
        }else if (nilaiAkhir2 > 60) {
            nilaiHuruf2 = "C+";
        }else if (nilaiAkhir2 > 50) {
            nilaiHuruf2 = "C+";
        }else if (nilaiAkhir2 > 39) {
            nilaiHuruf2 = "D";
        }
         else {
            nilaiHuruf2 = "E";
        }

        System.out.println("======================= HASIL PENILAIAN AKADEMIK =======================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Mata Kuliah                UTS  UAS    Tugas  Nilai Akhir     Nilai Huruf");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman      %.0f   %.0f     %.0f     %.2f            %s              %n", 
                        uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1 );
        System.out.printf("Struktur Data              %.0f   %.0f     %.0f     %.2f            %s             %n", 
                        uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2);
        
        System.out.printf("\nRata-rata Nilai Akhir: %.2f%n", rataRata);
        
        
        System.out.print("Status Semester      : ");
       if (kehadiran >= 75 && etika >= 70 && rataRata >= 60) {
            System.out.println("LULUS");
        } else if (kehadiran < 75 || etika < 70) {
            System.out.println("TIDAK LULUS (Kehadiran/Etika tidak memenuhi syarat)");
        } else {
            System.out.println("TIDAK LULUS (Rata-rata nilai akhir kurang dari 60)");
        }
        input.close();
    }
}