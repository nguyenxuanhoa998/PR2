package Assignment09;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class XFileDemo {
    public static void main(String[] argv) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn", 5, "CNTT"));
        list.add(new Student("Cường", 7.5, "KTQT"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));

        XFile.writeObject("c:/temp/students.dat", list);

        List<Student> result = (List<Student>) XFile.readObject("c:/temp/students.dat");
        for (Student s : result) {
            System.out.println(s);
        }
    }
}
