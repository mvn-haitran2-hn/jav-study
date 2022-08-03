package basic;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] maSo = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("NHập 5 mã số theo định dạng \"00yLxxxx\"");
            maSo[i] = in.next();
        }
        if (check(maSo)) {
            System.out.println("Đúng rồi");
        } else {
            System.out.println("Sai rồi");
        }
    }

    private static boolean check(String[] maSo) {
        for (int i = 0; i < 5; i++) {
            if (!maSo[i].matches("^00[2-5]L[0-9]{4}")) {
                return false;
            }
        }
        return true;
    }
}
