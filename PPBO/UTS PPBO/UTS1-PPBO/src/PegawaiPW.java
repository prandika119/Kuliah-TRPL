public class PegawaiPW extends Pegawai {
    int jamKerja;
    int hargaPerJam;


    public PegawaiPW(String nama, String status, String jabatan, int jamKerja, int hargaPerJam) {
        super.nama = nama;
        super.status = status;
        super.jabatan = jabatan;
        this.jamKerja = jamKerja;
        this.hargaPerJam = hargaPerJam;
    }

    public double getGaji() {
        super.gaji = this.jamKerja * this.hargaPerJam;
        return super.gaji;
    }

    @Override
    public String toString() {
        return "\nPegawai Paruh Waktu\nNama: " + super.nama + "\nstatus:" + super.status + "\nJabatan:" + super.jabatan + "\nJam Kerja:"+this.jamKerja+"\nHarga per jam: $"+this.hargaPerJam+"\nGaji: $" + this.getGaji();
    }
}
