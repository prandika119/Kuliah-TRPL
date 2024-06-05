package Tugas6;

abstract class Orang {
    private String nama;
    private String tanggalLahir;
    private String alamat;
    public Orang (String nama, String tanggalLahir, String alamat){
        this.nama = nama;
        this.tanggalLahir =  tanggalLahir;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

class Mahasiswa extends Orang{
    private String nim;
    private String prodi;
    public Mahasiswa (String nama, String tanggalLahir, String alamat, String nim, String prodi){
        super(nama, tanggalLahir, alamat);
        this.nim = nim;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "\nNama: "+ this.getNama()+"\nNIM: "+this.getNim()+"\nTanggal Lahir: "+this.getTanggalLahir()+"\nProdi: "+this.getProdi()
        +"\nAlamat: "+this.getAlamat();
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Arsa", "12 Jan 2005", "Magelang", "23/52304", "TRPL");
        Mahasiswa mhs2 = new Mahasiswa("Tegar", "5 Mei 2005", "Purbalingga", "23/52224", "TRPL");
        System.out.println(mhs1);
        System.out.println(mhs2);
    }
}
