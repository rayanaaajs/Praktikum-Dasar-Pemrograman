public class ContohTipeData26 {

    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50f;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan Darah : " + (byte)golonganDarah);
        System.out.println("Jarak : " + jarak + " km");
        System.out.println("Jumlah Penduduk Dalam Satu Dusun : " + jumlahPendudukDalamSatuDusun);   
        System.out.println("Suhu : " + suhu + " celcius");
        System.out.println("Berat : " + (float)berat + " kg");
        System.out.println("Saldo : " + saldo);
        System.out.println("Angka Desimal : " + angkaDesimal);

    }   
}