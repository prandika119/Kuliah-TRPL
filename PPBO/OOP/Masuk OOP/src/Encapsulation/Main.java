package Encapsulation;

public class Main {

    public static void main(String[] args) {

        // Buat User
        Pengguna pustakawan1 = new Pengguna("Budi", "Pustakawan");
        Pengguna pengunjung1 = new Pengguna("Ana", "Pengunjung");
        Pengguna pengunjung2 = new Pengguna("Cici", "Pengunjung");

        // Buat Buku
        Buku buku1 = new Buku("Filosofi Teras", "Penulis 1", 3);
        Buku buku2 = new Buku("Atomic Habit", "Penulis 2", 1);

        // Meminjam buku
        buku1.minjam(pustakawan1, pengunjung1, buku1.getJudul(), 7);
        buku2.minjam(pustakawan1, pengunjung2, buku2.getJudul(), 5);

        // Cek status buku
        System.out.println("\n---- Cek Buku ----");
        System.out.println(buku1.toString());
        System.out.println(buku2.toString());

        // Pengembalian buku
        buku1.kembalikan(pengunjung1, buku1.getJudul());
        buku2.kembalikan(pengunjung2, buku2.getJudul());

        // Cek status buku setelah pengembalian
        System.out.println("\n---- Cek Buku ----");
        System.out.println(buku1.toString());
        System.out.println(buku2.toString());
    }
}
