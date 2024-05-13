public class Dosen {
    private String nama;
    private int umur;
    private String prodi;
    private String nip;
    private String kelas;

    public Dosen(String nama, int umur, String prodi, String nip, MataKuliah matkul) {

        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
        this.nip = nip;
        this.kelas = matkul.getKode();

    }



    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getProdi() {
        return prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getKelas() {
        return kelas;
    }
        @Override
        public String toString () {
            return "Data Dosen"+"\nNama dosen : " + this.nama + "\nNIP : " + this.nip + "\nProdi : " + this.prodi + "\n-----------------------";
        }
}
