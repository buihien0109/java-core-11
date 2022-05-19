package vn.techmaster;

public class StringDemo {

    public static void main(String[] args) {
        // Khai báo theo kiểu literal (giá trị thể hiển chính nó)
	    String name = "Bùi Hiên";
        String name1 = "Bùi Hiên";

        // Khởi tạo = từ khóa new -> Sinh ra đối tượng
        String message = new String("Xin chào");
        String message1 = new String("Xin chào");

        System.out.println(name);
        System.out.println(message);

        // == thường được sử dụng cho kiểu dữ liệu nguyên thủy
        System.out.println(name == name1);
        System.out.println(message == message1);

        // equals so sánh về mặt ký tự
        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));

        // Method String
        String text = "Xin chào các bạn";

        System.out.println("In hoa chữ : " + text.toUpperCase());
        System.out.println("In thường chữ : " + text.toLowerCase());
        System.out.println("Độ dài chuỗi : " + text.length());

        System.out.println("Ký tự đầu của chuỗi : " + text.charAt(0));
        System.out.println("Ký tự cuối cùng của chuỗi : " + text.charAt(text.length() - 1));

        System.out.println("Chuỗi hi có chỉ số bắt đầu là : " + text.indexOf("hi"));
        System.out.println("Chuỗi ch có chỉ số bắt đầu là : " + text.indexOf("ch"));

        System.out.println("Chuỗi hi có tồn tại trong chuỗi ban đầu k? " + text.contains("hi"));
        System.out.println("Chuỗi ch có tồn tại trong chuỗi ban đầu k? " + text.contains("ch"));

        System.out.println("Cắt chuỗi xin : " + text.substring(0,3));
        System.out.println("Cắt chuỗi chào các bạn : " + text.substring(4));
    }
}
