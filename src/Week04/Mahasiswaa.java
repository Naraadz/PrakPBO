package Week04;

public class Mahasiswaa {

    // Atribut
    String nama;
    int umur;
    double beratBadan;
    double tinggiBadan;

    public Mahasiswaa(String nama, int umur, double beratBadan, double tinggiBadan) {
        this.nama = nama;
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Berat Badan: " + beratBadan);
        System.out.println("Tinggi Badan: " + tinggiBadan);
    }

    public String getNama() {
            return nama;
    }

    // Method Statis
    public static void staticMethod() {
        System.out.println("Static Method");
    }

    // inner Class
    public class InnerClass {
        public void innderMethod() {
            System.out.println("Ini adalah inner class");
        }

        public static void main(String[] args) {
            Mahasiswaa mahasiswa = new Mahasiswaa("Ryz", 20, 60.5, 170.0);
            mahasiswa.tampilkanInfo();
    
            // Memanggil method static
            Mahasiswaa.staticMethod();
    
            // Membuat instance dari inner class
            Mahasiswaa.InnerClass inner = mahasiswa.new InnerClass();
            inner.getClass();
        }
    }
    
}
            
    

