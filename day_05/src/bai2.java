import java.util.Scanner;

public class bai2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("nhap so phan tu mang: ");
        n = sc.nextInt();

        int[] numbers = new int[n];
        nhapMang(numbers);

        System.out.println("Mang vua nhap la: ");
        xuatMang(numbers);

        kiemTra(numbers);
        System.out.println("\nMang sau khi thay doi la : ");
        xuatMang(numbers);
    }

    private static void nhapMang(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
    }

    private static void xuatMang(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void kiemTra(int[] numbers){
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] %2 == 0 ){
                numbers[i] += 1;
            }
        }
    }
}
