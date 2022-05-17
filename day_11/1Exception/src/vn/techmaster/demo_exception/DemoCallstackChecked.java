package vn.techmaster.demo_exception;

import java.io.IOException;

public class DemoCallstackChecked {
    public static void main(String[] args) throws IOException {
//        try {
//            methodThree();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        methodThree();

        System.out.println("Code continue ...");
    }

    public static void methodOne() throws IOException {
        throw new IOException("Không tìm thấy file");
    }

    public static void methodTwo() throws IOException {
        methodOne();
    }

    public static void methodThree() throws IOException{
        methodTwo();
    }
}
