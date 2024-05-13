package no_encapsulation;

public class Main {
    public static void main(String[] args) {
        // Buat User
        User pustakawan1 = new User("Budi", "Pustakawan");
        User pengunjung1 = new User("Ana", "Pengunjung");
        User pengunjung2 = new User("Cici", "Pengunjung");

        // Buat Buku
        Book book1 = new Book("Filosofi Teras", "Penulis 1", 3);
        Book book2 = new Book("Atomic Habit", "Penulis 2", 1);

        book1.pinjam(pustakawan1, pengunjung1, 7);
        System.out.println(book1.toString());
        book1.pinjam(pustakawan1, pengunjung2, 7);
        book1.kembali(pengunjung1, book1.judul);
        System.out.println(book1.toString());
        book1.pinjam(pustakawan1, pengunjung2, 7);
        book1.pinjam(pustakawan1, pengunjung1, 7);
        System.out.println(book1.toString());

        }
    }
