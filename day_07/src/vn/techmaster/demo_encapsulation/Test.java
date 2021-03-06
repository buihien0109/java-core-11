package vn.techmaster.demo_encapsulation;

public class Test {
    public static void main(String[] args) {
        // Tạo ra đối tượng person
        Person person = new Person();

        // Thêm thông tin cho đối tượng
        person.setId(1);
        person.setName("Nguyễn Văn A");
        person.setAge(22);
        person.setEmail("a@gmail.com");

        // In ra thông tin của đối tượng
        System.out.println(person);
        System.out.println(person.getName());

        // Tạo ra đối tượng person1
        Person person1 = new Person(2, "Trần Văn B", 30, "b@gmail.com");

        // In ra thông tin của đối tượng
        System.out.println(person1);
        System.out.println(person1.getEmail());

        person1.setAge(400);
        person1.setAge(90);
        System.out.println(person1);
    }
}
