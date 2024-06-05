public class Mountain extends Destination {
    public Mountain(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama, jarak, biayaTransportasi, biayaAkomodasi);
    }

    @Override
    public double hitungBiayaTransportasi() {
        return this.getBiayaTransportasi();
    }

    @Override
    public double hitungBiayaAkomodasi() {
        if(this.getBiayaAkomodasi()>500000){
            return this.getBiayaAkomodasi() - (getBiayaAkomodasi()*0.05);
        }else{
            return this.getBiayaAkomodasi();
        }

    }
}
