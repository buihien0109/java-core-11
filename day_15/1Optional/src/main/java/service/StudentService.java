package service;

import exception.NotFoundException;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    // Tạo danh sách students để quản lý
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student(1, "Hiên", "hien@gmail.com"));
        students.add(new Student(2, "An", "an@gmail.com"));
        students.add(new Student(3, "Công", "cong@gmail.com"));
    }

    // 1. In ra danh sách student
    public void printStudents() {
        if(students.isEmpty()) {
            throw new NotFoundException("List student is empty!");
        }
        students.forEach(System.out::println);
    }

    // 2. Tìm kiếm student theo id
    public Student getStudentById(int id) {
        Optional<Student> optionalStudent = findStudent(id);
        if(optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        throw new NotFoundException("Can't find student with id = " + id);
    }

    // 3. Tìm kiếm student theo email
    public Student getStudentByEmail(String email) {
        Optional<Student> optionalStudent = findStudent(email);
        return optionalStudent.orElseThrow(() -> {
            throw new NotFoundException("Can't find student with email = " + email);
        });
    }

    // 4. Xóa student theo id
    public void deleteStudent(int id) {
        // Kiểm tra student có tồn tại hay không
        if(findStudent(id).isEmpty()) {
            throw new NotFoundException("Can't find student with id = " + id);
        }

        // Nếu tồn tại student thì xóa
        students.removeIf(s -> s.getId() == id);
    }

    // Helper Method
    // 1. Tìm kiếm học viên theo id -> đối tượng optional
    public Optional<Student> findStudent(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }

    // 2. Tìm kiếm học viên theo email -> đối tượng optional
    public Optional<Student> findStudent(String email) {
        return students.stream().filter(s -> s.getEmail().equals(email)).findFirst();
    }
}
