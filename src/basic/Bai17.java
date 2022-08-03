package basic;

// Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó
//nhập vào một ký tự.
// Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu
//có, số đếm bắt đầu từ 0).
// Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi, nếu
//không thì in ra “Không tồn tại trong chuỗi”.

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi = in.next();
        System.out.println("Nhập ký tự");
        char kyTu = in.next().charAt(0);
        int thuTu = at(chuoi, kyTu);
        if (thuTu == -1) {
            System.out.println("Không tồn tại trong chuỗi");
        } else {
            System.out.println("ký tự nằm ỏ vị trí thứ " + thuTu);
        }
    }

    private static int at(String chuoi, char kyTu) {
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
