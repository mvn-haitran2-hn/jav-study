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
        PhanSo tong = cong(a, b);
        tong.display();

        System.out.println("Hieu 2 phân số là: ");
        PhanSo hieu = tru(a, b);
        hieu.display();

        System.out.println("Tich 2 phân số là: ");
        PhanSo tich = nhan(a, b);
        tich.display();

        System.out.println("Thuong 2 phân số là: ");
        PhanSo thuong = chia(a, b);
        thuong.display();
    }

    private static PhanSo cong(PhanSo a, PhanSo b) {
        int tuSo, mauSo;
        tuSo = a.getTuSo() * b.getMauSo() + b.getTuSo() * a.getMauSo();
        mauSo = a.getMauSo() * b.getMauSo();
        PhanSo tong = new PhanSo(tuSo, mauSo);
        return tong;
    }

    private static PhanSo tru(PhanSo a, PhanSo b) {
        int tuSo, mauSo;
        tuSo = a.getTuSo() * b.getMauSo() - b.getTuSo() * a.getMauSo();
        mauSo = a.getMauSo() * b.getMauSo();
        PhanSo hieu = new PhanSo(tuSo, mauSo);
        return hieu;
    }

    private static PhanSo nhan(PhanSo a, PhanSo b) {
        int tuSo, mauSo;
        tuSo = a.getTuSo() * b.getTuSo();
        mauSo = a.getMauSo() * b.getMauSo();
        PhanSo tich = new PhanSo(tuSo, mauSo);
        return tich;
    }

    private static PhanSo chia(PhanSo a, PhanSo b) {
        int tuSo, mauSo;
        tuSo = a.getTuSo() * b.getMauSo();
        mauSo = a.getMauSo() * b.getTuSo();
        PhanSo thuong = new PhanSo(tuSo, mauSo);
        return thuong;
    }
}
