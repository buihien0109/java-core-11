package vn.techmaster;

import java.util.Arrays;
import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
//        int i = 0;
//
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

        Random rd = new Random();

        while (true) {
            // Random 1 số bất kỳ trong khoảng từ 0 -> 99
            int rdNumber = rd.nextInt(100);

            // Nếu sô random được > 90 -> thoát vòng lặp
            if(rdNumber > 90) {
                break;
            }

            System.out.print(rdNumber + "\t");
        }
    }
}
