public class ContohVariable26 {

    public static void main(String[] args) {
        String hobi = "bermain game";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 17;
        double ipk = 3.75, tinggiBadan = 172;

        System.out.println("Hobi saya adalah " + hobi);
        System.out.println("apakah pandai? "+ pandai);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur saya sekarang : " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggiBadan));

    }
}
