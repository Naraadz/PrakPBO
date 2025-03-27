package Week05.enkapsulasi;

public class Car {
    private String pemilik;
    private String brand;
    private int kapasitas;
    protected int jumlahBan;

    public Car(String pemilik, String brand, int kapasitas, int jumlahBan) {
        this.pemilik = pemilik;
        this.brand = brand;
        this.kapasitas = kapasitas;
        this.jumlahBan = jumlahBan;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getJumlahBan() {
        return jumlahBan;
    }

    public void setJumlahBan(int jumlahBan) {
        this.jumlahBan = jumlahBan;
    }

    public void tampilkanInfo() {
        System.out.println("Pemilik: " + pemilik);
        System.out.println("Brand: " + brand);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Jumlah Ban: " + jumlahBan);
    }
}
