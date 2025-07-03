package Assignment06.Ex2;

public class TestMovable {

    public static void main(String[] args) {
        /**MovablePoint p1 = new MovablePoint(1, 2);
        System.out.println(p1);
        //(1,2)
        p1.moveDown();
        System.out.println(p1);
        //(1,3)
        p1.moveRight();
        System.out.println(p1);
        //(2,3)

        // Test Polymorphism
        Movable p2 = new MovablePoint(3, 4);  // upcast
        p2.moveUp();
        System.out.println(p2);
        //(3,3)

        MovablePoint p3 = (MovablePoint)p2;   // downcast
        System.out.println(p3);
        //(3,3)
        MovablePoint p4 = new MovablePoint(5,6);
        p4.moveLeft();
        System.out.println(p4);*/
        MovablePoint A = new MovablePoint(2, 5);
        System.out.println("Trước khi tịnh tiến: " + A);

        // Tịnh tiến A theo vector (3, -2)
        A.Translate(3, -2);
        System.out.println("Sau khi tịnh tiến: " + A);

            // Thử di chuyển lên
        A.moveUp();
        System.out.println("Sau khi moveUp: " + A);

        }
    }
