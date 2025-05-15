import java.time.LocalDate;

class Vehicle {
    void startEngine() {
    }
}

class Car extends Vehicle {
}

class Motorcycle extends Vehicle {
}

class License {
    private String nomorLisensi;
    private LocalDate validUntil;

    public License(String nomorLisensi) {
        this.nomorLisensi = nomorLisensi;
        this.validUntil = LocalDate.now().plusYears(5);
    }

    public String getNomorLisensi() {
        return nomorLisensi;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }
}

class Driver {
    private String nama;
    private Vehicle vehicle;
    private License license;

    public Driver(String nama, Vehicle vehicle, String nomorLisensi) {
        this.nama = nama;
        this.vehicle = vehicle;
        this.license = new License(nomorLisensi);
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pengemudi: " + nama);
        System.out.print("Jenis Kendaraan: ");

        if (vehicle instanceof Car) {
            System.out.println("Car");
            System.out.println("Status Mesin: Mesin Mobil Nyala");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Motorcycle");
            System.out.println("Status Mesin: Mesin Motor Nyala");
        } else {
            System.out.println("Tidak diketahui");
        }

        System.out.println("Nomor Lisensi: " + license.getNomorLisensi());
        System.out.println("Tanggal Berlaku Lisensi: " + license.getValidUntil());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Mark", new Car(), "101");
        Driver driver2 = new Driver("June", new Motorcycle(), "102");

        driver1.tampilkanInfo();
        driver2.tampilkanInfo();
    }
}
