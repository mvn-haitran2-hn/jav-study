package basic;

//Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;
        do {
            n = in.nextInt();
        } while (n <= 0);
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum = sum + i;
        }
        System.out.println("Tổng các số chẵn là: " + sum);
    }
}
