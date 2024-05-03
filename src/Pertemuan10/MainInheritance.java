package Pertemuan10;

public class MainInheritance {
    public static void main(String[] args) {
        Sparepart sparepart = new Sparepart("Headlamp", "Toyota", "Veloz");
        System.out.println("Sparepart: " + sparepart.getSparepart() + ", Mobil: " + sparepart.getMerk() + " " + sparepart.getModel());
    }
}


