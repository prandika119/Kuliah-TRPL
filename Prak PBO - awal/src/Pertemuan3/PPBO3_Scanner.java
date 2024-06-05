package Pertemuan3;
import java.util.Scanner;
public class PPBO3_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nama :");
        String nama = input.nextLine();

        System.out.printf("Prodi :");
        String prodi = input.nextLine();

        System.out.println("Nama saya"+nama+" Prodi"+prodi);
    }
}
