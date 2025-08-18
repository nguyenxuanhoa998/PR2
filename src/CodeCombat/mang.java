package CodeCombat;
import java.util.*;
public class mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int capacity = sc.nextInt();

        int[] a = new int[capacity];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nMảng vừa nhập là:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
        // nam béo
    }
}
