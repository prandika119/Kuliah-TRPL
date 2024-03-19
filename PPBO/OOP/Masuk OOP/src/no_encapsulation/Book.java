package no_encapsulation;

public class Book {
    String judul;
    String penulis;
    boolean isDipinjam;
    String peminjam;
    int lamaPeminjaman;
    int stok;
    public Book(String judul, String penulis, int stok){
        this.judul=judul;
        this.penulis=penulis;
        this.isDipinjam=false;
        this.lamaPeminjaman=0;
        this.stok=stok;
    }
//    Pinjam buku
    public void pinjam (User admin, User peminjam, int lamaPeminjaman){
        if (!admin.role.equals("Pustakawan")){
            System.out.println("\nPerlu izin pustakawan");
        } else if (stok<=0) {
            System.out.println("\nTidak ada stok");
        } else {
            this.isDipinjam = true;
            this.peminjam = peminjam.nama;
            this.lamaPeminjaman = lamaPeminjaman;
            stok -= 1;
            System.out.println("\nBuku berhasil dipinjam");
        }
    }
    public boolean isBukuDipinjam(){
        return this.isDipinjam;
    }
//    Cek Buku
    public void cekBuku(){
        System.out.println("---Cek Buku---\njudul buku: "+ judul +
                "\npenulis: " + penulis +
                "\nstatus peminjaman: " + isDipinjam +
                "\nStok buku: "+ stok);
        if(isDipinjam==true){
            System.out.println("peminjam: "+peminjam);
        }
    }
//    Kembalikan buku
    public void kembali (User admin, User peminjam) {
        if (!admin.role.equals("Pustakawan")) {
            System.out.println("Harap kembalikan ke pustakawan");
        } else {
            this.isDipinjam = false;
            this.peminjam = peminjam.toString();
            this.lamaPeminjaman=0;
            stok += 1;
            System.out.println("\nBuku berhasil dikembalikan");
        }
    }
    @Override
    public String toString() {
        return "judul buku: " + judul +
                "\npenulis: " + penulis +
                "\nstatus peminjaman: " + isDipinjam +
                "\nlama peminjaman: "+lamaPeminjaman;
    }
}
