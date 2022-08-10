package basic;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
// Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập n");
        int n = in.nextInt();
        int[] integer = new int[n];
        System.out.println("NHập " + n + " số nguyên");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            integer[i] = in.nextInt();
            sum += integer[i];
        }
        float average = (float) sum / n;
        System.out.println("Trung bình cộng của" + n + " số nguyên là; " + average);
    }
}
