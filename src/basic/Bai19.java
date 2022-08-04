package basic;

// Viết chương trình cho phép nhập vào một chuỗi
//● Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//● In ra số lần đó

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi = in.next();
        int soLan = chuoi.length() - chuoi.replaceAll("a", "").length();
//        for (int i = 0; i < chuoi.length(); i++) {
//            if (chuoi.charAt(i) == 'a') {
//                soLan++;
//            }
//        }
        System.out.println("Số lần xuất hiện ký tự a là: " + soLan);
    }
}
