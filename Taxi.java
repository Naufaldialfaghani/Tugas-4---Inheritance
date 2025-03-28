package praktic.inheritance.transportation; // Mendeklarasikan package tempat class ini berada

// Class Taxi yang merupakan subclass dari Vehicle
public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000; // Tarif per kilometer

    // Constructor untuk inisialisasi objek Taxi
    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
        // Memanggil constructor superclass (Vehicle) dengan parameter:
        // Nama kendaraan: sesuai parameter yang akan diberikan di main
        // Kapasitas: sesuai dengan parameter yang akan diberikan di main
        // Rute perjalanan: sesuai dengan parameter yang akan diberikan di main
    }

    public void calculateFare(int distance) {
        int totalFare = distance * FARE_PER_KM; // Menghitung tarif total

        // Menampilkan informasi total penumpang, jarak, tarif perjalanan, total tarif perjalanan
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total jarak rute: " + distance + " km");
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare);
    }
}
