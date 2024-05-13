import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private int umur;
    private String prodi;
    private int angkatan;
    private String nim;
    private String kelasDiikuti;
    private String jadwalKelas;

    public Mahasiswa (String nama, int umur, String prodi, int angkatan, String nim){
        this.nama = nama;
        this.umur = umur;
        this.prodi=prodi;
        this.angkatan=angkatan;
        this.nim = nim;
    }

    public void setKelasDiikuti(String kelasDiikuti, String jadwalKelas) {
        this.kelasDiikuti = kelasDiikuti;
        this.jadwalKelas = jadwalKelas;
    }

    public String getNama() {
        return nama;
    }
    public String getJadwalKelas() {
        return jadwalKelas;
    }

    public int getUmur() {
        return umur;
    }

    public String getProdi() {
        return prodi;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public String getKelasDiikuti() {
        return kelasDiikuti;
    }

    public String getNim() {
        return nim;
    }
    @Override
    public String toString(){
        return "Data Mahasiswa"+"\nNama mahasiswa : " + this.nama + "\nNIM : " + this.nim + "\nProdi : " + this.prodi + "\nKelas : "+ kelasDiikuti+"\n--------------------------";
    }
}

// + "\nKelas yang diikuti : " + this. +