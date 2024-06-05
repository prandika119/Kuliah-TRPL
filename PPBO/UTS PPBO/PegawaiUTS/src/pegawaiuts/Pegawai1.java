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
public class Pegawai1 extends Pegawai{
    private final double gapok=550;
    private double tunjangan;
    private double bonus;
    public Pegawai1(String nama,String posisi,int tunjangan){
        super(nama,posisi);
        this.tunjangan=tunjangan;
        bonus=4*gapok/100;
    } 
    public double getBonus(){
        return bonus;
    }
    public double getGapok(){
        return gapok;
    }
    public double getTunjangan(){
        return tunjangan;
    }
    public double getTakeHomePay(){
        return bonus+gapok+tunjangan;
    }
    public String toString(){
        return "Nama pegawai: $"+super.getNama()+
               "\nPosisi pegawai: $"+super.getPosisi()+
               "\nGaji pokok pegawai: $"+gapok+
               "\nTunjangan pegawai : $"+tunjangan+
               "\nBonus pegawai: $"+bonus+
               "\nAsuransi kesehatan: $30"+
               "\nTake home pay: $"+getTakeHomePay();
    }
}
