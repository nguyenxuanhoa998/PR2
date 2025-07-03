package Assignment09;
import java.util.List;
import java.io.Serializable;
public class Student implements Serializable {
    private String name;
    private double mark ;
    private String faculty;
    public  Student (String name , double mark , String faculty){
        this.name=name;
        this.mark=mark;
        this.faculty=faculty;
    }
    public String getName(){
        return name;
    }
    public double getMark() {
        return mark;
    }
    public String getFaculty(){
        return faculty;
    }
    public String toString(){
        return "Tên " + name + " điểm " + mark + " khoa " + faculty;

    }
}
