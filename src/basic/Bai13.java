package basic;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
// Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập n");
        int n = in.nextInt();
        int[] integer = new int[n];
        System.out.println("NHập " + n + " số nguyên ");
        for (int i = 0; i < n; i++) {
            integer[i] = in.nextInt();
        }
        int min = integer[0];
        for (int i = 1; i < n; i++) {
            if (min > integer[i]) {
                min = integer[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất là; " + min);
    }
}
