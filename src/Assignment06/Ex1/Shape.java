package Assignment06.Ex1;

 public abstract class Shape  {
    //Thêm constructor mặc định public Shape() có tác dụng giúp các lớp con (Triangle, Rectangle) //
    // có thể khởi tạo đối tượng mà không cần truyền tham số.
    private String color;
    public Shape(){

    }
    public Shape (String color){
            this.color= color;
    }
    public double getArea(){
        return 0;
    }
    public String toString(){
        return color;
    }
}