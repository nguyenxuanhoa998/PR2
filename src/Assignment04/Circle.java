package Assignment04;

public class Circle {
    private double radius;
    private String color;

    public Circle() {


    }


    public Circle(double r) {
        this.radius=r;
        this.color="red";
    }

    public Circle(double r, String c) {


    }

    public double getRadius() {

        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI*radius*radius;

    }
public static void main (String [] args){
        Circle c1 = new Circle(1.0,"red");
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0,"blue");
    System.out.println("Circle 1 : radius =" +c1.getRadius()+" the color "+c2.getColor()+"the Area is "+c1.getArea());
}

}
