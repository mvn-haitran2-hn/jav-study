package basic;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi
//chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
// VD: 1 -> Một, 2 -> Hai, ..

public class Bai02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] chu = new String[]{"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        System.out.println("NHập số");
        int soNguyen = in.nextInt();
        System.out.println(chu[soNguyen]);
    }
}
