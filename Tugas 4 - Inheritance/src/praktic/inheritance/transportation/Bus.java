package praktic.inheritance.transportation; // Mendeklarasikan package tempat class ini berada

// Class Bus yang merupakan subclass dari Vehicle
public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000; // Tarif per pemberhentian (halte)

    // Constructor untuk inisialisasi objek Bus
    public Bus(String route) {
        super("Bus TransJakarta", 50, route);
        // Memanggil constructor superclass (Vehicle) dengan parameter:
        // Nama kendaraan: "Bus TransJakarta"
        // Kapasitas: 50 penumpang
        // Rute perjalanan: sesuai dengan parameter yang diberikan
    }

    public void calculateFare() {
        int stops = 5; // Jumlah pemberhentian dalam perjalanan (asumsi tetap 5 halte)
        int totalFare = getCurrentPassengers() * stops * FARE_PER_STOP; // Menghitung total tarif perjalanan

        // Menampilkan informasi total penumpang, total pemberhentian, tarif perjalanan bus, total tarif perjalanan bus
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare);
    }
}
