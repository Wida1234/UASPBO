public class Pengemudi {
    private final String merek;
    private String getMerek;
    private int usia;
    private Kendaraan Kendaraan;

    public Pengemudi(String merek, int usia){
        this.merek = merek;
        this.usia = usia;
    }

    public void setKendaraan(Kendaraan Kendaraan){
        this.Kendaraan = Kendaraan;
    }
    public String getMerek(){
        return merek;
    }

    public int getUsia(){
        return usia;
    }

    public Kendaraan getKendaraan(){
        return Kendaraan;
    }
}