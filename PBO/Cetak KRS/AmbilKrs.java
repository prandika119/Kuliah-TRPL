import java.util.ArrayList;
public class AmbilKrs {
    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> daftarMatkul ;

    public AmbilKrs(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarMatkul = new ArrayList<MataKuliah>();
    }
    public void tambahMatkul(MataKuliah matkul) {
        this.daftarMatkul.add(matkul);
    }
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
    public void getDaftarMatkul() {
        for (MataKuliah matkul : daftarMatkul) {
            System.out.println(matkul.getNamaMatkul() + " (" + matkul.getKodeMatkul() + ") - " + matkul.getSks() + " SKS");
        }
    }
}
