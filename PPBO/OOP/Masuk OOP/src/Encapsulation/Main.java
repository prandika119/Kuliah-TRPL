package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // Buat User
        Pengguna pustakawan1 = new Pengguna("Budi", "Pustakawan");
        Pengguna pengunjung1 = new Pengguna("Ana", "Pengunjung");
        Pengguna pengunjung2 = new Pengguna("Cici", "Pengunjung");

        // Buat Buku
        Buku buku1 = new Buku("Buku 1", "Penulis 1");
        Buku buku2 = new Buku("Buku 2", "Penulis 2");

        // Meminjam buku
        perpus.minjamBuku(pustakawan1, pengunjung1, buku1, 7);
        perpus.minjamBuku(pustakawan1, pengunjung2, buku2, 5);

        // Cek status buku
        System.out.println(buku1.toString());
        System.out.println(buku2.toString());

        // Pengembalian buku
        perpus.kembalikanBuku(pengunjung1, buku1);
        perpus.kembalikanBuku(pengunjung2, buku2);

        // Cek status buku setelah pengembalian
        System.out.println(buku1.toString());
        System.out.println(buku2.toString());
    }
}
