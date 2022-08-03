package OOP1.bai3;

public class SinhVien {
    private int id, age;
    private String name, address;
    private float gpa;

    public SinhVien(int id, String name, int age, String address, float gpa) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Float getGpa() {
        return gpa;
    }
}
