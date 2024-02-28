package Pertemuan3;

public class PrakPBO3 {
    public static void main(String[] args) {
        int a,b,c;
        a = 4;
        b = 6;
        c = a+b;
        System.out.println("Hasil penjumlahannya adalah "+c );

//      Latihan 1 (no1)
        int p,l,t,v;
        p = 58;
        l = 88;
        t = 7;
        v = p*l*t;
        System.out.println("Volumenya adalah :"+v);

//      Latihan 1 (no 2)
        int alas,tinggi,luas;
        alas = 98 ;
        tinggi = 57 ;
        luas = alas/2*tinggi;
        System.out.println("luas segitiga adalah :"+luas);

//      Latihan 2
        float satuan,konversi;
        int jmlGalon;
        satuan = 3.7854F;
        jmlGalon = 10;
        konversi = satuan*jmlGalon;
        System.out.println("jumlah galon :"+jmlGalon);
        System.out.println("hasil konversinya adalah : "+konversi);

//      Percabangan
//      Latihan 1
        int hari = 3;
        switch (hari){
            case 1 :
                System.out.println("Senin");
                break;
            case 2 :
                System.out.println("Selasa");
                break;
            case 3 :
                System.out.println("Rabu");
                break;
            case 4 :
                System.out.println("Kamis");
                break;
            case 5 :
                System.out.println("Jumat");
                break;
            case 6 :
                System.out.println("Sabtu");
                break;
            case 7 :
                System.out.println("Minggu");
                break;
            default :
                System.out.println("Tidak Ada");
                break;
        }
//      Latihan 2
//        char huruf = 'A',tebakan;
//        System.out.println("Tebak huruf A sampai Z");
//        System.out.println("Tebak satu huruf");
//        tebakan = (char) System.in.read();
//        switch (tebakan){
//            case 'A':
//                System.out.println("Benar");
//            default:
//                System.out.println("Salah");
//        }

    }
}
