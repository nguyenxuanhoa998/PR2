package Assignment01;
import java.util.Scanner;
public class Activity_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your name ");
        String name = sc.nextLine();
        String upercaseName = name.toUpperCase();
        System.out.println("Hello , " + upercaseName + " , nice to meet you ");
        sc.close();

    }
}
