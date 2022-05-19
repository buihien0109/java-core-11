package vn.techmaster.demo_inheritance;

import vn.techmaster.demo_access.Person;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age, String email, int salary) {
        super(name, age, email, salary);
    }

    public static void main(String[] args) {
        Student std = new Student("Nguyễn Văn A", 22, "a@gmail.com", 1_000_000);
        System.out.println(std.age); // public
        System.out.println(std.email); // protected
    }
}
