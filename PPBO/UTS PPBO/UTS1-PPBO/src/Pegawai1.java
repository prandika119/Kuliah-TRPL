public class Pegawai1 extends Pegawai{
    double tunjangan;
    double bonus;
    double gajiPokok;
    int asuransi;

    public Pegawai1 (String nama, String status, String jabatan, double tunjangan){
        super.nama = nama;
        super.status = status;
        super.jabatan = jabatan;
        this.tunjangan = tunjangan;
        this.gajiPokok = 550;
        this.asuransi = 30;

    }
    public double getBonus(){
        this.bonus = 0.04 * (this.gajiPokok + this.tunjangan);
        return this.bonus;
    }

    public double getGaji(){
        super.gaji = this.gajiPokok+this.tunjangan+this.getBonus()+this.asuransi;
        return super.gaji;
    }

    @Override
    public String toString(){
        return "\nPegawai Tetap\nNama: "+ super.nama + "\nstatus:"+super.status+"\nJabatan:"+super.jabatan+"\nGaji Pokok: $"+this.gajiPokok+"\nTunjangan: $"+this.tunjangan+"\nBonus: $"+this.getBonus()+"\nAsuransi: $"+this.asuransi+"\nGaji Total: $"+this.getGaji();
    }
}
