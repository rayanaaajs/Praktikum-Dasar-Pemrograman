public class StudiKasus1 {
    public static void main(String[] args) {
        int gajiPokok = 3000000, tunjanganPerAnak = 150000, jumlahAnak = 3;
        double danaPensiun = 0.05 ;
     
        int tunjangan = tunjanganPerAnak * jumlahAnak;
        int gajiKotor = gajiPokok + tunjangan;
        double potonganPensiun = gajiPokok * danaPensiun;
        double gajiBersih = gajiKotor - potonganPensiun;

        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Gaji Kotor : " + gajiKotor);
        System.out.println("Potongan Dana Pensiun : " + potonganPensiun);
        System.out.println("Gaji Bersih : " + gajiBersih);

        
        
      
    }
}
