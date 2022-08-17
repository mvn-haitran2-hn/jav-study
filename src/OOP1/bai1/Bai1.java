package OOP1.bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập tử số mẫu số 1");
        PhanSo a = new PhanSo(in.nextInt(), in.nextInt());
        System.out.println("Nhập tử số mẫu số 2");
        PhanSo b = new PhanSo(in.nextInt(), in.nextInt());

        System.out.println("Tong 2 phân số là: ");
        PhanSo tong = a.cong(b);
        tong.display();

        System.out.println("Hieu 2 phân số là: ");
        PhanSo hieu = a.tru(b);
        hieu.display();

        System.out.println("Tich 2 phân số là: ");
        PhanSo tich = a.nhan(b);
        tich.display();

        System.out.println("Thuong 2 phân số là: ");
        PhanSo thuong = a.chia(b);
        thuong.display();
    }
}
