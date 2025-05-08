class kendaraan { // superclass atau class parent
    String merk = "Honda";

    kendaraan() {
        System.out.println("ini parent konstruktor");
    }

    void jalan() {
        System.out.println("Kendaraan sedang berjalan");
    }
        
}


class Mobil extends kendaraan { // subclass atau class child
    String merk = "BMW";
    Mobil() {
        super();
        System.out.println("ini child konstruktor");
    }

    void printInfo() {
        System.out.println("merk mobil child " + merk);
        System.out.println("merk mobil parent " +super.merk);
        jalan();
    }
    
    void klakson() {
        String merk = "BMW";
        System.out.println("Mobil " + merk + " klakson");
    }

}
public class Main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        jazz.jalan();
        jazz.klakson();
    }
}
