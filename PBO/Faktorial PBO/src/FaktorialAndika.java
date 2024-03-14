import java.util.Scanner;
public class FaktorialAndika {
    public static void main(String[] args) {
        Scanner ketik = new Scanner(System.in);
        //  faktorial
        System.out.println("faktorial");
        System.out.print("Masukan angka faktorial : ");
        int angka = ketik.nextInt();
        int factorial = calculateFactorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + factorial);
    }

    public static int calculateFactorial(int angka) {
        if (angka == 0) {
            return 1;
        } else {
            return angka * calculateFactorial(angka - 1);
        }
    }
}
