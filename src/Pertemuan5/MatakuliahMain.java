package Pertemuan5;

public class MatakuliahMain {
    public static void main(String[] args)
    {
        MataKuliah mk1 = new MataKuliah("001","Algoritma Pemograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002","Algoritma Pemograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003","Pemograman Berorientasi Objek", "B", 3);

        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- NILAI IPK ---");
        // Bagaimana Rumus IPK ?
        // Rumus: (index nilai*sks) + (index nilai*sks) +..+ (index nilai*sks)/total_sks
    }
}
