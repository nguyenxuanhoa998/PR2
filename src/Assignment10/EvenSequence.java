package Assignment10;
import java.util.*;
public class EvenSequence {
    public static int getEvenNumber(int n ){
        if(n ==0 )
            return 0;
            return getEvenNumber(n - 1) + 2;

    }
    public static int getTriangularNumber(int n) {
        if (n == 0) return 0; // Cơ sở đệ quy
        return getTriangularNumber(n - 1) + n; // Công thức truy hồi
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("nhập vị trí số muốn láy giá trị: ");
        int n = sc.nextInt();
        System.out.println( "Tại vị trí "+ n +  " giá trị của dãy số chẵn bắt đầu từ 0 là: "+ getEvenNumber(n));
        System.out.println("Tại vị trí " + n + " giá trị của dãy số tam giác bắt đầu từ 0 là: " + getTriangularNumber(n));
    }
}
