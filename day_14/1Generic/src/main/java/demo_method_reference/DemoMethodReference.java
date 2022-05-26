package demo_method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Hello {
    void display();
}

public class DemoMethodReference {
    public static void main(String[] args) {
        // Tạo 1 list student
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", "an@gmail.com"));
        students.add(new Student(2, "Việt", "viet@gmail.com"));
        students.add(new Student(3, "Hùng", "hung@gmail.com"));

        // In ra thông tin student
        students.forEach(Student::printInfo);
        students.forEach(System.out::println);
        students.forEach(student -> System.out.println(student));

        // Sắp xếp theo tên
        System.out.println();

        students.sort(Comparator.comparing(Student::getName).reversed());
        students.forEach(System.out::println);

        // Triển khai functional interface dựa trên method reference
        Student student = new Student(1, "An", "an@gmail.com");
        Hello h = student::printInfo;
        h.display();

        Hello h1 = () -> System.out.println(student.getId() + " - " + student.getName() + " - " + student.getEmail());
        h1.display();
    }
}
