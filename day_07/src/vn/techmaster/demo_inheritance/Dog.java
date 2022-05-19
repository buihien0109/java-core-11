package vn.techmaster.demo_inheritance;

public class Dog extends Animal{
    private int legs;

    public Dog() {
    }

    public Dog(String name, String color, int legs) {
        super(name, color);
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println("Dog eat ...");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "name: " + super.getName() + " - color: " + super.getColor() + " - legs : " + this.legs;
    }
}
