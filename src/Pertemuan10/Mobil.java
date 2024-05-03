package Pertemuan10;

public class Mobil {
    protected String merk, model;

    public Mobil(String merk, String model ) {
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }
}
