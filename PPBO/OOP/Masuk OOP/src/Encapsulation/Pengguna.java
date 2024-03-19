package Encapsulation;

public class Pengguna {
    private String nama;
    private String role;

    public Pengguna(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

    public String getNama() {
        return nama;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Role: " + role;
    }
}
}
