package Pertemuan5.Latihan3;

public class MatakuliahMainLatihan {
    public static void main(String[] args) {
        MatakuliahLatihan mk1 = new MatakuliahLatihan("001", "Algoritma Pemograman 1", "A", 3);
        MatakuliahLatihan mk2 = new MatakuliahLatihan("002", "Algoritma Pemograman 2", "BC", 3);
        MatakuliahLatihan mk3 = new MatakuliahLatihan("003", "Pemograman Berorientasi Objek", "B", 3);

        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- NILAI IPK ---");
        double totalBobot = mk1.nilaiIndex() * mk1.getSks() + mk2.nilaiIndex() * mk2.getSks() + mk3.nilaiIndex() * mk3.getSks();
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double ipk = totalBobot / totalSks;
        String formattedIpk = String.format("%.2f", ipk);
        System.out.println("IPK: " + formattedIpk);
    }
}
