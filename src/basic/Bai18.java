package basic;

// Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này
//có xuất hiện số hay không.
//● Nếu có tin ra “Có”, ngược lại, in ra “Không”

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi = in.next();

        if (chuoi.matches(".*[0-9].*")) {
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }
    }

}
