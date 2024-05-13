public class Obat {
    private String nama;
    private int harga;
    private int stock;
    private int index;
    public static Obat rak[];

    public Obat(String name, int harga, int stock, int index) {
        this.nama = name;
        this.harga = harga;
        this.stock = stock;
        this.index = index;
//        this.rak[index]="nama= "+name+ " | "+"harga= "+harga+" | "+"stok= "+stock;
    }

    public Obat() {
        this.nama = null;
        this.harga = 0;
        this.stock = 0;
        this.index = 0;
    }

    public static void setRak(int jml) {
        rak = new Obat [jml];
    }

    public static void getRak() {
        for (Obat b : rak) {
            System.out.println(b);
        }
        System.out.println("-----------------------------------");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    public int getIndex() {
        return index;
    }

   

    @Override
    public String toString() {
        return "\n-----------------------------------\nnama= "+this.nama+ " | "+"harga= "+this.harga+" | "+"stok= "+this.stock;
    }

    //    public void tambahObat(String name, int harga, int stock, int index){
//        this.nama = name;
//        this.harga = harga;
//        this.stock = stock;
//        this.index = index;
//    }
}
