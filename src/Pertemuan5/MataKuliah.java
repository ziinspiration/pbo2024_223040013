package Pertemuan5;

public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    public MataKuliah(String kode, String nama, String index, int sks)
    {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex()
    {
        // Berdasarkan index matakuliah
        // A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, D = 1, E = 0
        return 0;
    }

    public String display()
    {
        return kode + " - "+ nama + " - "+ index;
    }
}
