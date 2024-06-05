package Pertemuan4;
import java.util.Scanner;
public class ArrayPerulangan {
    public static void main(String[] args) {
//      Latihan 1 (Print bil 1-5)
        System.out.println("Menggunakan for");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        };
        System.out.println("Menggunakan while");
        int k = 1;
        while ( k<  6){
            System.out.println(k);
            k ++;
        };
        System.out.println("Menggunakan do while loop");
        int l = 1;
        do {
            System.out.println(l);
            l++;
        }
        while (l<6);

//      Latihan 2 faktorial
        System.out.println("Latihan 2 faktorial");
        int angka = 5;
        int hasil = 1;
        for (int m = 1;  m<(angka+1) ; m++) {
           hasil = hasil*m;
        }
        System.out.println("Faktor dari 5 : " + hasil);

//      Latihan 3 String bakso
        System.out.println("Latihan 3 baksoo");
        char [] bakso = {'b','a','k','S','o','o'};
        String baksoo = "";
        for (char x : bakso){
            baksoo += x;
        }
        System.out.println(baksoo);

//      Latihan 4
        System.out.println("Latihan 4 akar");
        for (int i = 1; i <= 20 ; i++) {
            double akar = Math.sqrt(i);
            System.out.println("Akar dari " + i + "adalah " + akar);
            System.out.println("Error adalah "+ (i-(akar*akar)));
        }

//      Latihan 5
        System.out.println("Latihan 5 tabel 2D");
        Scanner ketik = new Scanner(System.in);
        System.out.print("Masukan baris: ");
        int baris = ketik.nextInt();
        System.out.print("Masukan kolom: ");
        int kolom = ketik.nextInt();
        int jml = baris*kolom;
        int a = 1;
        int akolom = kolom;
        for (int i = 1; i <= baris; i++) {
            System.out.println(" ");
            for (int j = a; j <= akolom ; j++) {
                System.out.print(j+" ");
            }
            a += kolom;
            akolom += kolom;
        }

//        for (int i = 1; i <= jml ; i++) {
//
//            if (i % kolom != 0){
//                System.out.print(i + " ");
//            } else {
//                System.out.println(i);
//            }
//        }
    }
}
