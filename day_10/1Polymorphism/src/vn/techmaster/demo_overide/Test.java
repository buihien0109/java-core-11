package vn.techmaster.demo_overide;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        // Tạo đối tượng từ class Animal
//        Animal animal = new Animal();
//        animal.eat();
//        animal.sound();
//
//        System.out.println();
//
//        // Tạo đối tượng từ class Dog
//        Dog dog = new Dog();
//        dog.eat();
//        dog.sound();
//        dog.sleep();
//
//        System.out.println();
//
//        // Tạo đối tượng từ class Cat
//        Cat cat = new Cat();
//        cat.eat();
//        cat.sound();
//        cat.play();

        // Upcasting
        // Ép kiểu k tường minh
        Animal animal = new Dog();

        // Ép kiểu tường minh
        // Animal animal = (Animal) new Dog();

        animal.eat();
        animal.sound();

        // Khởi tạo đối tượng từ lớp Cat
        Animal animal1 = new Cat();
        animal1.eat();
        animal1.sound();

        // Khởi tạo danh sách động vật
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());

        System.out.println("*********************");

        for (Animal a: animals) {
            a.eat();
            a.sound();
            System.out.println();
        }

        // Downcasting
        Dog dog = (Dog) animal;
        dog.eat();
        dog.sound();
        dog.sleep();
    }
}
