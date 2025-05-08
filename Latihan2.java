class Kendaraan {
    Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan { // subclass atau class child
    String merk = "BMW";

    Mobil() {
        super();
        System.out.println("ini child konstruktor");
    }
}

public class Latihan2 {
    public static void main(String[] args) {
        Mobil BMW = new Mobil();
    }
}