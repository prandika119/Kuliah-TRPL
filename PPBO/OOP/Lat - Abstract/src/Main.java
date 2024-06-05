public class Main {
    public static void main(String[] args) {
        Beach beach = new Beach ("Bali", 1000, 500000,1000000);
        Mountain mountain = new Mountain ("Bromo", 500, 750000,500000);
        City city = new City ( "Jakarta", 200, 10000, 5000);

        System.out.println("jarak : ");
        System.out.println(beach.getNama()+ " - " + beach.getJarak() + " km");
        System.out.println(mountain.getNama()+" - "+mountain.getJarak()+ " km");
        System.out.println(city.getNama()+" - "+city.getJarak()+ " km");

        System.out.println("Total Biaya : ");
        System.out.println(beach.getNama() + ": "  + beach.getTotalBiaya());
        System.out.println(mountain.getNama() + ": " + mountain.getTotalBiaya());
        System.out.println(city.getNama() + ": " + city.getTotalBiaya());
    }
}
