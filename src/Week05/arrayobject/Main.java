package Week05.arrayobject;

import Week04.Mahasiswaa;

public class Main {
    public static void main(String[] args) {
        
        Mahasiswaa[] students = {
                new Mahasiswaa("Ryz", 20, 60.5, 170.0),
                new Mahasiswaa("Ryz", 20, 60.5, 170.0),
                new Mahasiswaa("Ryz", 20, 60.5, 170.0),
                new Mahasiswaa("Ryz", 20, 60.5, 170.0),
                new Mahasiswaa("Ryz", 20, 60.5, 170.0),
        };
            for (Mahasiswaa mahasiswa : students) {
                System.out.println(mahasiswa.getNama());
        }
    }
}
    