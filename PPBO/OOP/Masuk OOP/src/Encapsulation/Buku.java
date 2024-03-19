package Encapsulation;

public class Buku {

    private String judul;
    private String penulis;
    private StatusBuku status;
    private Pengguna peminjam;
    private int lamaPeminjaman;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.status = StatusBuku.TERSEDIA;
        this.peminjam = null;
        this.lamaPeminjaman = 0;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public StatusBuku getStatus() {
        return status;
    }

    public Pengguna getPeminjam() {
        return peminjam;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }

    public void minjam(Pengguna admin, Pengguna peminjam, int lamaPeminjaman) {
        if (admin.getRole().equals("Pustakawan") && status == StatusBuku.TERSEDIA) {
            this.status = StatusBuku.DIPINJAM;
            this.peminjam = peminjam;
            this.lamaPeminjaman = lamaPeminjaman;
            System.out.println("Buku " + judul + " berhasil dipinjam oleh " + peminjam.getNama());
        } else if (!admin.getRole().equals("Pustakawan")) {
            System.out.println("Perlu izin pustakawan untuk meminjam buku");
        } else {
            System.out.println("Buku " + judul + " sedang dipinjam");
        }
    }

    public void kembalikan(Pengguna peminjam) {
        if (this.peminjam == peminjam) {
            this.status = StatusBuku.TERSEDIA;
            this.peminjam = null;
            this.lamaPeminjaman = 0;
            System.out.println("Buku " + judul + " berhasil dikembalikan oleh " + peminjam.getNama());
        } else {
            System.out.println("Pengembalian buku gagal. User tidak terdaftar sebagai peminjam");
        }
    }

    @Override
    public String toString() {
        String statusBuku = "";
        if (status == StatusBuku.TERSEDIA) {
            statusBuku = "Tersedia";
        } else if (status == StatusBuku.DIPINJAM) {
            statusBuku = "Dipinjam oleh " + peminjam.getNama() + " ";
        }else (){
            System.out.println("");
        }
    }
}