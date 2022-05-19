package vn.techmaster.demo_wrapper_class;

public class Main {
    public static void main(String[] args) {
        // Định nghĩa các biến thuộc kiểu dữ liệu nguyên thủy
        int a = 5;
        double b = 5.65;

        // Chuyển đổi thành wrapper objects tương ứng
        Integer aObj = a;
        Double bObj = b;

        if(aObj instanceof Integer) {
            System.out.println("Một object thuộc Integer đã được tạo.");
        }

        if(bObj instanceof Double) {
            System.out.println("Một object thuộc Double đã được tạo.");
        }

        // Chuyển đổi thành kiểu dữ liệu nguyên thủy tương ứng
        int aPrimative = aObj;
        double bPrimative = bObj;

        System.out.println("Giá trị a = " + aPrimative);
        System.out.println("Giá trị b = " + bPrimative);
    }
}
