package basic;

// Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//● In ra tất cả số nguyên tố trong khoảng từ 0 - n

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;
        do {
            System.out.println("Nhộp số nguyên dương nhỏ hơn 1000");
            n = in.nextInt();
        } while (n <= 0 || n >= 1000);
        for (int i = 0; i <= n; i ++) {
            if (isSoNguyenTo(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isSoNguyenTo(int i) {
        if (i <= 1) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(i);
        for (int j = 2; j <= squareRoot; j++) {
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
