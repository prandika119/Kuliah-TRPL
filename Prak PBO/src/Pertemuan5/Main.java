package Pertemuan5;

public class Main {
    public static void main(String[] args) {
        Mahasiswa nawal = new Mahasiswa ("Nawal", "522305");
        nawal.nama = "Nawol";
        System.out.println(nawal.nama);
        nawal.jumlahBolos = 10;
        nawal.bolehUjian();
        System.out.println(nawal.toString());
    }
}
