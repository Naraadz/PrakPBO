package Week04;

public class Mahasiswa {

    // Atribut
    String nama;
    String nim;
    String jurusan;
    boolean isLulus =  false; //default value
    static int angkatan = 2019;


    // Konstruktor
    // Mahasiswa(String nama, String nim, String jurusan) {
    //    this.nama = nama;
    //    this.nim = nim;
    //    this.angkatan = angkatan;
    // }

    // Konstrutor berparameter
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method
    void belajar() {
            System.out.println(nama + " sedang belajar di kelas");
    }

    public void belajar(String nama) {
        System.out.println(this.nama + " sedang belajar ");
    }

    public String getNama() {
            return this.nama;
    }

    // Method Statis
    static void kuliah() {
        System.out.println("Mahasiswa sedang kuliah");
    }

    // inner Class
    class Dalam {
        void test() {
            System.out.println("ini adalah inner class");
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Ryz", "123456", "Informatika");
        mhs.belajar();
        mhs.belajar("Pemrograman Java");

        Mahasiswa.kuliah();
        
        Mahasiswa.Dalam inner = mhs.new Dalam();
        inner.test();
    }
}

    

