package Assignment02;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Activity_3 {
    public static void main (String [] args ){
        try{
            //Đọc file testdata.txt
            File file = new File("src/Assignment02/testdata.txt");
            Scanner sc = new Scanner(file);
            // đọc dòng đầu tiên (tên học sinh )
            String studentName = sc.nextLine();
            // đọc ba dòng tiếp theo là số
            int score1 = Integer.parseInt(sc.nextLine());
            int score2 = Integer.parseInt(sc.nextLine());
            int score3 = Integer.parseInt(sc.nextLine());
            int Average = (score1+score2+score3)/3;
            System.out.println("The average score is : " + Average);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch ( Error e ){
            System.out.println("Invalid data format from the file");

        }
    }
}
