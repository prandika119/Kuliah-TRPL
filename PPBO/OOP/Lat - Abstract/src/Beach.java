public class Beach extends Destination {

    public Beach(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama, jarak, biayaTransportasi, biayaAkomodasi);
    }


    @Override
    public double hitungBiayaTransportasi() {
        if(this.getBiayaTransportasi()>500000){
            return this.getBiayaTransportasi() - (this.getBiayaTransportasi()*0.05);
        }
        return this.getBiayaTransportasi();
    }

    @Override
    public double hitungBiayaAkomodasi() {
        return this.getBiayaAkomodasi();
    }
}
