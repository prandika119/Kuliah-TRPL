public class City extends Destination {
    public City(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama, jarak, biayaTransportasi, biayaAkomodasi);
    }

    @Override
    public double hitungBiayaTransportasi(){
        if(this.getJarak()>500){
            return this.getBiayaTransportasi() - (getBiayaTransportasi()*0.03);
        } else {
            return this.getBiayaTransportasi();
        }

    }

    @Override
    public double hitungBiayaAkomodasi(){
        return this.getBiayaAkomodasi();
    }
}
