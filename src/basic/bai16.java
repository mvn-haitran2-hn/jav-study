package basic;

// Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
// Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”

import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi = in.next();
        System.out.println("Nhập ký tự");
        char kyTu = in.next().charAt(0);

        if (check(chuoi, kyTu)) {
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }
    }

    private static boolean check(String chuoi, char kyTu) {
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
