    public class TugasJava1 {

        public static void main(String[] args) {
         System.out.println("NIM \t Nama \t Prodi" );
            String[] NIM = {"9" };
            String[] Nama = {"Rayana", "Rizki", "Rizal", "Rama", "Rani", "Farel", "Dito", "Atma", "Wawan", "Nabigh"};
            String[] Prodi = {"Teknik Informatika", "Sistem Informasi", "Manajemen Informatika"};
                for (int i = 0; i < 10; i++) {
                    System.out.println(NIM[i%1]+"\t "+Nama[i]+"\t "+Prodi[i%3]);
                    
              }
    }
}

