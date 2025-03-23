package praktic.inheritance.transportation; // Mendeklarasikan package tempat class ini berada

public class Vehicle { // Deklarasi class Vehicle sebagai class dasar
    private String name; // Nama kendaraan
    private int capacity; // Kapasitas kendaraan
    private int currentPassengers; // Jumlah penumpang saat ini
    private String route; // Rute perjalanan kendaraan

    // Constructor untuk menginisialisasi objek Vehicle
    public Vehicle(String name, int capacity, String route) {
        this.name = name; // Mengisi nama kendaraan
        this.capacity = capacity; // Mengisi kapasitas kendaraan
        this.route = route; // Mengisi rute perjalanan
        this.currentPassengers = 0; // Menginisialisasi jumlah penumpang awal ke 0
    }

    // Getter Methods (untuk mendapatkan nilai dari atribut private)
    public String getName() {
        return name; // Mengembalikan nama kendaraan
    }

    public int getCapacity() {
        return capacity; // Mengembalikan kapasitas kendaraan
    }

    public int getCurrentPassengers() {
        return currentPassengers; // Mengembalikan jumlah penumpang saat ini
    }

    public String getRoute() {
        return route; // Mengembalikan rute kendaraan
    }

    // Setter Method untuk mengatur jumlah penumpang
    public void setCurrentPassengers(int passengers) {
        if (passengers >= 0 && passengers <= capacity) { // Memeriksa apakah jumlah penumpang valid
            this.currentPassengers = passengers; // Mengatur jumlah penumpang
        } else {
            System.out.println("Jumlah penumpang tidak valid!"); // Pesan jika jumlah penumpang tidak valid
        }
    }

    // Method untuk memulai perjalanan kendaraan
    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    // Method untuk menghentikan perjalanan kendaraan
    public void stopJourney() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti");
    }

    // Method untuk menambahkan penumpang ke dalam kendaraan
    public void boardPassengers(int count) {
        if (currentPassengers + count <= capacity) { // Memeriksa apakah kapasitas masih cukup
            setCurrentPassengers(currentPassengers + count); // Menambah jumlah penumpang
            System.out.println(count + " penumpang naik ke dalam " + name);
        } else {
            System.out.println("Kapasitas penuh! Tidak bisa menambah " + count + " penumpang."); // Pesan jika kapasitas penuh
        }
    }

    // Method untuk menurunkan penumpang dari kendaraan
    public void dropPassengers(int count) {
        if (currentPassengers - count >= 0) { // Memeriksa apakah jumlah penumpang tidak menjadi negatif
            setCurrentPassengers(currentPassengers - count); // Mengurangi jumlah penumpang
            System.out.println(count + " penumpang turun dari " + name);
        } else {
            System.out.println("Jumlah penumpang tidak bisa negatif!"); // Pesan jika jumlah penumpang tidak valid
        }
    }

    // Method calculateFare() yang akan di-override oleh subclass
    public void calculateFare() {
        System.out.println("Tarif perjalanan belum ditentukan."); // Method default, bisa di-override oleh subclass
    }
}
