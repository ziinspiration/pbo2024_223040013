package Pertemuan7;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa ()
    {
        // TODO Auto-generated constructor stub
    }

    public Mahasiswa (String nRP, String nama)
    {
        super();
        NRP = nRP;
        this.nama = nama;
    }
    public String display()
    {
        return "NRP: "+ NRP+ ", Nama: "+ nama;
    }

}