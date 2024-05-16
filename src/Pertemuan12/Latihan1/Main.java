package Pertemuan12.Latihan1;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.getJari2());
        System.out.println("luas: " + lingkaran.luas());

        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi: " + tabung.getTinggi());
        System.out.println("luas: " + tabung.luas());
    }
}

