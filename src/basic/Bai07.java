package basic;

// Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 20; i++) {
            int ketQua = i * n;
            System.out.println("Kết quả phép nhân với " + i + " là " + ketQua);
        }
    }
}
