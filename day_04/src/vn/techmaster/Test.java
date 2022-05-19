package vn.techmaster;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(modulo2(numbers)));
        System.out.println(repeatString("a"));
        System.out.println(repeatStringWithDash("a"));
    }

    public static int[] modulo2(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] % 2;
        }

        return newArr;
    }

    public static String repeatString(String str) {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str;
        }
        return String.join("", arr);
    }

    public static String repeatStringWithDash(String str) {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str;
        }
        return String.join("-", arr);
    }
}
