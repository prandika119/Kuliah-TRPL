public class Pegawai2 extends Pegawai {
    double bonus;
    double gajiPokok;
    double asuransi;
    public Pegawai2(String nama, String status, String jabatan) {
        super.nama = nama;
        super.status = status;
        super.jabatan = jabatan;
        this.gajiPokok = 550;
    }
    public double getBonus() {
        this.bonus = 0.04 * this.gajiPokok;
        return this.bonus;
    }
    public double getGaji() {
        super.gaji = this.gajiPokok + this.getBonus();
        return super.gaji;
    }
    public double getAsuransi() {
        this.asuransi = this.getGaji() * 0.1;
        if (this.asuransi>= 30){
            return 30;
        }else{
            return this.asuransi;
        }
    }
    @Override
    public String toString() {
        return "\nPegawai Tidak Tetap\nNama: " + super.nama + "\nstatus:" + super.status + "\nJabatan:" + super.jabatan +"\nGaji Pokok: $"+this.gajiPokok+"\nBonus: $"+this.getBonus()+"\nAsuransi: $"+this.getAsuransi()+"\nGaji Total: $"+this.getGaji();
    }
}
