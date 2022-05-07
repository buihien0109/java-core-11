package vn.techmaster.thisdemo;

public class Student {
    public String name;
    public int age;
    public Gender gender;

    public static String school = "Lê Quý Đôn";

    public Student() {
        System.out.println("Constructor mặc định được gọi");
    }

    public Student(String name) {
        System.out.println("Constructor 1 tham số được gọi");
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        System.out.println("Constructor 2 tham số được gọi");
        this.age = age;
    }

    public Student(String name, int age, Gender gender) {
        this(name, age);
        this.gender = gender;
        System.out.println("Constructor full tham số được gọi");
    }

    public static void sayHello() {
        System.out.println("Hello : ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Đây là hàm main của Student");
    }

    static {
        System.out.println("Đây là khối static");
    }
}
