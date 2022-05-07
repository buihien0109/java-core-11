package vn.techmaster.classdemo;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng
        Person person = new Person();

        // Gán giá trị cho đối tượng
        person.name = "Bùi Hiên";
        person.age = 25;
        person.address = "Thái Bình";

        // In ra thông tin
        System.out.println(person.name + " - " + person.age + " - " + person.address);
        System.out.println(person);

        // Gọi phương thức
        person.play();
        person.eat("PHỞ");
        System.out.println(person.getYearOfBirth());

        // Khởi tạo đối tượng 1 tham số
        Person person1 = new Person("Nguyễn Văn A");
        person1.age = 32;
        person1.address = "Sài Gòn";
        System.out.println(person1);

        // Khởi tạo đối tượng 2 tham số
        Person person2 = new Person("Trần Văn B", 40);
        System.out.println(person2);

        // Khởi tạo đối tượng full tham số
        Person person3 = new Person("Ngô Thị C", 20, "Hà Nội");
        System.out.println(person3);
    }
}
