// **Nama:** Rayana Jaka Surya  
// **Kelas:** TI/1C  
// **Absen:** 26  
// **NIM:** 254107020026

import java.util.Scanner;

public class StudiKasus {
    // Baris = Jumlah Mahasiswa, Kolom = data (Nama, NIM, Prodi, Perusahaan, Semester, Status)
    static String[][] dataMagang = new String[100][6]; 
    static int jumlahData = 0; // untuk menghitung berapa data yang sudah terisi
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        do {
            tampilkanMenu();
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    cariData();
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println();
        } while (menu != 5);
    }

    // Fungsi menampilkan menu
    static void tampilkanMenu() {
        System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu 1-5: ");
    }

    // fungsi menambah data
    static void tambahData() {
        System.out.println("\n--- Tambah Data Magang ---");
        
        System.out.print("Nama Mahasiswa: ");
        dataMagang[jumlahData][0] = sc.nextLine();

        System.out.print("NIM: ");
        dataMagang[jumlahData][1] = sc.nextLine();

        System.out.print("Program Studi: ");
        dataMagang[jumlahData][2] = sc.nextLine();

        System.out.print("Perusahaan Tujuan Magang: ");
        dataMagang[jumlahData][3] = sc.nextLine();

        int semesterInput;
        boolean validasiSemester = false;
        do {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semesterInput = sc.nextInt();
            if (semesterInput == 6 || semesterInput == 7) {
                validasiSemester = true;
                dataMagang[jumlahData][4] = String.valueOf(semesterInput);//mengubah int ke string
            } else {
                System.out.println("Input salah! Semester hanya boleh 6 atau 7.");
            }
        } while (validasiSemester == false);

        
        String statusInput;
        boolean validasiStatus = false;
        do {
            System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
            statusInput = sc.nextLine();
            if (statusInput.equalsIgnoreCase("Diterima") || 
                statusInput.equalsIgnoreCase("Menunggu") || 
                statusInput.equalsIgnoreCase("Ditolak")) {
                
                String statusFix = statusInput;
                dataMagang[jumlahData][5] = statusFix;
                validasiStatus = true;
            } else {
                System.out.println("Input salah! Status harus 'Diterima', 'Menunggu', atau 'Ditolak'.");
            }
        } while (validasiStatus == false);

        jumlahData++; 
        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahData);

        
    }

    //fungsi menampilkan semua data
    static void tampilData() {
        System.out.println("\n--- Data Pendaftar Magang ---");
        if (jumlahData == 0) {
            System.out.println("Belum ada pendaftar.");
        } else {
            //heading tabel
            System.out.printf("%-4s %-20s %-15s %-25s %-20s %-15s %-10s\n", 
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");
            System.out.println("==============================================================================================================");
            
        
        //mengulang baris data mhsw
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-4d ", (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.printf("%-20s",dataMagang[i][j]);
            }
            System.out.println();
            }
        }
    }

    //fungsi mencari data
    static void cariData() {
        System.out.println("\n--- Cari Pendaftar berdasarkan Program Studi ---");
        System.out.print("Masukkan Program Studi: ");
        String kataKunci = sc.nextLine();
        
        

        System.out.printf("%-4s %-20s %-15s %-25s %-20s %-15s %-10s\n"
                        , "No", "Nama", "NIM", "Prodi", "Perusahaan","Semester",  "Status");
        System.out.println("==============================================================================================================");

        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (dataMagang[i][2].equalsIgnoreCase(kataKunci)) {
                System.out.printf("%-2d %-20s %-15s %-25s %-20s %-15s %-10s\n", 
                    (i + 1), dataMagang[i][0], dataMagang[i][1], dataMagang[i][2], dataMagang[i][3], dataMagang[i][4] , dataMagang[i][5]);
                ditemukan = true;
            }
        }

        if (ditemukan == false) {
            System.out.println("Data dengan Program Studi '" + kataKunci + "' tidak ditemukan.");
        }
    }

    //fungsi menghitung jumlah status
    static void hitungStatus() {
        System.out.println("\n--- Jumlah Pendaftar per Status ---");
        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            String status = dataMagang[i][5];
            if (status.equalsIgnoreCase("Diterima")) {
                diterima++;
            } else if (status.equalsIgnoreCase("Menunggu")) {
                menunggu++;
            } else if (status.equalsIgnoreCase("Ditolak")) {
                ditolak++;
            }
        }

        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
        System.out.println("Total pendaftar: " + jumlahData);
    }
}