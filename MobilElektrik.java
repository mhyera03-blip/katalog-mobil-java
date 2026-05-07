// ============================================================
//  SUBCLASS 3 — MobilElektrik
//  Mewarisi dari Kendaraan, override logika mesin (listrik!)
// ============================================================
public class MobilElektrik extends Kendaraan {

    // Atribut TAMBAHAN khusus mobil listrik
    private int kapasitasBaterai;   // kWh
    private int jangkauanMaksimal;  // km per charge
    private int waktuPengisian;     // menit (fast charge)
    private int tenagaMotor;        // hp

    public MobilElektrik(String merk, String warna, int tahunProduksi,
                         double harga, int kapasitasBaterai,
                         int jangkauanMaksimal, int waktuPengisian,
                         int tenagaMotor) {

        // Mobil listrik tidak punya mesin cc, jadi isi 0
        super(merk, warna, tahunProduksi, harga, 0);
        this.kapasitasBaterai  = kapasitasBaterai;
        this.jangkauanMaksimal = jangkauanMaksimal;
        this.waktuPengisian    = waktuPengisian;
        this.tenagaMotor       = tenagaMotor;
    }

    @Override
    public String getTipe() {
        return "ELEKTRIK";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        ⚡  MOBIL ELEKTRIK             ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf ("║  Merk            : %-16s ║%n", merk);
        System.out.printf ("║  Warna           : %-16s ║%n", warna);
        System.out.printf ("║  Tahun           : %-16d ║%n", tahunProduksi);
        System.out.printf ("║  Tenaga Motor    : %-13s hp ║%n", tenagaMotor);
        System.out.printf ("║  Baterai         : %-13s kWh ║%n", kapasitasBaterai);
        System.out.printf ("║  Jangkauan       : %-13s km ║%n", jangkauanMaksimal);
        System.out.printf ("║  Waktu Cas       : %-13s min ║%n", waktuPengisian);
        System.out.printf ("║  Harga           : Rp %-13s ║%n", String.format("%,.0f", harga));
        System.out.println("╚══════════════════════════════════════╝");
    }

    // Override nyalakanMesin — sangat berbeda dari BBM
    @Override
    public void nyalakanMesin() {
        System.out.println("⚡ " + merk + " aktif secara senyap... *hening sempurna* 🌿");
    }

    // Method khusus elektrik
    public void cekBaterai() {
        System.out.println("🔋 Kapasitas Baterai : " + kapasitasBaterai + " kWh");
        System.out.println("📍 Jangkauan Penuh   : " + jangkauanMaksimal + " km");
        System.out.println("⚡ Waktu Pengisian   : " + waktuPengisian + " menit (fast charge)");
    }

    public int getKapasitasBaterai()  { return kapasitasBaterai; }
    public int getJangkauanMaksimal() { return jangkauanMaksimal; }
    public int getWaktuPengisian()    { return waktuPengisian; }
    public int getTenagaMotor()       { return tenagaMotor; }
}
