package Pertemuan3;

public class Lingkaran {

    int Nilai;

    public Lingkaran(int nilai) {
        this.Nilai = nilai;
    }

    public int getNilai() {
        return Nilai;
    }

    public void setNilai(int nilai) {
        Nilai = nilai;
    }

    public void Show() {
        System.out.println("Nilai Lingkaran : " + getNilai());
    }
}
