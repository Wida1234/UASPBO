public abstract class Kendaraan {
    protected String merek;
    protected int platnomer;


    public Kendaraan(String merek, int platnomer ){
        this.merek = merek;
        this.platnomer = platnomer;

    }
    public abstract void getInfo();

}