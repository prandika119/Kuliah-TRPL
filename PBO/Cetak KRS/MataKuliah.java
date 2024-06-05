public class MataKuliah {
    private String namaMatkul;
    private String kodeMatkul;
    private int sks;

    public MataKuliah(String namaMatkul, String kodeMatkul, int sks) {
        this.namaMatkul = namaMatkul;
        this.kodeMatkul = kodeMatkul;
        this.sks = sks;
    };
    public String getNamaMatkul() {
        return namaMatkul;
    };
    public String getKodeMatkul() {
        return kodeMatkul;
    };
    public int getSks() {
        return sks;
    };
}
