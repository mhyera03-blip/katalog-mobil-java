import java.util.ArrayList;
import java.util.List;

// ============================================================
//  MAIN CLASS — KatalogMobil
//  Mendemonstrasikan konsep Inheritance secara lengkap
// ============================================================
public class KatalogMobil {

    public static void main(String[] args) {

        printHeader();

        // ─── 1. MEMBUAT OBJEK DARI SETIAP SUBCLASS ───────────────
        // Polimorfisme: semua disimpan dalam List bertipe Kendaraan (parent)
        List<Kendaraan> katalog = new ArrayList<>();

        // --- Sedan ---
        MobilSedan sedan1 = new MobilSedan(
            "Toyota Camry", "Putih Mutiara", 2023,
            575_000_000, 2500, 4, true, "Matic"
        );
        MobilSedan sedan2 = new MobilSedan(
            "Honda Civic", "Merah", 2022,
            449_900_000, 1500, 4, false, "Matic"
        );

        // --- SUV ---
        MobilSUV suv1 = new MobilSUV(
            "Toyota Fortuner", "Hitam", 2024,
            598_000_000, 2400, 7, true, 220.0, "7-Seater"
        );
        MobilSUV suv2 = new MobilSUV(
            "Honda CR-V", "Silver", 2023,
            489_000_000, 1500, 5, false, 200.0, "5-Seater"
        );

        // --- Elektrik ---
        MobilElektrik ev1 = new MobilElektrik(
            "Tesla Model 3", "Biru Metalik", 2024,
            850_000_000, 75, 576, 25, 358
        );
        MobilElektrik ev2 = new MobilElektrik(
            "BYD Atto 3", "Putih", 2023,
            490_000_000, 60, 480, 30, 204
        );

        // Masukkan semua ke katalog (POLIMORFISME)
        katalog.add(sedan1);
        katalog.add(sedan2);
        katalog.add(suv1);
        katalog.add(suv2);
        katalog.add(ev1);
        katalog.add(ev2);

        // ─── 2. TAMPILKAN SEMUA INFO (override tampilkanInfo) ─────
        System.out.println("\n📋 ====== DETAIL SEMUA KENDARAAN ======\n");
        for (Kendaraan k : katalog) {
            k.tampilkanInfo();  // Polimorfisme: tiap objek pakai versinya sendiri
            System.out.println();
        }

        // ─── 3. DEMONSTRASI POLIMORFISME — nyalakanMesin() ────────
        System.out.println("🎯 ====== DEMO POLIMORFISME — nyalakanMesin() ======\n");
        for (Kendaraan k : katalog) {
            k.nyalakanMesin();  // Setiap subclass punya bunyi berbeda!
        }

        // ─── 4. DEMONSTRASI METHOD KHUSUS SUBCLASS ────────────────
        System.out.println("\n🚙 ====== FITUR KHUSUS SUV ======\n");
        suv1.aktifkanMode4x4();
        suv2.aktifkanMode4x4();

        System.out.println("\n⚡ ====== FITUR KHUSUS ELEKTRIK ======\n");
        System.out.println(">>> " + ev1.getMerk() + " :");
        ev1.cekBaterai();
        System.out.println("\n>>> " + ev2.getMerk() + " :");
        ev2.cekBaterai();

        // ─── 5. INSTANCEOF — Cek tipe objek saat runtime ──────────
        System.out.println("\n🔍 ====== CEK TIPE DENGAN instanceof ======\n");
        for (Kendaraan k : katalog) {
            String tipeLabel;
            if (k instanceof MobilElektrik) {
                tipeLabel = "⚡ Mobil Listrik";
            } else if (k instanceof MobilSUV) {
                tipeLabel = "🚙 SUV";
            } else if (k instanceof MobilSedan) {
                tipeLabel = "🚗 Sedan";
            } else {
                tipeLabel = "❓ Tidak Diketahui";
            }
            System.out.printf("%-22s → %s%n", k.getMerk(), tipeLabel);
        }

        // ─── 6. RINGKASAN KATALOG ─────────────────────────────────
        System.out.println("\n📊 ====== RINGKASAN KATALOG ======\n");
        System.out.println("Total kendaraan dalam katalog : " + katalog.size());

        double hargaMin = katalog.stream().mapToDouble(Kendaraan::getHarga).min().orElse(0);
        double hargaMax = katalog.stream().mapToDouble(Kendaraan::getHarga).max().orElse(0);
        double hargaAvg = katalog.stream().mapToDouble(Kendaraan::getHarga).average().orElse(0);

        System.out.printf("Harga termurah  : Rp %,.0f%n", hargaMin);
        System.out.printf("Harga termahal  : Rp %,.0f%n", hargaMax);
        System.out.printf("Harga rata-rata : Rp %,.0f%n", hargaAvg);

        printFooter();
    }

    static void printHeader() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║    🚘  KATALOG MOBIL — JAVA OOP            ║");
        System.out.println("║    Demonstrasi Konsep INHERITANCE          ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║  Kendaraan (Abstract Parent)               ║");
        System.out.println("║    ├── MobilSedan  (Subclass 1)            ║");
        System.out.println("║    ├── MobilSUV    (Subclass 2)            ║");
        System.out.println("║    └── MobilElektrik (Subclass 3)          ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    static void printFooter() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║  Konsep OOP yang digunakan:                ║");
        System.out.println("║  ✅ Inheritance   (extends)                ║");
        System.out.println("║  ✅ Abstract Class & Method                ║");
        System.out.println("║  ✅ Method Overriding (@Override)          ║");
        System.out.println("║  ✅ Polymorphism  (List<Kendaraan>)        ║");
        System.out.println("║  ✅ super() Constructor Call               ║");
        System.out.println("║  ✅ instanceof Check                       ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }
}
