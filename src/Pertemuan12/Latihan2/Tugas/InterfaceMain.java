package Pertemuan12.Latihan2.Tugas;

public class InterfaceMain {
    public static void main(String[] args) {
        Mobil mobil1 = new Spesifikasi("Volkswagen", "Karman Ghia", 1955, 500000000, "Orange", "Coupe");
        mobil1.displayInfo();

        Mobil mobil2 = new Spesifikasi("Volkswagen", "Beetle", 1973, 100000000, "Putih", "Hatchback");
        mobil2.displayInfo();

        Mobil mobil3 = new Spesifikasi("Volkswagen", "Combi", 1975, 120000000, "Merah", "Microbus ");
        mobil3.displayInfo();
    }
}


