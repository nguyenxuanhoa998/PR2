package Assignment05.Ex2;

public class Point {
    private float x ;
    private float y;
    public Point(float x , float y){
        this.x=x;
        this.y=y;
    }
    public Point (){

    }
    public float getX(){
        return x;
    }
    public void setX (float x){
        this.x=x;
    }
    public float getY(float y){
        return y;
    }
    public void setY (float Y ){
        this.y=y;
    }
    public void setXY (float x , float y ){
        this.x=x;
        this.y = y;
    }
    public float getXY(){
        return 2;

    }
}
