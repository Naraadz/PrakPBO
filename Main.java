import java.util.Date;

class HealthRecord {
    private String recordNumber;
    private Date recordDate;

    HealthRecord(String recordNumber, Date recordDate) {
        this.recordNumber = recordNumber;
        this.recordDate = recordDate;
    }

    String getRecordNumber() {
        return recordNumber;
    }

    Date getRecordDate() {
        return recordDate;
    }
}

abstract class Animal {
    HealthRecord healthRecord;

    Animal(String recordNumber, Date recordDate) {
        healthRecord = new HealthRecord(recordNumber, recordDate);
    }

    abstract String makeSound();
}

class Dog extends Animal {
    Dog(String recordNumber, Date recordDate) {
        super(recordNumber, recordDate);
    }

    String makeSound() {
        return "Guk-Guk!";
    }
}

class Cat extends Animal {
    Cat(String recordNumber, Date recordDate) {
        super(recordNumber, recordDate);
    }

    String makeSound() {
        return "Meong!";
    }
}

class Owner {
    String name;
    Animal pet;

    Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + name);
        System.out.println("Suara Hewan: " + pet.makeSound());

        if (pet instanceof Dog) {
            System.out.println("Jenis Hewan: Dog");
        } else if (pet instanceof Cat) {
            System.out.println("Jenis Hewan: Cat");
        }

        System.out.println("Nomor Rekam Medis: " + pet.healthRecord.getRecordNumber());
        System.out.println("Tanggal Rekam Medis: " + pet.healthRecord.getRecordDate());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("101", new Date());
        Cat cat = new Cat("102", new Date());

        Owner owner1 = new Owner("Dan", dog);
        Owner owner2 = new Owner("Cath", cat);

        owner1.tampilkanInfo();
        owner2.tampilkanInfo();
    }
}
