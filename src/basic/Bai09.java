package basic;

//Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;
        do {
            System.out.println("Nhộp số nguyên dương nhỏ hơn 20");
            n = in.nextInt();
        } while (n <= 0 || n >= 20);
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        int[] fi = new int[20];
        fi[0] = 1;
        fi[1] = 1;
        for (int i = 2; i <= n; i++){
            fi[i] = fi[i-1] + fi[i-2];
        }
        return fi[n];
    }
}
