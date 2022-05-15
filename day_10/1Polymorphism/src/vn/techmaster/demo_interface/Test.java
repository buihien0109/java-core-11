package vn.techmaster.demo_interface;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo interface từ class Rectangle đã implement
        IShape shape = new Rectangle(4, 5);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        shape.printInfo();

        // Khởi tạo interface từ class Square
        IShape shape1 = new Square(4);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        shape1.printInfo();

        // Khởi tạo 1 danh sách IShape
        ArrayList<IShape> shapes = new ArrayList<>();

        // Lấy ra tất cả hình chữ nhật trong shapes
        // Và sắp xếp giảm dần theo diện tích

        // Gọi phương thức static của interface
        IShape.display();
        System.out.println(IShape.name);

        shape.getSide(); // Rectangle
        shape1.getSide(); // Square
    }
}
