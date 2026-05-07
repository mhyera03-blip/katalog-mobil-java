// ============================================================
//  SUBCLASS 2 — MobilSUV
//  Mewarisi dari Kendaraan, dengan atribut tambahan SUV
// ============================================================
public class MobilSUV extends Kendaraan {

    // Atribut TAMBAHAN khusus SUV
    private int kapasitasPenumpang;
    private boolean gardan4x4;
    private double groundClearance; // mm
    private String jenisBodywork;   // misal: 7-seater, 5-seater

    public MobilSUV(String merk, String warna, int tahunProduksi,
                    double harga, int kapasitasMesin,
                    int kapasitasPenumpang, boolean gardan4x4,
                    double groundClearance, String jenisBodywork) {

        super(merk, warna, tahunProduksi, harga, kapasitasMesin);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.gardan4x4          = gardan4x4;
        this.groundClearance    = groundClearance;
        this.jenisBodywork      = jenisBodywork;
    }

    @Override
    public String getTipe() {
        return "SUV";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           🚙  MOBIL SUV               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf ("║  Merk            : %-16s ║%n", merk);
        System.out.printf ("║  Warna           : %-16s ║%n", warna);
        System.out.printf ("║  Tahun           : %-16d ║%n", tahunProduksi);
        System.out.printf ("║  Mesin           : %-13s cc ║%n", kapasitasMesin);
        System.out.printf ("║  Bodywork        : %-16s ║%n", jenisBodywork);
        System.out.printf ("║  Kapasitas       : %-13s org ║%n", kapasitasPenumpang);
        System.out.printf ("║  Gardan 4x4      : %-16s ║%n", gardan4x4 ? "Ya" : "Tidak");
        System.out.printf ("║  Ground Clearance: %-13s mm ║%n", groundClearance);
        System.out.printf ("║  Harga           : Rp %-13s ║%n", String.format("%,.0f", harga));
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("🔑 " + merk + " SUV menyala... GROAAARRR! 💪");
    }

    // Method khusus SUV
    public void aktifkanMode4x4() {
        if (gardan4x4) {
            System.out.println("⚙️  Mode 4x4 diaktifkan! Siap melewati medan berat.");
        } else {
            System.out.println("❌ " + merk + " tidak memiliki fitur 4x4.");
        }
    }

    public int getKapasitasPenumpang() { return kapasitasPenumpang; }
    public boolean isGardan4x4()       { return gardan4x4; }
    public double getGroundClearance()  { return groundClearance; }
    public String getJenisBodywork()    { return jenisBodywork; }
}
