package Pertemuan12.Latihan1;

public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2) {
        super(jari2);
    }

    public double luas() {
        return PHI * jari2 * jari2;
    }
}


