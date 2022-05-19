package vn.techmaster.demo_inheritance;

import vn.techmaster.demo_access.Person;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog("bob", "black", 4);
//        System.out.println(dog);
//
//        dog.setColor("white");
//        System.out.println(dog);
//
//        dog.eat();

        Person person = new Person("Nguyễn Văn A", 22, "a@gmail.com", 1_000_000);
        System.out.println(person.age);// public
    }
}
