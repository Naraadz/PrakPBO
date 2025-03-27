package Week05;

public class Mahasiswa {

    // variabel instance
    String nama = "Ryz";
    int age = 20;

    // Variabel static/kelas
    static String universitas = "Universitas Pertamina";

    public Mahasiswa() {
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        String nama = "Ryz";
        System.out.println(Mahasiswa.universitas);
        System.out.println(nama);
    }

    public void sayHello(String nama) {
        System.out.println("Nama : " + nama);
    }

    // String nama2 = "An";
    public String sayHello2(String nama, int age, boolean isLulus) {
        return nama;
    }

}



