package demo_functional_interface;

import demo_generic.DemoGenericInterface;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// Cách 1 : Sử dụng class để implements interface
public class DemoFunctionalInterface implements Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("Xin chào " + name);
    }

    public static void main(String[] args) {
        // Khai báo interface sử dụng class implements
        Greeting g = new DemoFunctionalInterface();
        g.sayHello("Nguyễn Văn A");

        // Cách 2 :Cách sử dụng anonymous class;
        Greeting g1 = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Xin chào " + name);
            }
        };
        g1.sayHello("Trần Văn B");
    }
}
