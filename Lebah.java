public class Lebah extends Hewan {
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    public void bernapas() {
        System.out.println("otot perut mengendur, udara masuk melalui ishang di pegmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("otot perut Berkontraksi, udara dikeluarkan");
    }

    public void bergerak() {
        System.out.println("Kengepakkan sayap ke depan");
        System.out.println("Memutar aayap hampir 50 derajat");
        System.out.println("Mengepakkan bayap ke belakang");
    }

    public void cetakInfo() {
        super.cetakInfo(); 
        System.out.println("Kasta :" + this.kasta);
    }
}
