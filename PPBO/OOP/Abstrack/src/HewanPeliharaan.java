public abstract class HewanPeliharaan {
    private String nama;
    private String warnaDominan;

    public String getNama() {
        return nama;
    }

    public String getWarnaDominan() {
        return warnaDominan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarnaDominan(String warnaDominan) {
        this.warnaDominan = warnaDominan;
    }

    public abstract  void bergerak();
    public abstract void  bersuara();
}
