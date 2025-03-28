package praktic.inheritance.transportation; // Mendeklarasikan package tempat class ini berada

// Class Bus yang merupakan subclass dari Vehicle
public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000; // Tarif per pemberhentian (halte)

    // Constructor untuk inisialisasi objek Bus
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
        // Memanggil constructor superclass (Vehicle) dengan parameter:
        // Nama kendaraan: sesuai parameter yang akan diberikan di main
        // Kapasitas: sesuai dengan parameter yang akan diberikan di main
        // Rute perjalanan: sesuai dengan parameter yang akan diberikan di main
    }

    public void calculateFare(int stops) {
        int totalFare = getCurrentPassengers() * stops * FARE_PER_STOP; // Menghitung total tarif perjalanan
        
        // Menampilkan informasi total penumpang, total pemberhentian, tarif perjalanan bus, total tarif perjalanan bus
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare);
    }
}
