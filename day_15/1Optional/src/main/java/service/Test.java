package service;

import exception.NotFoundException;
import model.Student;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // In ra thông tin học viên
        try {
            studentService.printStudents();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Tìm kiếm học viên theo id
        System.out.println();
        try {
            // Học viên có id hợp lệ
            Student student = studentService.getStudentById(1);
            System.out.println(student);

            // Học viên có id không tồn tại
            Student student1 = studentService.getStudentById(10);
            System.out.println(student1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Tìm kiếm học viên theo email
        System.out.println();
        try {
            // Học viên có email hợp lệ
            Student student = studentService.getStudentByEmail("an@gmail.com");
            System.out.println(student);

            // Học viên có email không tồn tại
            Student student1 = studentService.getStudentByEmail("abc@gmail.com");
            System.out.println(student1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Xóa student theo id
        System.out.println();
        try {
            // Xóa học viên có id hợp lệ
            studentService.deleteStudent(1);
            studentService.printStudents();

            // Xóa học viên có id hợp lệ
            studentService.deleteStudent(10);
            studentService.printStudents();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
