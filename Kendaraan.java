// ============================================================
//  BASE CLASS (Superclass / Parent Class)
//  Kelas induk yang menjadi blueprint umum untuk semua kendaraan
// ============================================================
public abstract class Kendaraan {

    // Atribut (field) yang diwarisi semua subclass
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    protected double harga;
    protected int kapasitasMesin; // cc

    // Constructor
    public Kendaraan(String merk, String warna, int tahunProduksi, double harga, int kapasitasMesin) {
        this.merk          = merk;
        this.warna         = warna;
        this.tahunProduksi = tahunProduksi;
        this.harga         = harga;
        this.kapasitasMesin = kapasitasMesin;
    }

    // Method biasa yang bisa diwarisi
    public void nyalakanMesin() {
        System.out.println("🔑 " + merk + " menyala... Vroom!");
    }

    public void matikanMesin() {
        System.out.println("🔑 " + merk + " dimatikan.");
    }

    // Method yang WAJIB di-override oleh subclass (abstract method)
    public abstract String getTipe();
    public abstract void tampilkanInfo();

    // Getter
    public String getMerk()          { return merk; }
    public String getWarna()         { return warna; }
    public int getTahunProduksi()    { return tahunProduksi; }
    public double getHarga()         { return harga; }
    public int getKapasitasMesin()   { return kapasitasMesin; }

    // Method toString untuk tampilan ringkas
    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%d)", getTipe(), merk, warna, tahunProduksi);
    }
}
