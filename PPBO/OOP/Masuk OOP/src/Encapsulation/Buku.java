package Encapsulation;

public class Buku {

    private String judul;
    private String penulis;
    private boolean isTersedia;
    private Pengguna peminjam;
    private int lamaPeminjaman;
    private int stok;

    public Buku(String judul, String penulis, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.isTersedia = false;
        this.peminjam = null;
        this.lamaPeminjaman = lamaPeminjaman;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean getStatus() {
        return isTersedia;
    }

    public Pengguna getPeminjam() {
        return peminjam;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }

//    Meminjam Buku
    public void minjam(Pengguna admin, Pengguna peminjam, String judul, int lamaPeminjaman) {
        if (!admin.getRole().equals("Pustakawan")){
            System.out.println("\nPerlu izin pustakawan");
        } else if (stok<=0) {
            System.out.println("\nTidak ada stok");
        } else {
            this.isTersedia = true;
            this.peminjam = peminjam;
            this.lamaPeminjaman = lamaPeminjaman;
            stok -= 1;
            System.out.println("\nBuku berhasil dipinjam oleh "+ peminjam.getNama());
        }
    }

//    Mengembalikkan Buku
    public void kembalikan(Pengguna peminjam, String judul) {
        if (this.peminjam == peminjam && this.judul == judul) {
            this.isTersedia = true;
            this.peminjam = peminjam;
            this.lamaPeminjaman = 0;
            stok += 1;
            System.out.println("\nBuku " + judul + " berhasil dikembalikan oleh " + peminjam.getNama());
        } else {
            System.out.println("\nPengembalian buku gagal. User atau buku tidak terdaftar");
        }
    }

    @Override
    public String toString() {
        String statusBuku = "";
        if (stok>0) {
            statusBuku = " Tersedia";
        }else {
            statusBuku = " Tidak tersedia";
        }
        return "Judul buku: "+ judul +
                "\nStatus: "+ statusBuku +
                "\nStok: "+stok+
                "\n--------------------";
    }
}