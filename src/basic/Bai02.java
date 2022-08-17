package basic;

import java.util.ArrayList;
import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi
//chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
// VD: 1 -> Một, 2 -> Hai, ..

public class Bai02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] chu = new String[]{"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        System.out.println("NHập số");
        long soNguyen = in.nextLong();
        ArrayList<Integer> num = new ArrayList();
        int i = 0;
        while (soNguyen > 0) {
            num.add((int) (soNguyen % 10));
            soNguyen /= 10;
            i++;
        }
        String[] hangDonVi = new String[10];

        if (i > 1) {
            hangDonVi = new String[]{"", "một", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
        } else {
            hangDonVi = chu;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (j % 3 == 0) {
                System.out.print(hangDonVi[num.get(j)] + " ");
                int k = j / 3;
                while (k > 0) {
                    switch (k % 3) {
                        case 1:
                            System.out.print("ngàn ");
                            k -= 1;
                            break;
                        case 2:
                            System.out.print("triệu ");
                            k -= 2;
                            break;
                        default:
                            System.out.print("tỷ ");
                            k -= 3;
                            break;
                    }
                }
            } else if (j % 3 == 1) {
                int k = num.get(j);
                switch (k) {
                    case 0:
                        if (num.get(j - 1) != 0) {
                            System.out.print(" linh ");
                        }
                        break;
                    case 1:
                        System.out.print("mười ");
                        break;
                    default:
                        System.out.print(chu[num.get(j)] + " mươi ");
                        break;
                }
            } else {
                if (num.get(j) == 0 && num.get(j - 1) == 0 && num.get(j - 2) == 0) {
                    j -= 2;
                } else {
                    System.out.print(chu[num.get(j)] + " trăm ");
                }
            }
        }
    }
}
