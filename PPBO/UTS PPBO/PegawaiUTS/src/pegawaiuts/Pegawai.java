/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawaiuts;

/**
 *
 * @author hp
 */
public class Pegawai {
    private String nama; private String posisi;
    public Pegawai(){    
    }
    public Pegawai(String nama,String posisi){
        this.nama=nama;
        this.posisi=posisi;
    }
    public String getNama(){
        return nama;
    }
    public String getPosisi(){
        return posisi;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setPosisi(String posisi){
        this.posisi=posisi;   
    }
    public String toString(){
        return("Nama pegawai: "+nama+" dan posisi pegawai: "+posisi);
    }
}
