package Pertemuan12.Latihan2.Tugas;

public class Spesifikasi extends Mobil {
    private String warna;
    private String tipe;

    public Spesifikasi(String merk, String model, int tahun, double harga, String warna, String tipe) {
        super(merk, model, tahun, harga);
        this.warna = warna;
        this.tipe = tipe;
    }

    @Override
    public void displayInfo() {
        System.out.println("Merk: " + merk + ", Model: " + model + ", Tahun: " + tahun + ", Harga: " + harga);
        System.out.println("Warna: " + warna + ", Tipe: " + tipe);
    }
}


