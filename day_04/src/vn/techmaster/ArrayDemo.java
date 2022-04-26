package vn.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // Cách 1 : Khai báo sau đó gán trị cho mảng
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers)); // in ra mảng ở dạng string
        System.out.println(numbers.length); // độ dài mảng
        System.out.println(numbers[numbers.length - 1]); // phần tử cuối cùng trong mảng

        // Cách 2 : Vừa khai báo, vừa khởi giá trị cho mảng;
        int[] numbersOther = {1, 2, 3, 4, 5};

        // Duyệt mảng
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        System.out.println();

        // While
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j] + "\t");
            j++;
        }

        System.out.println();

        // forEach
        for (int number : numbers) {
            System.out.print(number + "\t");
        }

        // Tính tổng
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("\nTổng = " + total);

        // Tìm giá trị lớn nhất trong mảng
        int max = numbers[0];
        for (int number: numbers) {
            if(number > max) {
                max = number;
            }
        }
        System.out.println("Max = " + max);

        // Sắp xếp
        Arrays.sort(numbers); // Sắp xếp tăng dần
        System.out.println("Max = " + numbers[numbers.length - 1]); // Max = chỉ số cuối cùng của mảng



        // Nhập
        int[] numbersInput = createArray();

        // Tính tổng
        System.out.println("Tổng của mảng = " + sumArray(numbersInput));

        // Tìm số lớn nhất
        System.out.println("Max = " + findMax(numbersInput));
    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        // Nhập mảng
        System.out.print("Nhập vào số phần tử của mảng : ");
        int count = sc.nextInt();

        // Khởi tạo mảng với số phần tử = count
        int[] numbersInput = new int[count];

        // Nhập vào từng phần tử của mảng
        for (int i = 0; i < numbersInput.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " : ");
            numbersInput[i] = sc.nextInt();
        }
        return numbersInput;
    }

    public static int sumArray(int[] arr) {
        int total = 0;
        for (int number: arr) {
            total += number;
        }
        return total;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int number: arr) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
}
