package vn.techmaster.test.service;

import vn.techmaster.test.model.Student;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService{
    private ArrayList<Student> students;

    public StudentServiceImpl() {
        students = new ArrayList<>();
    }

    @Override
    public void prinInfo() {
        for (Student s: students) {
            System.out.println(s);
        }
    }

    @Override
    public Student createStudent() {
        return null;
    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public ArrayList<Student> getStudents() {
        return students;
    }
}
