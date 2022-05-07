package vn.techmaster.thisdemo;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Nguyễn Văn A", 20, Gender.MALE);
        System.out.println(student);

        System.out.println(Student.school);
        Student.sayHello();

        String name = "nanbcnc";
        name.trim().toLowerCase().substring(0, 5).length();
    }
}
