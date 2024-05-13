import java.util.ArrayList;

public class MataKuliah{
    private String matkul;
    private String kode;
    private int kapasitas;
    private String jadwal;
    private String namaDosen;
    private ArrayList<String> listMahasiswa= new ArrayList<>();

    public MataKuliah(String matkul, String kode, int kapasitas, String jadwal, Dosen nama) {
        this.matkul = matkul;
        this.kode = kode;
        this.kapasitas = kapasitas;
        this.jadwal = jadwal;
        this.namaDosen = nama.getNama();
    }

    public String getMatkul() {
        return matkul;
    }

    public String getKode() {
        return kode;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void enroll (Mahasiswa nama){
        if (this.kapasitas <= 0){
            System.out.println("Gagal mendaftarkan "+ nama.getNama()+" ke kelas "+this.kode+" karena kelas penuh");
        } else if (nama.getJadwalKelas() == jadwal){
            System.out.println("Gagal mendaftarkan "+ nama.getNama()+" ke kelas "+this.kode+" karena kelas dihari yang sama");
        }
        else {
            System.out.println("Berhasil mendaftarkan "+nama.getNama()+" ke kelas "+this.kode);
            this.kapasitas--;
            nama.setKelasDiikuti(matkul,jadwal);
            this.listMahasiswa.add(nama.getNama());


        }
    }
    @Override
    public String toString(){
    return "Data Mata Kuliah"+"\nMata kuliah : " + matkul + "\nJadwal : " + jadwal + "\nKapasitas : "+kapasitas+"\nDosen pengampu : "+ namaDosen+"\nList Mahasiswa : "+ listMahasiswa+"\n--------------------";
    }
}
