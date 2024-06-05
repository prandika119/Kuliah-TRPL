public class CetakKrs {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Jono", "12345");
        MataKuliah mk1 = new MataKuliah("Pemrograman Berorientasi Objek", "PL1234", 2);
        MataKuliah mk2 = new MataKuliah("Struktur Data", "PL1235", 2);
        MataKuliah mk3 = new MataKuliah("Algoritma dan Pemrograman", "PL1236", 2);
        
        AmbilKrs krs1 = new AmbilKrs(mhs1);
        krs1.tambahMatkul(mk1);
        krs1.tambahMatkul(mk2);

        System.out.println("Kartu Rencana Studi");
        System.out.println("\n" + krs1.getMahasiswa());
        System.out.println("\nDaftar Mata Kuliah :");
        krs1.getDaftarMatkul();
    }
}
