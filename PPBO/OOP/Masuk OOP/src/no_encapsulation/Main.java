package no_encapsulation;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Mars","Setya", 3);
        User pustakawan1 = new User ("andi","Pustakawan");
        User pengunjung1 = new User ("dika", "Pengunjung");
        User pengunjung2 = new User ("dwi", "Pengunjung");
        book1.pinjam(pustakawan1, pengunjung1, 7);
        book1.cekBuku();
        book1.pinjam(pustakawan1, pengunjung1, 7);
        book1.kembali(pustakawan1, pengunjung1);
        book1.cekBuku();
        book1.pinjam(pustakawan1, pengunjung1, 7);
        book1.pinjam(pustakawan1, pengunjung1, 7);
        book1.cekBuku();

        }
    }
