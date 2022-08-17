package basic;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
// Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập n");
        int n = in.nextInt();
        int[] integer = new int[n];
        System.out.println("NHập " + n + " số nguyên dương ");
        int max = 0;
        for (int i = 0; i < n; i++) {
            do {
                integer[i] = in.nextInt();
            } while (integer[i] > 0);
            if (max < integer[i]) {
                max = integer[i];
            }
        }
        System.out.println("Phần tử lớn nhất là; " + max);
    }
}
