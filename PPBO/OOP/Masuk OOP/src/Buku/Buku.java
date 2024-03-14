package Buku;

public class Buku {
    String judul;
    String penulis;
    boolean isDipinjam;
    String peminjam;
    int lamaPeminjaman;

    public Buku(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
        this.isDipinjam=false;
        this.lamaPeminjaman=0;
    }
    public void pinjam (User admin, User peminjam, int lamaPeminjaman){
        if (isDipinjam == true){
            System.out.println("Buku sedang dipinjam");
        }else if (!admin.role.equals("Pustakawan")){
            System.out.println("Perlu izin pustakawan");
        }else {
            this.isDipinjam = true;
            this.peminjam = peminjam.toString();
            this.lamaPeminjaman = lamaPeminjaman;
            System.out.println("Buku berhasil dipinjam");
        }
    }

    public boolean isBukuDipinjam(){
        return this.isDipinjam;
    }
}
