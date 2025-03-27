package Week05;

class Mahasiswa {

    String nama;
    int umur;

    static String Universitas = "Universitas Pertamina";

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void sayHello(String nama) {
        System.out.println("Hello, " + nama);
    }

    void sayHello2(String nama) {
        System.out.println("Hello2, " + nama);
    }

    void sayHello3(String nama) {
        System.out.println("Hello3, " + nama);
    }

    void sayHello4(String nama) {
        System.out.println("Hello4, " + nama);
    }

    String sayHello5(String nama, int umur, boolean isActive) {
        return "Hello5, " + nama + ". Umur: " + umur + ". Aktif: " + isActive;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20);
        System.out.println(mhs1.nama);
        System.out.println(mhs1.umur);

        System.out.println("====================");

        Mahasiswa mhs2 = new Mahasiswa("Ridho");
        System.out.println(mhs2.nama);

        System.out.println(Mahasiswa.Universitas);

        System.out.println("====================");

        mhs2.sayHello("Joko");
        mhs1.sayHello2("Joko");
        mhs1.sayHello3("Joko");
        mhs1.sayHello4("Joko");
        System.out.println(mhs1.sayHello5("Joko", 20, true));

        System.out.println("====================");
    }
}
