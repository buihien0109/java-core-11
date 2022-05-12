package vn.techmaster.service;

import vn.techmaster.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EmployeeService {
    // Tạo list nhân viên để quản lý
    private ArrayList<Employee> employees;

    // Khởi tạo data từ constructor
    public EmployeeService() {
        init();
    }

    // Khởi tạo data
    private void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Nguyễn Văn A", "a@gmail.com", 14_000_000));
        employees.add(new Employee(2, "Trần Văn B", "b@gmail.com", 6_000_000));
        employees.add(new Employee(3, "Ngô Thị C", "c@gmail.com", 8_000_000));
        employees.add(new Employee(4, "Bùi Văn D", "d@gmail.com", 11_000_000));
    }

    // Trả về danh sách nhân viên
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // In ra thông tin
    public void printInfo(ArrayList<Employee> list) {
        for (Employee employee: list) {
            System.out.println(employee);
        }
    }

    // Thêm nhân viên mới
    public Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhập tên : ");
        String name = sc.nextLine();

        System.out.print("Nhập email : ");
        String email = sc.nextLine();

        System.out.print("Nhập lương : ");
        int salary = Integer.parseInt(sc.nextLine());

        // Khởi tạo đối tượng
        Employee employee = new Employee(rd.nextInt(100), name, email, salary);

        // Thêm vào danh sách để quản lý
        employees.add(employee);

        return employee;
    }

    // Tìm kiếm theo tên : Có thể trả về nhiều nhân viên cùng tên
    public ArrayList<Employee> findByName(String name) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e: employees) {
            if(e.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(e);
            }
        }
        return list;
    }

    // Tìm kiếm theo id : Nếu có thì trả về nhân viên duy nhât
    public Employee findById(int id) {
        for (Employee e: employees) {
            if(e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // Xóa theo id
    public void deleteEmployee(int id) {
        // TODO : Test forEach để xóa

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employee.getId() == id) {
                iterator.remove();
            }
        }
    }

    // Tìm kiếm nhân viên theo mức lương
    public ArrayList<Employee> findBySalary(int minSalary, int maxSalary) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e: employees) {
            if(e.getSalary() > minSalary && e.getSalary() < maxSalary) {
                list.add(e);
            }
        }
        return list;
    }
}
