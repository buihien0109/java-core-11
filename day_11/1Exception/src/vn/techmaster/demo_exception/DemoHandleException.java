package vn.techmaster.demo_exception;

import java.io.*;

public class DemoHandleException {
    public static void main(String[] args) {
        // Xử lý với try/catch
        // try : chứa code có thể gây ra lỗi
        // catch : Xử lý lỗi nếu xảy ra
        try {
            double result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi xảy ra rồi, xử lý đi");
            System.out.println(e.getMessage());
        }

        // Xử lý nhiều exception
        try {
            // ArithmeticException
            double result = 10 / 2;
            System.out.println(result);

            // NullPointerException
            String text = null;
            System.out.println(text.length());
        } catch (RuntimeException e) {
            System.out.println("Lỗi xảy ra rồi, xử lý đi");
            System.out.println(e.getMessage());
        }

        // finally : Được chạy để cả có xảy ra lỗi hay không
        try {
            double result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi xảy ra rồi, xử lý đi");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("code continue ...");
        }

        // Xử lý ngoại lệ checked
        try {
            // Khởi tạo 1 đối tượng file
            File file = new File("text.txt");
            // Đọc file
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

//            String s;
//            while((s = bufferedReader.readLine()) != null){
//                System.out.println(s);
//            }

            // Đọc 2 dòng trong file
            for (int i = 0; i < 2 ; i++) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Lỗi xảy ra khi thao tác với file");
            System.out.println(e.getMessage());
        }
    }
}
