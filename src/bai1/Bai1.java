package bai1;

import java.util.Scanner;

public class Bai1 {
    private static int minus(int a, int b) {
        int i = a > b ? a - b : 0;
        return i;
    }

    public static void main(String[] args) {
        int num, bill = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập mức tiêu thụ điện: ");
        num = in.nextInt();
//        if (num <= 50) {
//            bill = 1678*num;
//        } else if (num <= 100) {
//            bill = 1734*(num - 50) + 1678*50;
//        } else if (num <= 200) {
//            bill = 2014*(num - 100) + 1734*50 + 1678*50;
//        } else if (num <= 300) {
//            bill = 2536*(num - 200) + 2014*100 + 1734*50 + 1678*50;
//        } else if (num <= 400) {
//            bill = 2834*(num - 300) + 2536*100 + 2014*100 + 1734*50 + 1678*50;
//        } else {
//            bill = 2927*(num - 400) + 2834*100 + 2536*100 + 2014*100 + 1734*50 + 1678*50;
//        }

        for (int i = 1; i <= num; i++) {
            if (i <= 50) {
                bill += 1678;
            } else if (i <= 100) {
                bill += 1734;
            } else if (i <= 200) {
                bill += 2014;
            } else if (i <= 300) {
                bill += 2536;
            } else if (i <= 400) {
                bill += 2834;
            } else {
                bill += 2927;
            }
        }
        System.out.println("Tiền điện 1 tháng: " + bill + " VND");
    }
}
