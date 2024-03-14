package Pertemuan5;

public class Mahasiswa {
//    Atribut
    String nama;
    String nim;
    int angkatan;
    int semester;
    double ipk;
    int jumlahBolos;
//    constructor
     public Mahasiswa (String namaMahasiswa, String nimMahasiswa){
         nama = namaMahasiswa;
         nim = nimMahasiswa;
         jumlahBolos = 0;
     }
     void bolehUjian(){
         if(jumlahBolos > 7){
             System.out.println("Mahasiswa tidak boleh ujian");
         } else {
             System.out.println("Mahasiswa boleh ujian");
         }
     }

     @ovveride
    public String toString(){
         return  "Nama = " + nama +
                 "\nNIM = " + nim +
                 "\nAngkatan = " + angkatan +
                 "\nSemeseter = " + semester +
                 "\nIPK = " + ipk;
     }
}
