package Draft;
import java.util.Scanner;
public class hoa {
    public static void main(String[] args) {
        int [] arr = {2,3 ,4 ,5 ,6 ,7 ,8 };
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for(int i = 0; i <arr.length; i++){
            if (num ==2){
                System.out.println("đoán đúng rồi"); break;
            }
        }
}
}