import java.util.ArrayList;
import java.util.Collections;
public class Main {
public static void main(String[] args) {
    Pegawai1 P11 = new Pegawai1("Arsa", "Pegawai tetap", "manager", 20);
    Pegawai2 P21 = new Pegawai2("Raihan", "Pegawai tidak tetap", "staff IT");
    PegawaiPW PW1 = new PegawaiPW("Emilio", "Pegawai paruh waktu", "sekretaris", 60, 10);

    System.out.println(P11);
    System.out.println(P21);
    System.out.println(PW1);
    ArrayList dataPegawai = new ArrayList();
    dataPegawai.add(P11.getGaji());
    dataPegawai.add(P21.getGaji());
    dataPegawai.add(PW1.getGaji());
    Collections.sort(dataPegawai);
    Pegawai tertinggi = dataPegawai.getLast();
    System.out.println(tertinggi);
    System.out.println("\n===================\nGaji Tertinggi");
    if (P11.getGaji()>P21.getGaji() && P11.getGaji()> PW1.getGaji()){
        System.out.println(P11);
    }else if (P21.getGaji()>P11.getGaji() && P21.getGaji()> PW1.getGaji()){
        System.out.println(P21);
    } else {
        System.out.println(PW1);
    }


}
}
