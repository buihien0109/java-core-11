package vn.techmaster.demo_inheritance;

public class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Phương thức của lớp cha
    public void eat() {
        System.out.println("Animal eat ...");
    }

    // Các hàm setter, getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
