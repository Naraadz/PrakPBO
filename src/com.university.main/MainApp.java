class Student {
    private String studentId;
    private String name;
    protected int age;
    public double gpa;

    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.println("ID: " + studentId + ", Nama: " + name + ", Umur: " + age + ", GPA: " + gpa);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Student[] students = {
            new Student("S001", "Alice", 20, 3.8),
            new Student("S002", "Bob", 22, 3.6),
            new Student("S003", "Charlie", 21, 3.9),
            new Student("S004", "David", 23, 3.5),
            new Student("S005", "Eve", 19, 3.7)
        };
        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            student.printStudentInfo();
        }
    }
}
    

