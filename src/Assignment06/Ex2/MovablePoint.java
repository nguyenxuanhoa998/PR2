package Assignment06.Ex2;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void Translate(int a , int b) {
        this.x +=a;
        this.y +=b;

    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
    public String toString( ){
        return " " + x + " " +y ;

    }
}
