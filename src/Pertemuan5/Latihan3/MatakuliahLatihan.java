package Pertemuan5.Latihan3;

public class MatakuliahLatihan {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    public MatakuliahLatihan(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }
    public double nilaiIndex() {
        switch (index) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }
    public String display() {
        return kode + " - " + nama + " - " + index;
    }
    public int getSks() {
        return sks;
    }
}
