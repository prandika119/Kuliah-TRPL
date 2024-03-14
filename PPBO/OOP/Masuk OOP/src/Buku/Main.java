package Buku;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku ("Mars","Setya");
        User pustakawan1 = new User ("andi","Pustakawan");
        User pengunjung1 = new User ("dika", "Pengunjung");
        User pengunjung2 = new User ("dwi", "Pengunjung");
        System.out.println(buku1.isBukuDipinjam());
        buku1.pinjam(pustakawan1, pengunjung1, 7);
        }
    }
