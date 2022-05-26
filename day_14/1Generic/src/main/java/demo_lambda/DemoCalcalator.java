package demo_lambda;

@FunctionalInterface
interface Calcalator {
    int calcalate(int a, int b);
}

public class DemoCalcalator {
    public static void main(String[] args) {
        // Cộng 2 số
        Calcalator c = (a, b) -> a + b;
        System.out.println(c.calcalate(3,4));
        System.out.println(c.calcalate(10, 20));

        // Trừ 2 số
        Calcalator c1 = (a, b) -> a - b;
        System.out.println(c1.calcalate(3,4));
        System.out.println(c1.calcalate(10, 20));

        // Nhân 2 số
        Calcalator c2 = (a, b) -> a * b;
        System.out.println(c2.calcalate(3,4));
        System.out.println(c2.calcalate(10, 20));

        // Chia 2 số
        Calcalator c3 = (a, b) -> a / b;
        System.out.println(c3.calcalate(3,4));
        System.out.println(c3.calcalate(10, 20));
    }
}
