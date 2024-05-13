package no_encapsulation;

public class Book {
    String judul;
    String penulis;
    boolean isDipinjam;
    String peminjam;
    int lamaPeminjaman;
    int stok;
    boolean isTersedia;

    public Book(String judul, String penulis, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.isDipinjam = false;
        this.lamaPeminjaman = 0;
        this.stok = stok;
    }

    //    Pinjam buku
    public void pinjam(User admin, User peminjam, int lamaPeminjaman) {
        if (!admin.role.equals("Pustakawan")) {
            System.out.println("\nPerlu izin pustakawan");
        } else if (stok <= 0) {
            System.out.println("\nTidak ada stok");
        } else {
            this.isDipinjam = true;
            this.peminjam = peminjam.nama;
            this.lamaPeminjaman = lamaPeminjaman;
            stok -= 1;
            System.out.println("\nBuku berhasil dipinjam oleh " + peminjam.nama);
        }
    }

    public boolean isBukuDipinjam() {
        return this.isDipinjam;
    }

    //    Kembalikan buku
    public void kembali(User peminjam, String judul) {
        if (this.peminjam == peminjam.nama && this.judul == judul) {
            this.isTersedia = true;
            this.peminjam = peminjam.toString();
            this.lamaPeminjaman = 0;
            stok += 1;
            System.out.println("\nBuku berhasil dikembalikan");
        }
    }

    @Override
    public String toString() {
        String statusBuku = "";
        if (stok > 0) {
            statusBuku = " Tersedia";
        } else {
            statusBuku = " Tidak tersedia";
        }
        return "Judul buku: " + judul +
                "\nStatus: " + statusBuku +
                "\nStok: " + stok +
                "\n--------------------";
    }
}
