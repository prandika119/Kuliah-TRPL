import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Umar Taufiq", 38, "TRPL", "88/89809/SV/21446",matkul1);
        Dosen dosen2 = new Dosen("Rochana", 30, "TRPL", "90/234509/SV/26476", matkul2);
        Mahasiswa mhs1 = new Mahasiswa("Revalina", 18, "TRPL", 2023, "23/546709/SV/21440");
        Mahasiswa mhs2 = new Mahasiswa("Dina", 20, "TRPL", 2023, "23/546710/SV/21441");
        Mahasiswa mhs3 = new Mahasiswa("Putri", 19, "TRE", 2022, "22/446910/SV/20341");
        Mahasiswa mhs4 = new Mahasiswa("Eka", 20, "TRE", 2023, "22/446780/SV/20151");

        MataKuliah matkul1 = new MataKuliah("PBO", "SVLP2PBO", 3, "Senin", dosen1);
        MataKuliah matkul2 = new MataKuliah("PBD", "SVLP2PBD", 3, "Senin", dosen2);

        matkul1.enroll(mhs1);
        matkul2.enroll(mhs1);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(Arrays.asList(mhs2,mhs3,mhs4));
        for (Mahasiswa daftar:daftarMahasiswa){
            matkul1.enroll(daftar);
        }

        System.out.println("--------------------------------------------------");

        System.out.println(matkul1);
        System.out.println(dosen1);
        System.out.println(mhs1);
    }
}