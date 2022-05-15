package vn.techmaster.test.service;

import vn.techmaster.test.model.Student;

import java.util.ArrayList;

public interface StudentService {
    void prinInfo();
    Student createStudent();
    void deleteStudent(int id);
    ArrayList<Student> getStudents();
}
