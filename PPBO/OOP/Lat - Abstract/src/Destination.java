public abstract class Destination {
    private String nama;
    private int jarak;
    private int biayaTransportasi;
    private int biayaAkomodasi;

    public Destination(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        this.nama = nama;
        this.jarak = jarak;
        this.biayaTransportasi = biayaTransportasi;
        this.biayaAkomodasi = biayaAkomodasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJarak() {
        return jarak;
    }

    public int getBiayaTransportasi() {
        return biayaTransportasi;
    }

    public int getBiayaAkomodasi() {
        return biayaAkomodasi;
    }

    public abstract double hitungBiayaTransportasi();
    public abstract double hitungBiayaAkomodasi();

    public int getTotalBiaya(){
        int biaya = (int)this.hitungBiayaAkomodasi()+ (int)this.hitungBiayaTransportasi();
        if (this.jarak>1000 ) {
            return (int) (biaya*0.9);
        } else {
            return (int) (biaya);
        }
    };
}
