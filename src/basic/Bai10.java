package basic;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("NHập mã số sinh viên");
            String maSo = in.next();
            if (maSo.matches("^B170[1-9]{4}")) {
                System.out.println("Đúng định dạng");
            } else {
                System.out.println("Sai định dạng");
            }
        }

    }
}
