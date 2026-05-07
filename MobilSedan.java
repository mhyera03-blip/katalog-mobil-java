// ============================================================
//  SUBCLASS 1 — MobilSedan
//  Mewarisi semua atribut dan method dari Kendaraan
// ============================================================
public class MobilSedan extends Kendaraan {

    // Atribut TAMBAHAN khusus sedan
    private int jumlahPintu;
    private boolean sunroof;
    private String transmisi; // Manual / Matic

    // Constructor — memanggil constructor parent dengan super()
    public MobilSedan(String merk, String warna, int tahunProduksi,
                      double harga, int kapasitasMesin,
                      int jumlahPintu, boolean sunroof, String transmisi) {

        super(merk, warna, tahunProduksi, harga, kapasitasMesin); // panggil parent
        this.jumlahPintu = jumlahPintu;
        this.sunroof     = sunroof;
        this.transmisi   = transmisi;
    }

    // Override method abstract dari parent
    @Override
    public String getTipe() {
        return "SEDAN";
    }

    // Override tampilkanInfo() — menambahkan info spesifik sedan
    @Override
    public void tampilkanInfo() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          🚗  MOBIL SEDAN              ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf ("║  Merk          : %-18s ║%n", merk);
        System.out.printf ("║  Warna         : %-18s ║%n", warna);
        System.out.printf ("║  Tahun         : %-18d ║%n", tahunProduksi);
        System.out.printf ("║  Mesin         : %-15s cc ║%n", kapasitasMesin);
        System.out.printf ("║  Transmisi     : %-18s ║%n", transmisi);
        System.out.printf ("║  Jumlah Pintu  : %-18d ║%n", jumlahPintu);
        System.out.printf ("║  Sunroof       : %-18s ║%n", sunroof ? "Ada" : "Tidak Ada");
        System.out.printf ("║  Harga         : Rp %-15s ║%n", String.format("%,.0f", harga));
        System.out.println("╚══════════════════════════════════════╝");
    }

    // Override nyalakanMesin — POLIMORFISME!
    @Override
    public void nyalakanMesin() {
        System.out.println("🔑 " + merk + " Sedan menyala dengan halus... Prrrr~");
    }

    // Getter tambahan
    public int getJumlahPintu()  { return jumlahPintu; }
    public boolean isSunroof()   { return sunroof; }
    public String getTransmisi() { return transmisi; }
}
