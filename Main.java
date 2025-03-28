package praktic.inheritance.mains; // Mendeklarasikan package untuk class Main

// Mengimpor kelas-kelas yang digunakan dari package transportation
import praktic.inheritance.transportation.*;

public class Main {
    // Mendeklarasikan variabel warna untuk output
    private static String BLUE = "\033[0;34m";  // Warna biru
    private static String WHITE = "\u001B[0m";  // Warna putih
    private static String GREEN = "\u001B[32m"; // Warna hijau
    public static void main(String[] args) {
        // Membuat objek kendaraan dengan rute masing-masing
        Bus bus = new Bus("Bus Trans Jakaeta", 50, "Terminal A - Terminal B");
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Taxi Bluebird", 4, "Bandara - Hotel");

        // Informasi pribadi aja ehehe
        System.out.println(BLUE + "================================================================");
        System.out.println("Nama    : Naufaldi Alfaghani");
        System.out.println("NIM     : 245150707111034");
        System.out.println("Kelas   : Teknologi Informasi - C");
        System.out.println("================================================================" + WHITE);
        System.out.println();

        // Simulasi perjalanan Bus
        System.out.println(GREEN + "Dear Passengers, Welcome On Board, This Bus Is Bound for Terminal B" + WHITE);
        bus.startJourney(); // Memulai perjalanan bus
        bus.boardPassengers(30); // 30 penumpang naik
        bus.boardPassengers(20); // 20 penumpang naik lagi (kapasitas penuh: 50)
        bus.calculateFare(5); // Menghitung tarif perjalanan bus
        bus.stopJourney(); // Mengakhiri perjalanan bus
        bus.dropPassengers(50); // Semua penumpang turun
        System.out.println(GREEN + "Thank you for your trust in this TransJakarta\n" + WHITE);

        // Simulasi perjalanan Kereta
        System.out.println(GREEN + "Dear Passengers, Welcome On Board, This Train Is Bound For Stasiun Pusat" + WHITE);
        train.startJourney(); // Memulai perjalanan kereta
        train.boardPassengers(150); // 150 penumpang naik
        train.calculateFare(); // Menghitung tarif perjalanan kereta
        train.stopJourney(); // Mengakhiri perjalanan kereta
        train.dropPassengers(150); // Semua penumpang turun
        System.out.println(GREEN + "Thank You for your trust in this Commuter Line Train\n" + WHITE);

        // Simulasi perjalanan Taksi
        System.out.println(GREEN + "Hello Welcome To This Taxi Enjoy Your Ride" + WHITE);
        taxi.startJourney(); // Memulai perjalanan taksi
        taxi.boardPassengers(4); // 3 penumpang naik
        taxi.calculateFare(10); // Menghitung tarif perjalanan taksi
        taxi.stopJourney(); // Mengakhiri perjalanan taksi
        taxi.dropPassengers(4); // Semua penumpang turun
        System.out.println(GREEN + "Thank You For Your Trust To This BlueBird Taxi\n" + WHITE);
    }
}
