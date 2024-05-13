package Materi;

public class Main {
    public static void main(String[] args) {
        Sheep domba = new Sheep("Putih", 4);
        domba.tidur();
        System.out.println(domba.warna);

        Cow sapi = new Cow("Cokelat",4);
        sapi.tidur();
        System.out.println(sapi.jumlahKaki);
    }
}
