package Pertemuan7;

import java.util.List;
import java.util.ArrayList;
public class KartuHasilStudi
{
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;
    public KartuHasilStudi (String semester)
    {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    public void addMatakuliah (Matakuliah matakuliah)
    {
        daftarMatakuliah.add (matakuliah);
    }
    public String display()
    {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah)
        {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }
    public void hitungIPS()
    {

    }
}
