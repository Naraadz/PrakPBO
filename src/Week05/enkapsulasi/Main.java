package Week05.enkapsulasi;

public class Main {
    public static void main(String[] args) {
      Mahasiswa mhs1 = new Mahasiswa();
      // System.out.println(mhs1.nama);
      // System.out.println(mhs1.nama); 
      
      System.out.println(mhs1.getNama());

      mhs1.setNama("Ryn");
      System.out.println(mhs1.getNama());

      mhs1.setAge(20);
      System.out.println(mhs1.getAge());
      mhs1.setAge(-20);
      // System.out.println(mhs1.getAge());

      Car mycar1 = new Car();
      System.out.println(mycar1.getPemilik());
      System.out.println(mycar1.getJumlahBan());

    }
}   