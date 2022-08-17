package OOP1.bai2;

public class Candidate {
    private String ma, ten, date;
    private int toan, van, anh;

    public Candidate(String ma, String ten, String date, int toan, int van, int anh) {
        this.ma = ma;
        this.ten = ten;
        this.date = date;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }

    public int tongDiem() {
        return toan + van + anh;
    }

    public void display() {
        System.out.println("ma: " + ma);
        System.out.println("ten: " + ten);
        System.out.println("Ngày than năm sinh: " + date);
        System.out.println("Toán: " + toan);
        System.out.println("Văn: " + van);
        System.out.println("Anh: " + anh);
    }
}
