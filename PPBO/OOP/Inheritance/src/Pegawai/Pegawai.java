package Pegawai;

public class Pegawai {
    private String nama;
    private String status;
    private double insentif;
    private int gaji;

    public Pegawai (String nama, int gaji, double insentif ){
        this.nama = nama;
        this.insentif=insentif;
        this.gaji = gaji;
    }
    public double getInsentif(){
        return insentif;
    }
    public  int getGaji(){
        return gaji;
    }
    public String getNama(){
        return nama;
    }
}
