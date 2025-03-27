package Week05.enkapsulasi;

public class Mahasiswa {
    private String nama = "Ryz";
    private int age;
    private String jurusan;


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNama() {
        return nama;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Usia tidak valid");
        }
    }

        public int getAge() {
            return age;
        }

        public void setJurusan(String jurusan) {
            this.jurusan =jurusan;
        }
    }
     