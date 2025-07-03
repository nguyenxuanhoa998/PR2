import Assignment09.Student;
import Assignment09.XFile;

import java.util.ArrayList;
import java.util.List;
public class Studentmain {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();
        list.add(new Student("Tuấn", 5 , "CNTT"));
        list.add(new Student("Cường", 7.5 , "TKTW"));
        list.add(new Student("Hạnh", 8.5 , "CNTT"));
// ghi danh sách vào File
        String filePath= "C:\\temp\\Student.dat";
        XFile.writeObject(filePath, list);
        // đọc danh sách sinh viên vào file;
        List<Student> loadedlist = (List<Student>) XFile.readObject(filePath);
        System.out.println("Danh sách sinh viên đọc ừ file");
        for (Student s : loadedlist){
            System.out.println(s);
        }
    }
}
