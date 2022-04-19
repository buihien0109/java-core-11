package vn.techmaster;

public class Main {
    // Khai báo biến global
    public static int globalVariable = 20;

    public static void main(String[] args) {
        // Chương trình đầu tiên
        System.out.println("Hello world");

        // Khai báo biến
        String firstName;
        String lastName;

        // Khởi tạo giá trị cho biến
        firstName = "Bùi";
        lastName = "Hiên";

        // In ra biến
        System.out.println(firstName);
        System.out.println(lastName);

        // Vừa khai báo biến vừa khởi tạo giá trị cho biến
        // String fullName = "Bùi Hiên";
        String fullName = firstName + " " + lastName; // Cộng chuỗi
        System.out.println(fullName);

        int age = 25; // Kiểu int
        System.out.println("Xin chào các bạn, mình tên là " + fullName + ". Mình sinh năm "
        + (2022 - 25) + " và năm nay mình " + age + " tuổi");

        // Kiểu long
        long money = 2_000_000_000L;
        System.out.println("Tài khoản không có gì ngoài tiền, chỉ có " + money + " tỷ thôi!!");

        // Kiểu boolean (đúng sai) true/false
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried + " là chưa lấy vợ nhé.");
        System.out.println("isMarried = " + !isMarried + " là đã lấy vợ nhé.");

        // Khai báo dấu phẩy động
        float weight = 60.5f;
        double height = 1.68;

        System.out.println("Cân nặng = " + weight);
        System.out.println("Chiều cao = " + height);

        // Kiểu ký tự : char --> search ASCII trên google;
        char charA = 'A';
        char chara = 97;

        System.out.println(charA);
        System.out.println(chara);

        // Ép kiểu ngầm định : Từ giá nhỏ -> lớn (trình biên dịch tự biết và thực hiện)
        int number = 10;
        long number1 = number;
        double number2 = number;

        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        // Ép kiểu tường mình : Từ giá trị lớn -> nhỏ (tự làm)
        double heightValue = 1.8;
        int heightValueConvert = (int) heightValue;
        System.out.println(heightValueConvert);

        // Phạm vi của biến
        {
            int localVaribale = 10;
            System.out.println(localVaribale);
        }

        // Lỗi : Ngoài phạm vi sử dụng biến
        // System.out.println(localVaribale);

        // Biến global
        System.out.println(globalVariable);
    }
}
