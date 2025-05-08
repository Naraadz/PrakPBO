class hewan { // superclass atau class parent
    String suara = "suara milik hewan..";

    hewan() {
        System.out.println("ini parent konstruktor");
    }

    void suara() {
        System.out.println("suara hewan");
    }
        
}


class Kucing extends hewan { // subclass atau class child
    String suara = "Meong";
    Kucing() {
        super();
        System.out.println("ini child konstruktor");
    }

    void tampilkanSuara() {
        System.out.println("Suara milik kelas kucing" + suara);
        System.out.println("Suara milik kelas hewan" + super.suara);
    }

    void printInfo() {
        System.out.println("suara hewan child " + suara);
        System.out.println("suara hewan parent " + super.suara);
        suara();
    }

}
public class Latihan {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.tampilkanSuara();
        k.printInfo();
    }
}
