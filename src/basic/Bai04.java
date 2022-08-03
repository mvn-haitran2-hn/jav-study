package basic;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác
//vuông hay không.

public class Bai04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập số");
        double canh1 = in.nextDouble();
        double canh2 = in.nextDouble();
        double canh3 = in.nextDouble();
        if (canh1 > 0 && canh2 > 0 && canh3 > 0 && canh1 + canh2 - 1E-6 > canh3 && canh2 + canh3 - 1E-6 > canh1 && canh3 + canh1 - 1E-6 > canh2) {
            if (canh1 * canh1 + canh2 * canh2 == canh3 * canh3
                    || canh2 * canh2 + canh3 * canh3 == canh1 * canh1
                    || canh1 * canh1 + canh3 * canh3 == canh2 * canh2) {
                System.out.println("Đây là 3 cạnh của tam giác vuông");
            }
        } else {
            System.out.println("Đây ko phải là 3 cạnh của tam giác");
        }
    }
}
