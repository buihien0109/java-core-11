package vn.techmaster;

public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        m.sayHello();

        m.sayHelloWithName("Bùi Hiên"); // Argument : Đối số
        m.sayHelloWithName("Nguyễn Văn A"); // Argument

        int data = m.sum(10, 20); // 30
        System.out.println(data);

        int data1 = m.sum(data, 70);
        System.out.println(data1);

        System.out.println(m.sum(3, 4));
    }

    public void sayHello() {
        System.out.println("Xin chào các bạn");
    }

    public void sayHelloWithName(String name) { // Parameter : Tham số
        System.out.println("Xin chào " + name);
    }

    public int sum(int a, int b) {
//        int data = a + b;
//        return data;

        return a + b;
    }
}
