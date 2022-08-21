package bai2;

public  class Bai2 {
    public static void main(String[] args){
        Square hinhVuong = new Square(5);
        Rectangle hinhChuNhat = new Rectangle(4, 5);
        hinhVuong.getEdge();
        hinhVuong.perimeter();
        hinhVuong.area();
        hinhVuong.all();
        hinhChuNhat.getEdge();
        hinhChuNhat.perimeter();
        hinhChuNhat.area();
        hinhChuNhat.all();
    }
}
class Square {
    private float edge;

    public Square(float edge) {
        this.edge = edge;
    }

    public void getEdge() {
        System.out.println("Chiều dài cạnh hình vuông là:" + this.edge);
    }
    public float perimeter(){
        float perimeter = this.edge*4;
        System.out.println("Chu vi hình vuông là:" + perimeter);
        return perimeter;
    }
    public float area(){
        float area = this.edge*this.edge;
        System.out.println("Diện tích hình vuông là:" + area);
        return area;
    }
    public void all(){
        getEdge();
        perimeter();
        area();
    }
}
class Rectangle {
    private float edge1;
    private float edge2;
    public Rectangle (float edge1, float edge2){
        this.edge1 = edge1;
        this.edge2 = edge2;
    }
    public void getEdge() {
        System.out.println("Chiều dài 2 cạnh hình chữ nhật là: " + this.edge1 + " và " + this.edge2);
    }
    public float perimeter(){
        float perimeter = (this.edge1 + this.edge2)*2;
        System.out.println("Chu vi hình chữ nhật là:" + perimeter);
        return perimeter;
    }
    public float area(){
        float area = this.edge1*this.edge2;
        System.out.println("Diện tích hình chữ nhật là:" + area);
        return area;
    }
    public void all(){
        getEdge();
        perimeter();
        area();
    }
}
