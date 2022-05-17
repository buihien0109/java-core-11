package vn.techmaster.custom_exception;

public class DemoCustomUnchecked {
    public static void main(String[] args) {
        try {
            findElement(6);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean findElement(int value) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number: numbers) {
            if(number == value) {
                return true;
            }
        }
        throw new NotFoundException("Không tìm thấy phần tử có giá trị = " + value);
    }
}
