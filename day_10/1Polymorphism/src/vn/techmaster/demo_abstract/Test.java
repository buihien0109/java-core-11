package vn.techmaster.demo_abstract;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        // Không thể trực tiếp khởi tạo đối tượng từ class abstract --> error
        // Employee employee = new Employee();

        // Khởi tạo đối tượng từ class Developer
        Developer developer = new Developer(1, "Nguyễn Văn A", "a@gmail.com", 2_000_000, 20);
        developer.register();
        System.out.println(developer.calculateSalary());

        // Khởi tạo đối tượng từ class Tester
        Tester tester = new Tester(2, "Trần B", "b@gmail.com", 3_000_000, 40);
        tester.register();
        System.out.println(tester.calculateSalary());

        // Tính lương cho 1 danh sách nhân viên
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(developer);
        employees.add(new Developer(3, "Ngô C", "c@gmail.com", 2_500_000, 30));
        employees.add(tester);
        employees.add(new Tester(4, "Bùi D", "d@gmail.com", 4_000_000, 20));

        // Sử dụng vòng lặp để tính lương
        int totalSalary = 0;
        for (Employee e: employees) {
            System.out.println("Tên = " + e.getName() + " - Lương = " + e.calculateSalary());
            totalSalary += e.calculateSalary();
        }

        System.out.println("Lương phải trả cho nhân viên = " + totalSalary);

        // Sắp xếp theo tên
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sắp theo lương thực lĩnh
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.calculateSalary() - o1.calculateSalary();
            }
        });

        System.out.println();

        for (Employee e : employees) {
            System.out.println(e + " lương = " + e.calculateSalary());
        }
    }
}
