import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Obat paramex = new Obat("paramex", 1000, 20, 0);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah rak: ");
        int jml = input.nextInt();
        Obat.setRak(jml);
        for (int ind = 0; ind <= (jml-1); ind+=1){
            Obat newObat = new Obat ();
            Obat.rak[ind] = newObat;
        }
        int i = 1;
        while (true){
            System.out.println("Selamat datang di Apotek\n1. Lihat obat\n2. Tambah obat\n3. Pindah obat\n4. Beli obat\n5. Keluar\n");
            System.out.println("Pilih menu : ");
            int menu = input.nextInt();
            if (menu==1){
                Obat.getRak();
            } else if (menu==2) {

                System.out.print("Masukan nama obat : ");
                String namaObat = input.next();

                System.out.print("Masukan harga obat : ");
                int hargaObat = input.nextInt();

                System.out.print("Masukan stok obat : ");
                int stokObat = input.nextInt();

                System.out.print("Masukan index obat : ");
                int indexObat = input.nextInt();

                Obat newObat = new Obat (namaObat,hargaObat,stokObat, indexObat);
                if (indexObat>0 && hargaObat > Obat.rak[indexObat-1].getHarga()) {
                    Obat.rak[newObat.getIndex()]= newObat;
                    System.out.println("Obat berhasil ditambahkan");
                } else if (indexObat == 0) {
                    Obat.rak[newObat.getIndex()]= newObat;
                    System.out.println("Obat berhasil ditambahkan");
                } else {
                    System.out.println("Obat gagal ditambahkan\n Obat lebih murah dari index sebelumnya");
                }

            } else if (menu == 3){
                System.out.println("Menu pemindahan rak");
                System.out.print("Masukan index yang akan dipindah : ");
                int indexAwal = input.nextInt();
                System.out.print("Masukan index tujuan : ");
                int indexAkhir = input.nextInt();
                if (Obat.rak[indexAkhir].getStock()==0  && (Obat.rak[indexAkhir-1].getStock()!=0) || Obat.rak[indexAkhir+1].getStock()==0){
                    if ((indexAkhir == 0 && Obat.rak[indexAkhir+1].getHarga()>Obat.rak[indexAwal].getHarga()) || (indexAkhir == jml-1 && Obat.rak[indexAkhir-1].getHarga()<Obat.rak[indexAwal].getHarga())){
                        System.out.println("Obat berhasil dipindahkan ke index "+ indexAkhir);
                        Obat copy = Obat.rak[indexAkhir];
                        Obat.rak[indexAkhir] = Obat.rak[indexAwal];
                        Obat.rak[indexAwal] = copy;
                    }
//                    System.out.println("Obat berhasil dipindahkan ke index "+ indexAkhir);
//                    Obat copy = Obat.rak[indexAkhir];
//                    Obat.rak[indexAkhir] = Obat.rak[indexAwal];
//                    Obat.rak[indexAwal] = copy;

                }else{
                    System.out.println("Rak sudah terisi atau obat lebih murah dari index sebelumnya");
                }
            } else if (menu==4) {
                System.out.println("Menu pembelian");

            }
        }
    }
    
}

//&& hargaObat < Obat.rak[indexObat+1].getHarga())