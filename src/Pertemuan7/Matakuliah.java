package Pertemuan7;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    public Matakuliah(String kode, String nama, String index, int sks)
    {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex()
    {
        return 0;
    }

    public String display() {
        return kode + " - " + nama + " - " + index + " - " + sks;
    }
}