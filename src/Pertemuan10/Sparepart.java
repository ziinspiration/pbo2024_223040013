package Pertemuan10;

public class Sparepart extends Mobil {
    private String sparepart;

    public Sparepart(String sparepart, String merk, String model ) {
        super(merk, model );
        setSparepart(sparepart);
    }

    public void setSparepart(String sparepart) {
        this.sparepart = sparepart;
    }

    public String getSparepart() {
        return sparepart;
    }
}

