package OOP1.bai2;

// Xây dựng lớp Candidate (Thí sinh) gồm các thuộc tính: mã, tên, ngày tháng năm sinh, điểm
//thi Toán, Văn, Anh và các phương thức cần thiết.
//Xây dựng lớp TestCandidate để kiểm tra lớp trên:
//– Nhập vào n thí sinh (n do người dùng nhập)
//– In ra thông tin về các thí sinh có tổng điểm lớn hơn 1

import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NHập n");
        int n = in.nextInt();
        Candidate[] list = new Candidate[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin thí sinh thứ " + i);
            list[i] = new Candidate(in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        for (Candidate canđiate : list) {
            if (canđiate.tongDiem() > 1) {
                canđiate.display();
            }
        }
    }
}
