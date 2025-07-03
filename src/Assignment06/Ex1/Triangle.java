package Assignment06.Ex1;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;

    }

    @Override
    public double getArea() {
        return 0.5 * height*base;
    }

    @Override
    public String toString() {
        return "màu của hình chữ tam giác là " + super.toString()+" diện tích tam giác là " +getArea();
    }
}
