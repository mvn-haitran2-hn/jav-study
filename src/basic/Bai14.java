package basic;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
// Sắp xếp các phần tử trong mảng theo thứ tự ngược lại

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập n");
        int n = in.nextInt();
        int[] integer = new int[n];
        System.out.println("NHập " + n + " số nguyên ");
        for (int i = 0; i < n; i++) {
            integer[i] = in.nextInt();
        }
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = integer[i];
            integer[i] = integer[n - i - 1];
            integer[n - i - 1] = temp;
        }
    }
}
