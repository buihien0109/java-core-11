package vn.techmaster.builderdemo;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder()
                .withName("Nguyễn Văn A")
                .withAge(32)
                .build();

        System.out.println(person);

        // Tạo ra đối tượng person khác
        Person person1 = Person.builder()
                .isMarried(true)
                .withPhone("019290333")
                .withName("Bùi Hiên")
                .withAge(25)
                .withEmail("hien@techmaster.vn")
                .build();

        System.out.println(person1);
    }
}
