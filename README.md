# 🚆🚖🚍 Simulasi Transportasi dengan Inheritance di Java

## 📌 Deskripsi

Proyek ini adalah implementasi konsep **inheritance (pewarisan)** dalam pemrograman Java untuk mensimulasikan berbagai jenis kendaraan, seperti **Bus, Kereta, dan Taksi**. Setiap kendaraan memiliki atribut dan metode dasar yang diwarisi dari superclass `Vehicle`, sementara perhitungan tarif (`calculateFare()`) di-*override* sesuai dengan logika masing-masing kendaraan.

## 🛠️ Teknologi yang Digunakan
- **Java** (versi 8 atau lebih baru)
- **OOP (Object-Oriented Programming)**

## 📂 Struktur Proyek
```
praktic/inheritance/
│── mains/
│   └── Main.java      # Program utama
│── transportation/
│   ├── Vehicle.java   # Superclass untuk semua kendaraan
│   ├── Bus.java       # Subclass untuk Bus
│   ├── Train.java     # Subclass untuk Kereta
│   └── Taxi.java      # Subclass untuk Taksi
```

## 🎯 Fitur Utama
✅ **Pewarisan (Inheritance)**: `Bus`, `Train`, dan `Taxi` mewarisi atribut dan metode dari `Vehicle`.
✅ **Polimorfisme (Overriding)**: Metode `calculateFare()` di-*override* di setiap subclass untuk menghitung tarif perjalanan berdasarkan aturan masing-masing kendaraan.
✅ **Enkapsulasi (Encapsulation)**: Atribut seperti `currentPassengers` diakses melalui metode `getCurrentPassengers()` dan `setCurrentPassengers()`.
✅ **Simulasi Perjalanan**: Setiap kendaraan dapat memulai (`startJourney()`), menaikkan (`boardPassengers()`), menurunkan (`dropPassengers()`), dan mengakhiri perjalanan (`stopJourney()`).

## 🚀 Cara Menjalankan Program
1. **Clone repository ini**
   ```bash
   git clone https://github.com/username/nama-repo.git
   cd nama-repo
   ```
2. **Kompilasi semua file Java**
   ```bash
   javac praktic/inheritance/mains/Main.java
   ```
3. **Jalankan program**
   ```bash
   java praktic.inheritance.mains.Main
   ```

## 📌 Contoh Output
```bash
================================================================
Nama    : Naufaldi Alfaghani
NIM     : 245150707111034
Kelas   : Teknologi Informasi - C
================================================================

--- Dear Passengers, Welcome On Board, This Bus Is Bound for Terminal B ---
Bus TransJakarta memulai perjalanan di Terminal A - Terminal B
30 penumpang naik ke dalam Bus TransJakarta
20 penumpang naik ke dalam Bus TransJakarta
Total penumpang: 50
Total tarif perjalanan bus: Rp 500000
Bus TransJakarta mencapai tujuan akhir dan berhenti
50 penumpang turun dari Bus TransJakarta
--- Thank you for your trust in this TransJakarta --->
...
```

## 📜 Lisensi
Proyek ini dibuat untuk tujuan pembelajaran dan bersifat open-source.

## 👨‍💻 Kontributor
- **Naufaldi Alfaghani** (245150707111034)

Jika kamu suka proyek ini, jangan lupa ⭐ **star repository ini** di GitHub! 😊

