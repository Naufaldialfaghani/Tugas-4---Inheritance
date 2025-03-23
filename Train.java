package praktic.inheritance.transportation; // Mendeklarasikan package tempat class ini berada

// Class Train yang merupakan subclass dari Vehicle
public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000; // Tarif tetap per penumpang (konstan)

    // Constructor untuk inisialisasi objek Train
    public Train(String route) {
        super("Kereta Commuter Line", 200, route);
        // Memanggil constructor superclass (Vehicle) dengan parameter:
        // Nama kendaraan: "Kereta Commuter Line"
        // Kapasitas: 200 penumpang
        // Rute perjalanan: sesuai dengan parameter yang diberikan
    }

    // Menghitung total tarif perjalanan berdasarkan jumlah penumpang saat ini
    public void calculateFare() {
        int totalFare = getCurrentPassengers() * FIXED_FARE;

        // Menampilkan informasi penumpang, tarif per penumpang, tarif total perjalanan
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare);
    }
}
