class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("nilai nama milik subclass: " + nama);
        System.out.println("nilai nama milik superclass: " + super.nama);
    }
}

public class DetectiveAttribute {
    public static void main(String[] args) {
        GedungSekolah ABC = new GedungSekolah();
        ABC.tampilkanInfo();
    }
}