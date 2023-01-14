public class Motor extends Kendaraan{
    protected int grade;

    public Motor(String merek, int tahunProduksi, int platnomer){
        super(merek,platnomer);
        this.platnomer = platnomer;
    }

    public Motor(String merek, int platnomer) {
        super(merek, platnomer);
    }

    @Override
    public void getInfo(){
        System.out.println("merek : " + merek);
        System.out.println("platnomer : " + platnomer );
    }
}