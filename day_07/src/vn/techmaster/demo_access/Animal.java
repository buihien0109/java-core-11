package vn.techmaster.demo_access;

public class Animal {
    public static void main(String[] args) {
        Person person = new Person("Nguyễn Văn A", 22, "a@gmail.com", 1_000_000);

        // Name không thể truy cập outside class
        System.out.println(person.salary);
        System.out.println(person.email);
        System.out.println(person.age);
    }
}
