package Assignment06.Ex1;

public class Rectangle extends Shape {
    private int length;
    private int width;
    public Rectangle(String color , int length , int width){ // bro nó cần kế thừa color ừ lớp cha nữa
        super(color);
        this.length =length;
        this.width= width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "màu của hình chữ nhật là " + super.toString() + " diện tích là " +getArea() ;
    }
}
