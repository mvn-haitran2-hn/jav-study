package basic;

import java.util.Scanner;

//Viết chương trình mà khi chạy, màn hình console sẽ cho phép ta nhập
//vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra
//“Đây là số nguyên âm”

public class Bai01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập số");
        int i = in.nextInt();
        if (i >= 0) {
            System.out.println("Đây là số nguyên dương");
        } else {
            System.out.println("Đây là số nguyên âm");
        }

    }
}
