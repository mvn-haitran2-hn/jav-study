package basic;

import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay
//không.
//Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử
//dụng biểu thức chính quy để ràng buộc định dạng

public class Bai05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập mã số sinh viên");
        String maSo = in.next();

        if (check(maSo)) {
            System.out.println("Đúng định dạng");
        } else {
            System.out.println("Sai định dạng");
        }

    }

    private static boolean check(String maSo) {
//        if (maSo.length() != 8 || maSo.charAt(0) != 'B') {
//            return false;
//        }
//        for (int i = 1; i < 8; i++) {
//            if (maSo.codePointAt(i) < 49 || maSo.codePointAt(i) > 57) {
//                return false;
//            }
//        }
//        return true;
        if (maSo.matches("^B[1-9]{7}")) {
            return true;
        }
        return false;
    }
}
